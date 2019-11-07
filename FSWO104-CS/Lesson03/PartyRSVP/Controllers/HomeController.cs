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

        public ViewResult Index () {
            return View ("Rsvp");
        }

        [HttpPost]
        public ViewResult RsvpForm (GuestResponse guestResponse) {
            // Todo: Store guest response, covered in later lessons
            return View ("Thanks", guestResponse);
        }
    }
}