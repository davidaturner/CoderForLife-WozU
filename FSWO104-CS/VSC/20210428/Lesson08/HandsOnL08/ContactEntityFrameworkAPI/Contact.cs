using System;

namespace ContactEntityFrameworkAPI
{

    public class Contact
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string Lastname { get; set; }

        public string GetFullName()
        {
            return this.FirstName + " " + this.Lastname;
        }
    }
    public class WeatherForecast
    {
        public DateTime Date { get; set; }

        public int TemperatureC { get; set; }

        public int TemperatureF => 32 + (int)(TemperatureC / 0.5556);

        public string Summary { get; set; }
    }
}