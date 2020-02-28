using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

namespace PracticeHandsOnL02 {
    public class Startup {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices (IServiceCollection services) { }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure (IApplicationBuilder app, IWebHostEnvironment env) {
            app.Run (async (context) => {
                string response = "<h1>Query String Parameters</h1>" +
                    "<p>Enter a URL like:</p>" +
                    "<a href=\"http://localhost:5000/?firstname=Jane&lastname=Smith&age=30\">" +
                    "http://localhost:5000/?firstname=Jane&lastname=Smith&age=30</a>";

                var firstName = "";
                var lastName = "";
                int age = 0;
                foreach (var queryParameter in context.Request.Query) {
                    // response += "<p>" + queryParameter + "</p>";

                    if (queryParameter.Key.Equals ("firstname")) {
                        firstName = queryParameter.Value;
                        response += "<p>" + firstName + "</p>";
                    } else if (queryParameter.Key.Equals ("lastname")) {
                        lastName = queryParameter.Value;
                        response += "<p>" + lastName + "</p>";
                    } else if (queryParameter.Key.Equals ("age")) {
                        age = int.Parse (queryParameter.Value);
                        response += "<p>" + age + "</p>";
                    };
                }

                // if (firstName != "" || lastName != "" || age > 0) {

                //     var cookie = context.Request.Cookies["MyCoolLittleCookie"];

                //     if (string.IsNullOrWhiteSpace (cookie)) {
                //         DateTime now = DateTime.Now;
                //         DateTime expires = now + TimeSpan.FromSeconds (15);
                //         context.Response.Cookies.Append (
                //             "MyCoolLittleCookie",
                //             "Cookie created at: " +
                //             now.ToString ("h:mm:ss tt") +
                //             " for " + firstName + " " + lastName + ", " + age,
                //             new CookieOptions {
                //                 Path = "/",
                //                     HttpOnly = false,
                //                     Secure = false,
                //                     Expires = expires
                //             }
                //         );
                //     }
                // };

                // response +=
                //     "<h1>HTTP Cookies</h1>" +
                //     $"<p>This is the cookie value received from browser: \"<strong>{cookie}</strong>\".</p>" +
                //     "<p>Refresh page to see current cookie value...</p>" +
                //     "<p>Cookie expires after 15 seconds.</p>";

                await context.Response.WriteAsync (response);
            });
        }
    }
}