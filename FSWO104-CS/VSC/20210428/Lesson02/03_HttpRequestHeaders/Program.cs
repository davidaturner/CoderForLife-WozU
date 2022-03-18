var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// app.MapGet("/", () => "Hello World!");
app.MapGet("/",

async (context) =>
{
    string response = "<h1>HTTP Request Headers</h1>";
    foreach (var requestHeader in context.Request.Headers)
    {
        response += "<p>" + requestHeader + "</p>";
    }
    await context.Response.WriteAsync(response);
});

app.Run();
