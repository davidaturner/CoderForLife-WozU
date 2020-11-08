using System;
using System.Collections.Generic;
using System.IO;
using HandsOnL04.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Data.Sqlite;

namespace HandsOnL04.Controllers {

    [Route ("api/[controller]")]
    public class CustomersController : Controller {

        [HttpGet]
        public IActionResult Customers () {
            return View (getCustomers ());
        }

        private List<Customer> getCustomers () {
            Console.WriteLine ("");
            Console.WriteLine ("In getCustomers()");

            List<Customer> customers = null;
            string databasefile = "chinook.db";
            string sqlQuery = "select * from customers limit 20;";

            SqliteCustomersReader customerReader =
                new SqliteCustomersReader ();
            customerReader.OpenReader (databasefile, sqlQuery);

            customers = customerReader.getCustomers ();

            customerReader.CloseReader ();

            Console.WriteLine ("Out getCustomers()");
            Console.WriteLine ("");

            return customers;
        }
    }

    class SqliteCustomersReader : SqliteTableReader {

        public List<Customer> getCustomers () {
            List<Customer> customers = new List<Customer> ();

            while (ReadNext ()) {
                customers.Add (new Customer () {
                    Id = GetInt32 ("CustomerId"),
                        FirstName = GetString ("FirstName"),
                        LastName = GetString ("LastName"),
                        Company = GetString ("Company"),
                        Address = GetString ("Address"),
                        City = GetString ("City"),
                        State = GetString ("State"),
                        Country = GetString ("Country"),
                        PostalCode = GetString ("PostalCode"),
                        Phone = GetString ("Phone"),
                        Fax = GetString ("Fax"),
                        Email = GetString ("Email"),
                        SupportRepId = GetInt32 ("SupportRepId")
                });
            };
            return customers;
        }
    }

}