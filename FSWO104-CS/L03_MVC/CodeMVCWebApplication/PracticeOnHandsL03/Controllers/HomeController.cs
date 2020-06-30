using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using PracticeOnHandsL03.Models;

namespace PracticeOnHandsL03.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View(); // return View("Contact");
        }

        public IActionResult Rsvp()
        {
            return View();
        }

        [HttpPost]
        public ViewResult RsvpForm(GuestResponse guestResponse)
        {
            // Todo: Store guest response, covered in later lessons
            return View("Thanks", guestResponse);
        }
    }
}
