using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

namespace HandsOnL02
{
    public class Startup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services) { }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            app.Run(async (context) =>
            {
                string response = "<h1>Query String Parameters</h1>" +
                    "<p>Enter a URL like:</p>" +
                    "<a href=\"http://localhost:5000/?firstname=Jane&lastname=Smith&age=30\">" +
                    "http://localhost:5000/?firstname=Jane&lastname=Smith&age=30</a>";
                // foreach (var queryParameter in context.Request.Query) {
                //     response += "<p>" + queryParameter + "</p>";
                // }
                string firstName = context.Request.Query["firstName"];
                string lastName = context.Request.Query["lastName"];
                string age = context.Request.Query["age"];

                if ((firstName != null && firstName.Count() > 0) ||
                    (lastName != null && lastName.Count() > 0))
                {

                    response += "<p><b>Address changed to:</b></p>" +
                        "<p>" + buildFullContact(firstName, lastName, age) + "</p>" +
                        "<p>Now press F5 to view Cookie.</p>";
                }
                else
                {
                    firstName = "David"; // default
                    lastName = "Turner"; // default
                    age = "" + 30;

                    response += "<p><b>Using default:</b></p>" +
                        "<p>" + buildFullContact(firstName, lastName, age) + "</p>" +
                        "<p>Update URL address or Press F5 to view Cookie.</p>";
                }

                var cookie = context.Request.Cookies["MyCoolLittleCookie"];
                response += "<h1>HTTP Cookies</h1>";
                if (string.IsNullOrWhiteSpace(cookie))
                {
                    DateTime now = DateTime.Now;
                    DateTime expires = now + TimeSpan.FromSeconds(15);
                    context.Response.Cookies.Append(
                        "MyCoolLittleCookie",
                        "Cookie created at: " + now.ToString("h:mm:ss tt") + " for " +
                        buildFullContact(firstName, lastName, age),
                        new CookieOptions
                        {
                            Path = "/",
                            HttpOnly = false,
                            Secure = false,
                            Expires = expires
                        }
                    );
                    response += $"<p>Cookie sent!</p>";
                }
                else
                {
                    response +=
                        $"<p>This is the cookie value received from browser:\"<strong>{cookie}</strong>\".</p>" +
                        "<p>Cookie expires after 15 seconds.</p>";
                }

                await context.Response.WriteAsync(response);
            });
            // app.Run (async (context) => {
            //     string response = "<h1>Query String Parameters</h1>" +
            //         "<p>Enter a URL like:</p>" +
            //         "<a href=\"http://localhost:5000/?firstname=Jane&lastname=Smith&age=30\">" +
            //         "http://localhost:5000/?firstname=Jane&lastname=Smith&age=30</a>";
            //     foreach (var queryParameter in context.Request.Query) {
            //         response += "<p>" + queryParameter + "</p>";
            //     }
            //     await context.Response.WriteAsync (response);
            // });
            // app.Run (async (context) => {
            //     var cookie = context.Request.Cookies["MyCoolLittleCookie"];

            //     if (string.IsNullOrWhiteSpace (cookie)) {
            //         DateTime now = DateTime.Now;
            //         DateTime expires = now + TimeSpan.FromSeconds (15);
            //         context.Response.Cookies.Append (
            //             "MyCoolLittleCookie",
            //             "Cookie created at: " + now.ToString ("h:mm:ss tt"),
            //             new CookieOptions {
            //                 Path = "/",
            //                     HttpOnly = false,
            //                     Secure = false,
            //                     Expires = expires
            //             }
            //         );
            //     }

            //     string response =
            //         "<h1>HTTP Cookies</h1>" +
            //         $"<p>This is the cookie value received from browser: \"<strong>{cookie}</strong>\".</p>" +
            //         "<p>Refresh page to see current cookie value...</p>" +
            //         "<p>Cookie expires after 15 seconds.</p>";
            //     await context.Response.WriteAsync (response);
            // });
        }

        private string buildFullContact(string firstName, string lastName, string age)
        {
            String response = firstName;
            response += (lastName != null && lastName.Count() > 0) ? " " + lastName : "";
            response += (age != null && age.Count() > 0) ? ", " + age : "";

            return response;
        }

    }
}