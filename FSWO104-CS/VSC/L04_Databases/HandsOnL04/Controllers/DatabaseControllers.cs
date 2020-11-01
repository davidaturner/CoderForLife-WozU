

using System;
using System.Collections.Generic;
using System.IO;
using HandsOnL04.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Data.Sqlite;

namespace HandsOnL04.Controllers {

    [Route("api/[Controller]")]
    public class CustomersController : Controller {

        [HttpGet]
        public List<Customer> getCustomers() {

            string databasefile = "chinook.db";
            // string sqlQuery = "select * customers limit 20;";

            List<Customer>customers = null;
            Console.WriteLine("");
            Console.WriteLine("In getCustomers()");
            SQliteCustomersReader customerReader = new SQliteCustomersReader();
            customerReader.OpenConnection(databasefile);
            customerReader.CloseConnection();
            Console.WriteLine("Out getCustomers()");
            Console.WriteLine("");
            return customers;
        }
    }

    [Route("api/[Controller]")]
    public class EmployeesController : Controller {

        [HttpGet]
        public List<Employee> getEmployees() {
           List<Employee>employees = new List<Employee>();

            string datasource = "Data Source=" + Path.GetFullPath("chinook.db");

            using(SqliteConnection conn = new SqliteConnection(datasource)) {

                conn.Open();

                string sql = $"select * from employees where HireDate < '2013-01-01';";

                using(SqliteCommand command = new SqliteCommand(sql, conn)) {

                    using(SqliteDataReader reader = command.ExecuteReader()) {

                        while(reader.Read()) {

                            Employee emp = new Employee() {
                                Id = reader.GetInt32(
                                    reader.GetOrdinal("EmployeeId")),
                                FirstName = reader.GetString(
                                    reader.GetOrdinal("FirstName")),
                                LastName = reader.GetString(
                                    reader.GetOrdinal("LastName")
                                ),
                                Title = reader.GetString(
                                    reader.GetOrdinal("Title")
                                ),
                                ReportsTo = (!reader.IsDBNull(
                                    reader.GetOrdinal("ReportsTo")
                                )) ?reader.GetInt32(
                                    reader.GetOrdinal("ReportsTo")
                                ):0,
                                BirthDate = reader.GetDateTime(
                                    reader.GetOrdinal("BirthDate")
                                ),
                                HireDate = reader.GetDateTime(
                                    reader.GetOrdinal("HireDate")
                                ),
                                Address = reader.GetString(
                                    reader.GetOrdinal("Address")
                                ),
                                City = reader.GetString(
                                    reader.GetOrdinal("City")
                                ),
                                State = reader.GetString(
                                    reader.GetOrdinal("State")
                                ),
                                Country = reader.GetString(
                                    reader.GetOrdinal("Country")
                                ),
                                PostalCode = reader.GetString(
                                    reader.GetOrdinal("PostalCode")
                                ),
                                Phone = reader.GetString(
                                    reader.GetOrdinal("Phone")
                                ),
                                Fax = reader.GetString(
                                    reader.GetOrdinal("Fax")
                                ),
                                Email = reader.GetString(
                                    reader.GetOrdinal("Email")
                                )
                            };

                            if (emp.ReportsTo == 0) {
                                emp.ReportsTo = null;
                            }

                            employees.Add(emp);
                        }
                    }
                }

                conn.Close();
            }
            return employees;
        }
    }

}