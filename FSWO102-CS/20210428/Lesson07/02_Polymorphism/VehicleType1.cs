using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Inheritance
{
    namespace vehicleType1
    {
        public class VehicleType1
        {
            public void printVehicleDetails(string make, string color, bool isRunning, int fuelLevel)
            {
                Console.WriteLine("The " + color + " " + make + " has a fuel level of " + fuelLevel + ". Is it running? " + isRunning + "!");
            }
        }

        public class CarType1
        {
            public CarType1(string make, string color, bool isRunning, int fuelLevel, int trunkWidth)
            {
                Make = make;
                Color = color;
                IsRunning = isRunning;
                FuelLevel = fuelLevel;
                TrunkWidth = trunkWidth;
            }

            public string Make { get; set; }
            public string Color { get; set; }
            public bool IsRunning { get; set; }
            public int FuelLevel { get; set; }
            public int TrunkWidth { get; set; }

            public void printVehicleDetails()
            {
                (new VehicleType1()).printVehicleDetails(Make, Color, IsRunning, FuelLevel);
            }
        }

        public class TruckType1
        {
            public TruckType1(string make, string color, bool isRunning, int fuelLevel, int flatbedLength)
            {
                Make = make;
                Color = color;
                IsRunning = isRunning;
                FuelLevel = fuelLevel;
                FlatbedLength = flatbedLength;
            }

            public string Make { get; set; }
            public string Color { get; set; }
            public bool IsRunning { get; set; }
            public int FuelLevel { get; set; }
            public int FlatbedLength { get; set; }

            public void printVehicleDetails()
            {
                (new VehicleType1()).printVehicleDetails(Make, Color, IsRunning, FuelLevel);
            }
        }
    }
}
