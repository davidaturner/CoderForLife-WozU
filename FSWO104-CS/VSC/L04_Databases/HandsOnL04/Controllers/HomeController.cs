using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using HandsOnL04.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

namespace HandsOnL04.Controllers {
    public class HomeController : Controller {
        private readonly ILogger<HomeController> _logger;

        public HomeController (ILogger<HomeController> logger) {
            _logger = logger;
        }

        public IActionResult Index () {
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
}