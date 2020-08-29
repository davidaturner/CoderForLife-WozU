using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using PartyRSVP.Models;

namespace PartyRSVP.Controllers {
    public class HomeController : Controller {
        private readonly ILogger<HomeController> _logger;

        public HomeController (ILogger<HomeController> logger) {
            _logger = logger;
        }

        public IActionResult Index () {
            return View ();
        }

        public ViewResult Rsvp () {
            return View ("Rsvp");
        }

        [HttpPost]
        public ViewResult RsvpForm (GuestResponse guestResponse) {
            return (guestResponse.WillAttend == true) ?
                View ("Thanks", guestResponse) :
                View ("Sorry", guestResponse);
        }
    }
}