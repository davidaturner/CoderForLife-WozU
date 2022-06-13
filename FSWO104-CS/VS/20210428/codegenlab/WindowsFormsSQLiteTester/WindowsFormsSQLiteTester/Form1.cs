using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SQLite;
using System.Diagnostics;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsSQLiteTester
{
    public partial class Form1 : Form
    {
        string path = "data_table.db";
        string cs = @"URI=file:" + Application.StartupPath + "\\data_table.db";

        /*
        SQLiteConnection con;
        SQLiteCommand cmd;
        SQLiteDataReader dr;
        */

        public Form1()
        {
            InitializeComponent();
        }

        private void data_show()
        {
            var con = new SQLiteConnection(cs);
            con.Open();

            string stm = "SELECT * FROM test";
            var cmd = new SQLiteCommand(stm, con);

            SQLiteDataReader dr = cmd.ExecuteReader();

            while(dr.Read())
            {
                dataGridView1.Rows.Insert(0, dr.GetString(0), dr.GetString(1));
            }
        }

        private void create_db()
        {
            if (!System.IO.File.Exists(path))
            {
                SQLiteConnection.CreateFile(path);
                using(var sqlite = new SQLiteConnection(@"Data Source=" + path))
                {
                    sqlite.Open();

                    string sql = "CREATE TABLE test(testName varchar(20), testId varchar(12))";
                    SQLiteCommand command = new SQLiteCommand(sql, sqlite);
                    command.ExecuteNonQuery();
                }
            }
            else
            {
                Console.WriteLine("Database was not created.");
                return;
            }
        }
        private void InsertBtn_Click(object sender, EventArgs e)
        {
            var con = new SQLiteConnection(cs);
            con.Open();
            var cmd = new SQLiteCommand(con);

            try
            {
                cmd.CommandText = "INSERT INTO test(testName,testId) VALUES(@testName,@testId)";

                string NAME = NameText.Text;
                string ID = IdText.Text;

                cmd.Parameters.AddWithValue("@testName", NAME);
                cmd.Parameters.AddWithValue("@testId", ID);
 
                dataGridView1.ColumnCount = 2;
                /*
                dataGridView1.Columns[0].HeaderText = "Name";
                dataGridView1.Columns[1].HeaderText = "Id";
                */
                string[] row = new string[] { NAME, ID };
                dataGridView1.Rows.Add(row);

                cmd.ExecuteNonQuery();
            }
            catch(Exception)
            {
                Console.WriteLine("Unable to insert!");
                return;
            }

        }

        private void UpdateBtn_Click(object sender, EventArgs e)
        {
            var con = new SQLiteConnection(cs);
            con.Open();
            var cmd = new SQLiteCommand(con);

            try
            {
                cmd.CommandText = "UPDATE test Set testId=@testId where testName = @testName";

                string NAME = NameText.Text;
                string ID = IdText.Text;

                cmd.Prepare();
                cmd.Parameters.AddWithValue("@testName", NAME);
                cmd.Parameters.AddWithValue("@testId", ID);

                cmd.ExecuteNonQuery();
                dataGridView1.Rows.Clear();
                data_show();


            }
            catch (Exception)
            {
                Console.WriteLine("Unable to update!");
                return;
            }
        }

        private void DeleteBtn_Click(object sender, EventArgs e)
        {
            var con = new SQLiteConnection(cs);
            con.Open();
            var cmd = new SQLiteCommand(con);

            try
            {
                cmd.CommandText = "DELETE FROM test where testName=@testName";
                cmd.Prepare();

                string NAME = NameText.Text;
                string ID = IdText.Text;

                cmd.Parameters.AddWithValue("@testName", NAME);

                cmd.ExecuteNonQuery();
                dataGridView1.Rows.Clear();
                data_show();

            }
            catch (Exception)
            {
                Console.WriteLine("Unable to insert!");
                return;
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.Rows[e.RowIndex].Cells[e.ColumnIndex].Value != null)
            {
                dataGridView1.CurrentRow.Selected = true;
                NameText.Text = dataGridView1.Rows[e.RowIndex].Cells["testName"].FormattedValue.ToString();
                IdText.Text = dataGridView1.Rows[e.RowIndex].Cells["testId"].FormattedValue.ToString();
            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            create_db();
        }

    }
}
