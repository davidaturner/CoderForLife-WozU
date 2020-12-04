using System.Collections.Generic;
using System.Security.Claims;
using Microsoft.AspNetCore.Authentication;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace WebAuthExampleEpOne
{
    public class HomeController : Controller
    {
        /* Open Dev Tools and go to Application tab->Cookies. */
        public IActionResult Index() {
            return View();
        }

        /* Go to this URL and check Application tab->Cookies.*/
        /* You should see Grandmas.Cookies listed. */
        [Authorize]
        public IActionResult Privacy() {
            return View();
        }

        public IActionResult Authenticate() {

            var joesantosClaims = new List<Claim>() {
                new Claim(ClaimTypes.Name, "joe.santos"),
                new Claim(ClaimTypes.Email, "joesantos38@earthlink.net"),
                new Claim("joe.says", "my dude!"),
            };
            var joesantosIdentity = new ClaimsIdentity( joesantosClaims, "Joe Santos Identity");

            var joecoolClaims = new List<Claim>() {
                new Claim(ClaimTypes.Name, "joe.cool"),
                new Claim("thepoint", "there is no point"),
            };
            var joecoolIdentity = new ClaimsIdentity( joecoolClaims, "Joe Cool Identity");

            var joedethIdentity = new ClaimsIdentity( 

                    new List<Claim>() {
                        new Claim(ClaimTypes.Name, "joe.deth"),
                        new Claim("The.Way", "This is the Way")},

                    "Joe Deth Identity");

            var userPrincipal = new ClaimsPrincipal( new[] { 
                        new ClaimsIdentity( joesantosClaims, "Joe Santos Identity"), 
                        new ClaimsIdentity( joecoolClaims, "Joe Cool Identity"),
                                    joedethIdentity });

            HttpContext.SignInAsync(userPrincipal);
            
            return RedirectToAction("Index");
        }
    }
}