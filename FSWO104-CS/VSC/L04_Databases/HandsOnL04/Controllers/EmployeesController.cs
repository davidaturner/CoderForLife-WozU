using System;
using System.Collections.Generic;
using System.IO;
using HandsOnL04.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Data.Sqlite;

namespace HandsOnL04.Controllers {

    [Route ("api/[controller]")]
    public class EmployeesController : Controller {

        [HttpGet]
        public IActionResult Employees () {
            return View (getEmployees ());
        }

        private List<Employee> getEmployees () {
            Console.WriteLine ("");
            Console.WriteLine ("In getEmployees()");

            string databasefile = "chinook.db";
            string sqlQuery = "select * from employees where HireDate < '2003-01-01';";
            List<Employee> employees = null;

            SqliteEmployeesReader employeesReader =
                new SqliteEmployeesReader ();
            employeesReader.OpenReader (databasefile, sqlQuery);

            employees = employeesReader.getEmployees ();

            employeesReader.CloseReader ();

            Console.WriteLine ("Out getEmployees()");
            Console.WriteLine ("");

            return employees;
        }
    }

    class SqliteEmployeesReader : SqliteTableReader {

        public List<Employee> getEmployees () {
            List<Employee> employees = new List<Employee> ();

            while (ReadNext ()) {
                Employee emp = new Employee () {
                    Id = GetInt32 ("EmployeeId"),
                    LastName = GetString ("LastName"),
                    FirstName = GetString ("FirstName"),
                    Title = GetString ("Title"),
                    ReportsTo = GetInt32 ("ReportsTo"),
                    BirthDate = GetDateTime ("BirthDate"),
                    HireDate = GetDateTime ("HireDate"),
                    Address = GetString ("Address"),
                    City = GetString ("City"),
                    State = GetString ("State"),
                    Country = GetString ("Country"),
                    PostalCode = GetString ("PostalCode"),
                    Phone = GetString ("Phone"),
                    Fax = GetString ("Fax"),
                    Email = GetString ("Email")
                };

                if (emp.ReportsTo == 0) {
                    emp.ReportsTo = null;
                };
                employees.Add (emp);
            };
            return employees;
        }
    }

}