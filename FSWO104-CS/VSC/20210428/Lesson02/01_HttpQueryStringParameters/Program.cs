var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// app.MapGet("/", () => "Hello World!");
app.MapGet("/",
    async (context) =>
{
    string response = "<h1>Query String Parameters</h1>" +
        "<p>Enter a URL like:</p>" +
        "<a href=\"https://localhost:7277/?firstname=Jane&lastname=Smith&age=30\">" +
        "https://localhost:7277/?firstname=Jane&lastname=Smith&age=30</a>";
    foreach (var queryParameter in context.Request.Query)
    {
        response += "<p>" + queryParameter + "</p>";
    }
    await context.Response.WriteAsync(response);
});

app.Run();
// app.Run(async (context) =>
// {
//     string response = "<h1>Query String Parameters</h1>" +
//         "<p>Enter a URL like:</p>" +
//         "<a href=\"https://localhost:7277/?firstname=Jane&lastname=Smith&age=30\">" +
//         "https://localhost:7277/?firstname=Jane&lastname=Smith&age=30</a>";
//     foreach (var queryParameter in context.Request.Query)
//     {
//         response += "<p>" + queryParameter + "</p>";
//     }
//     await context.Response.WriteAsync(response);
// });

