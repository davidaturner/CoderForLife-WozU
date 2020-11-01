using System;
using System.Collections.Generic;
using System.IO;
using HandsOnL04.Models;
using Microsoft.Data.Sqlite;

namespace HandsOnL04.Controllers {

    abstract class SQLTableReader {   
        protected string datafile;
        protected string sql;

        public virtual void OpenConnection(string datafile) {
            this.datafile = datafile;
            Console.WriteLine("DATAFILE= " + this.datafile);
        }
        public virtual void ExecuteQuery(string sql) {
            this.sql = sql;
            Console.WriteLine("SQL= " + this.sql);
        }
        public abstract bool IsReaderReady();
        public abstract bool Read();
        public abstract void CloseConnection();
    }

    abstract class SQliteTableReader : SQLTableReader {
         protected SqliteConnection connection;
         protected SqliteDataReader reader;

        public override void OpenConnection(string datafile) {
            base.OpenConnection(datafile);
            string datasource = "Data Source=" + Path.GetFullPath(this.datafile);
            Console.WriteLine("Using DATASOURCE= " + datasource);
            this.connection = new SqliteConnection(datasource); 
            Console.WriteLine("Opening CONNECTION= " + this.connection);     
        }
        public override void ExecuteQuery(string sql) {
            base.ExecuteQuery(sql);
            String sqlcmd = "$" + this.sql;
            Console.WriteLine("Building SQLCMD = " + sqlcmd);
            SqliteCommand command = new SqliteCommand(sqlcmd, connection);
            Console.WriteLine("COMMAND = " + command);
            this.reader = command.ExecuteReader();
            Console.WriteLine("READER = " + this.reader);
        }
        public override void CloseConnection() {
            if (reader != null) {
                Console.WriteLine("Closing READER = " + reader);
                reader.Close();
                reader = null;
            }
            if (connection != null) {
                Console.WriteLine("Closing CONNECTION = " + connection);
                connection.Close();
                connection = null;
            }
        }
        public override bool IsReaderReady()
        {
            return (reader != null);
        }
        public override bool Read() {
            Console.WriteLine("IsReaderReady() = " + IsReaderReady());
            return IsReaderReady()?reader.Read():false;
        }
    }

    class SQliteCustomersReader : SQliteTableReader {
        public List<Customer> getCustomers() {
            List<Customer>customers = new List<Customer>();
            while(Read()) {
                Customer cust = new Customer() {
                    Id = reader.GetInt32(0),
                    FirstName = reader.GetString(1),
                    LastName = reader.GetString(2),
                    Company = reader.GetValue(3).ToString(),
                    Address = reader.GetValue(4).ToString(),
                    City = reader.GetValue(5).ToString(),
                    State = reader.GetValue(6).ToString(),
                    County = reader.GetValue(7).ToString(),
                    PostalCode = reader.GetValue(8).ToString(),
                    Phone = reader.GetValue(9).ToString(),
                    Fax = reader.GetValue(10).ToString(),
                    Email = reader.GetString(11),
                    SupportRepId = reader.GetInt32(12)
                };

                customers.Add(cust);
            }
            return customers;
        }
    }

    class SQliteEmployeesReader : SQliteTableReader {
        public List<Employee> getEmployees() {
            return null;
        }
    }
}