using Microsoft.AspNetCore.Mvc;
using PartyRSVP.Models;
using System.Diagnostics;

namespace PartyRSVP.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View("Rsvp");
        }

        [HttpPost]
        public ViewResult RsvpForm(GuestResponse guestResponse)
        {
            return (guestResponse.WillAttend == true) ?
                View("Thanks", guestResponse) :
                View("AwShucks", guestResponse);

        }
        /*
               public IActionResult Index()
                {
                    return View();
                }
        */
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}