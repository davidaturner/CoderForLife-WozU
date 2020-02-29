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
                string response = "<h1>HTTP Query String Parameters</h1>" +
                    "<p>Enter a URL like:</p>" +
                    "<a href=\"http://localhost:5000/?firstname=Jane&lastname=Smith&age=30\">" +
                    "http://localhost:5000/?firstname=Jane&lastname=Smith&age=30</a>";

                var firstName = "";
                var defaultFName = "David";
                var lastName = "";
                var defaultLName = "Turner";
                int age = 0;
                var defaultAge = 27;
                var doNotDefault = true;
                foreach (var queryParameter in context.Request.Query) {
                    // response += "<p>" + queryParameter + "</p>";

                    if (queryParameter.Key.Equals ("firstname")) {
                        firstName = queryParameter.Value;
                        if (firstName == null) {
                            firstName = defaultFName;
                        }
                        // response += "<p>" + firstName + "</p>";
                    } else if (queryParameter.Key.Equals ("lastname")) {
                        lastName = queryParameter.Value;
                        if (lastName == null) {
                            lastName = defaultLName;
                        }
                        // response += "<p>" + lastName + "</p>";
                    } else if (queryParameter.Key.Equals ("age")) {
                        String value = queryParameter.Value;
                        if (value == null) {
                            age = defaultAge;
                        } else {
                            age = int.Parse (value);
                        }
                        doNotDefault = false;
                        // response += "<p>" + age + "</p>";
                    };
                }

                var cookie = context.Request.Cookies["MyCoolLittleCookie"];

                if (!doNotDefault && string.IsNullOrWhiteSpace (cookie)) {
                    DateTime now = DateTime.Now;
                    DateTime expires = now + TimeSpan.FromSeconds (15);
                    String cookieCreated = "Cookie created at: " + now.ToString ("h:mm:ss tt");
                    if (!doNotDefault) {
                        cookieCreated += " for " + firstName + " " + lastName + ", " + age + ".";
                    }
                    context.Response.Cookies.Append (
                        "MyCoolLittleCookie",
                        cookieCreated,
                        new CookieOptions {
                            Path = "/",
                                HttpOnly = false,
                                Secure = false,
                                Expires = expires
                        }
                    );

                }

                response +=
                    "<h1>HTTP Cookies</h1>" +
                    $"<p>This is the cookie value received from browser: \"<strong>{cookie}</strong>\".</p>" +
                    "<p>Refresh page to see current cookie value...</p>" +
                    "<p>Cookie expires after 15 seconds.</p>";

                await context.Response.WriteAsync (response);
            });
        }
    }
}