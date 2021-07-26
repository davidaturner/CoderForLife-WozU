using Microsoft.AspNetCore.Mvc;
using _02_HandsOn.Models;
using System;
using System.Collections.Generic;
using System.IO;
using Microsoft.Data.Sqlite;

namespace _02_HandsOn.Controllers
{
    [Route("api/[Controller]/[Action]")]
    public class DatabaseController : Controller
    {
        // api/database/customers
        // MVC is handling the routing for you.
        // [Route("api/[Controller]/[Action]")]
        public List<CustomerModel> Customers()
        {

            // customers will be populated with the result of the query.
            List<CustomerModel> customers = new List<CustomerModel>();

            // GetFullPath will complete the path for the file named passed in as a string.
            string dataSource = "Data Source=" + Path.GetFullPath("chinook.db");

            // using will make sure that the resource is cleaned from memory after it exists
            // conn initializes the connection to the .db file.
            using (SqliteConnection conn = new SqliteConnection(dataSource))
            {

                conn.Open();

                // sql is the string that will be run as an sql command
                string sql = $"select * from customers limit 20;";

                // command combines the connection and the command string and creates the query
                using (SqliteCommand command = new SqliteCommand(sql, conn))
                {

                    // reader allows you to read each value that comes back and do something to it.
                    using (SqliteDataReader reader = command.ExecuteReader())
                    {

                        // Read returns true while there are more rows to advance to. then false when done.
                        while (reader.Read())
                        {
                            // map the data to the model.
                            CustomerModel newCustomer = new CustomerModel()
                            {
                                Id = getInt32(reader, "CustomerId"),
                                FirstName = getString(reader, "FirstName"),
                                LastName = getString(reader, "LastName"),
                                Company = getString(reader, "Company"),
                                Address = getString(reader, "Address"),
                                City = getString(reader, "City"),
                                State = getString(reader, "State"),
                                Country = getString(reader, "Country"),
                                PostalCode = getString(reader, "PostalCode"),
                                Phone = getString(reader, "Phone"),
                                Fax = getString(reader, "Fax"),
                                Email = getString(reader, "Email"),
                                SupportRepId = getString(reader, "SupportRepId")
                            };

                            // add each one to the list.
                            customers.Add(newCustomer);
                        }
                    }
                }
                conn.Close();
            }
            return customers;
        }

        public Int32 getInt32(SqliteDataReader reader, string fieldname) {
            return ( ! reader.IsDBNull(reader.GetOrdinal(fieldname)))?
                    reader.GetInt32(reader.GetOrdinal(fieldname)): 0;
        }
        public Nullable<Int32> getNullableInt32(SqliteDataReader reader, string fieldname) {
            return ( ! reader.IsDBNull(reader.GetOrdinal(fieldname)))?
                    (Nullable<Int32>)(long)reader[reader.GetOrdinal(fieldname)]
                    : (Nullable<Int32>)null;
        }
        public DateTime getDateTime(SqliteDataReader reader, string fieldname) {
            return ( ! reader.IsDBNull(reader.GetOrdinal(fieldname)))?
                    reader.GetDateTime(reader.GetOrdinal(fieldname)): DateTime.Now;
        }
        public string getString(SqliteDataReader reader, string fieldname) {
            return ( ! reader.IsDBNull(reader.GetOrdinal(fieldname)))?
                    reader.GetString(reader.GetOrdinal(fieldname)): null;
        }

        // api/database/employees
        // MVC is handling the routing for you.
//        [Route("api/[Controller]/[Action]")]
        public List<EmployeeModel> Employees()
        {

            // employees will be populated with the result of the query.
            List<EmployeeModel> employees = new List<EmployeeModel>();

            // GetFullPath will complete the path for the file named passed in as a string.
            string dataSource = "Data Source=" + Path.GetFullPath("chinook.db");

            // using will make sure that the resource is cleaned from memory after it exists
            // conn initializes the connection to the .db file.
            using (SqliteConnection conn = new SqliteConnection(dataSource))
            {

                conn.Open();

                // sql is the string that will be run as an sql command
                string sql = $"select * from employees where HireDate < '2003-01-01';";

                // command combines the connection and the command string and creates the query
                using (SqliteCommand command = new SqliteCommand(sql, conn))
                {

                    // reader allows you to read each value that comes back and do something to it.
                    using (SqliteDataReader reader = command.ExecuteReader())
                    {

                        // Read returns true while there are more rows to advance to. then false when done.
                        while (reader.Read())
                        {
                            // map the data to the model.
                            EmployeeModel newEmployee = new EmployeeModel()
                            {
                                Id = getInt32(reader, "EmployeeId"),
                                LastName = getString(reader, "LastName"),
                                FirstName = getString(reader, "FirstName"),
                                Title = getString(reader, "Title"),
                                ReportsTo = getNullableInt32(reader, "ReportsTo"),
                                BirthDate = getDateTime(reader, "BirthDate"),
                                HireDate = getDateTime(reader, "HireDate"),
                                Address = getString(reader, "Address"),
                                City = getString(reader, "City"),
                                State = getString(reader, "State"),
                                Country = getString(reader, "Country"),
                                PostalCode = getString(reader, "PostalCode"),
                                Phone = getString(reader, "Phone"),
                                Fax = getString(reader, "Fax"),
                                Email = getString(reader, "Email")
                            };

                            // add each one to the list.
                            employees.Add(newEmployee);
                        }
                    }
                }
                conn.Close();
            }
            return employees;
        }
    }
}