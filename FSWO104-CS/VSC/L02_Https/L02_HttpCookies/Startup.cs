using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

namespace L02_HttpCookies
{
    public class Startup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            app.Run( async (context) => {

                var cookie = context.Request.Cookies["MyCoolLittleCookie"];

                if (string.IsNullOrWhiteSpace(cookie)) {

                    DateTime now = DateTime.Now;
                    DateTime expires = now + TimeSpan.FromSeconds(15);
                    context.Response.Cookies.Append (
                        "MyCoolLittleCookie",
                        "Cookie created at: " + now.ToString("h:mm:ss tt"),
                        new CookieOptions{
                            Path = "/",
                            HttpOnly = false,
                            Secure = false,
                            Expires = expires
                        }
                    );
                }

                String response = 
                    "<h1>Http Cookies</h1>" +
                    $"<p>This is the cookie value received from browser: \"<strong>{cookie}</strong>\".</p>" +
                    "<p>Refresh page to see the cookie value...</p> " +
                    "<p>Cookie expires after 15 seconds.</p>";
                await context.Response.WriteAsync(response);

            });
            // if (env.IsDevelopment())
            // {
            //     app.UseDeveloperExceptionPage();
            // }

            // app.UseRouting();

            // app.UseEndpoints(endpoints =>
            // {
            //     endpoints.MapGet("/", async context =>
            //     {
            //         await context.Response.WriteAsync("Hello World!");
            //     });
            // });
        }
    }
}
