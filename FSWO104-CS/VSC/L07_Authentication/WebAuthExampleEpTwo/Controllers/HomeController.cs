using System;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Mvc;

namespace WebAuthExampleEpTwo.Controllers {
    public class HomeController : Controller {

        private readonly UserManager<IdentityUser> _userManager;
        private readonly SignInManager<IdentityUser> _signInManager;

        public HomeController (UserManager<IdentityUser> userManager,
            SignInManager<IdentityUser> signInManager) {
            _userManager = userManager;
            _signInManager = signInManager;
        }

        public IActionResult Index () {
            return View ();
        }

        [Authorize]
        public IActionResult Privacy () {
            return View ();
        }

        public IActionResult Login () {
            return View ();
        }

        public IActionResult LoginSuccess () {
            return View ();
        }

        public IActionResult LoginFail () {
            return View ();
        }

        [HttpPost]
        public async Task<IActionResult> Login (string username, string password) {
            var user = await _userManager.FindByNameAsync (username);

            if (user != null) {

                var signInResult = _signInManager.PasswordSignInAsync (
                    user, password, false, false);

                if (signInResult.Result.Succeeded) {
                    return RedirectToAction ("LoginSuccess");
                }
            } else {
                return RedirectToAction ("LoginFail");
            }
            return RedirectToAction ("Index");
        }

        public IActionResult Register () {
            return View ();
        }

        [HttpPost]
        public async Task<IActionResult> Register (string username, string password) {
            var user = new IdentityUser {
                UserName = username
            };

            var result = await _userManager.CreateAsync (user, password);

            if (result.Succeeded) {

                var signInResult = _signInManager.PasswordSignInAsync (
                    user, password, false, false);

                if (signInResult.Result.Succeeded) {
                    return RedirectToAction ("Login");
                }
            }

            return RedirectToAction ("Index");
        }

        public async Task<IActionResult> Logout () {

            await _signInManager.SignOutAsync ();
            return RedirectToAction ("Index");
        }
    }
}