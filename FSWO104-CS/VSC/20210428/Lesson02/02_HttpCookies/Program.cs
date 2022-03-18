var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// app.MapGet("/", () => "Hello World!");
app.MapGet("/",

async (context) =>
{
    var cookie = context.Request.Cookies["MyCoolLittleCookie"];

    if (string.IsNullOrWhiteSpace(cookie))
    {
        DateTime now = DateTime.Now;
        DateTime expires = now + TimeSpan.FromSeconds(15);
        context.Response.Cookies.Append
        (
            "MyCoolLittleCookie",
            "Cookie created at: " + now.ToString("h:mm:ss tt"),
            new CookieOptions
            {
                Path = "/",
                HttpOnly = false,
                Secure = false,
                Expires = expires
            }
        );
    }

    string response =
        "<h1>HTTP Cookies</h1>" +
        $"<p>This is the cookie value received from browser: \"<strong>{cookie}</strong>\".</p>" +
        "<p>Refresh page to see current cookie value...</p>" +
        "<p>Cookie expires after 15 seconds.</p>";
    await context.Response.WriteAsync(response);
});

app.Run();
