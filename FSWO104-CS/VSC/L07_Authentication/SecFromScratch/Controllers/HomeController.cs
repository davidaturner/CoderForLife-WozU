using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Logging;
using SecFromScratch.Models;
using SecFromScratch.Services;

namespace SecFromScratch.Controllers {
    public class HomeController : Controller {
        private readonly ILogger<HomeController> _logger;
        private readonly AppDbContext _context;

        public HomeController (ILogger<HomeController> logger, AppDbContext context) {
            _logger = logger;
            _context = context;
        }

        public IActionResult Index () {
            return View ();
        }

        public IActionResult Privacy () {
            return View ();
        }

        [HttpGet]
        public IActionResult Login () {
            return View ();
        }

        [HttpGet]
        public IActionResult Treats () {
            return View ();
        }

        [HttpGet]
        public IActionResult LoginFail () {
            return View ();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create (User user) {

            if (ModelState.IsValid) {
                // Hash the password
                user.Password = ManualAuth.Sha256 (user.Password);
                // Now add.
                _context.Add (user);
                await _context.SaveChangesAsync ();
                return RedirectToAction (nameof (Welcome));
            }
            return View (user);
        }

        public IActionResult Welcome () {
            return View ();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Verify (User user) {

            if (ModelState.IsValid) {
                // attempt to get a user with the matching username from DB.
                User GetUser = await _context.Users.SingleOrDefaultAsync (u => u.UserName == user.UserName);
                // if no match on username skip password check.
                if (GetUser != null) {
                    // compare hashed passwords.
                    if (ManualAuth.Sha256Check (user.Password, GetUser.Password)) {
                        // if password match is true return treats.
                        return RedirectToAction (nameof (Treats));
                    }
                }
            }
            return RedirectToAction (nameof (LoginFail));
        }

        [ResponseCache (Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error () {
            return View (new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}