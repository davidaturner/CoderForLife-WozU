namespace HandsOnL06.Models {
    public class Car {
        public int Id { get; set; }
        public string Year { get; set; }
        public string Make { get; set; }
        public string Model { get; set; }
        public int NumberOfPassengers { get; set; }

        public string Describe () => Id + ": " + Year + " " + Make + "  " + Model;

    }
}