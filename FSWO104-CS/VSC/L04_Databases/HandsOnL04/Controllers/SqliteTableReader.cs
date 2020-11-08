using System;
using System.Collections.Generic;
using System.IO;
using HandsOnL04.Models;
using Microsoft.Data.Sqlite;

namespace HandsOnL04.Controllers {
    abstract class SqliteTableReader {
        protected SqliteConnection connection;
        protected SqliteDataReader reader;

        public void OpenReader (string datafile, string query) {

            string datasource = null;
            SqliteCommand command = null;

            if (this.connection != null || this.reader != null) {
                CloseReader ();
            }

            try {
                datasource = "Data Source=" + Path.GetFullPath (datafile);

                this.connection = new SqliteConnection (datasource);
                connection.Open ();

                command = new SqliteCommand (query, connection);
                this.reader = command.ExecuteReader ();

            } catch (Exception e) {
                Console.WriteLine ("Unable to Open Reader");
                Console.WriteLine ("DATAFILE = " + datafile);
                Console.WriteLine ("QUERY = " + query);
            }
        }

        public bool ReadNext () {

            bool readSuccessful = false;
            try {
                readSuccessful = reader.Read ();
            } catch (Exception e) {
                Console.WriteLine ("Unable to Read Data");
                Console.WriteLine ("READER = " + this.reader);
            };

            return readSuccessful;
        }

        public void CloseReader () {

            try {
                reader.Close ();
                connection.Close ();
            } catch (Exception e) {
                Console.WriteLine ("Problems closing Reader");
            } finally {
                reader = null;
                connection = null;
            }
        }

        public bool IsDBNull (String fieldname) {
            return (reader != null) ?
                reader.IsDBNull (reader.GetOrdinal (fieldname)) : false;
        }

        public int GetInt32 (String fieldname) {
            return (reader != null && reader.IsDBNull (reader.GetOrdinal (fieldname))) ?
                0 :
                reader.GetInt32 (reader.GetOrdinal (fieldname));
        }

        public string GetString (String fieldname) {
            return (reader != null && reader.IsDBNull (reader.GetOrdinal (fieldname))) ?
                "" :
                reader.GetString (reader.GetOrdinal (fieldname));
        }

        public DateTime GetDateTime (String fieldname) {
            return reader.GetDateTime (reader.GetOrdinal (fieldname));
        }
    }
}