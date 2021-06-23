using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VehicleType1 = _01_Inheritance.vehicleType1.VehicleType1;

namespace _01_Inheritance
{
    namespace vehicleType2
    {
        public class VehicleType2 : VehicleType1
        {
            public VehicleType2(string make, string color, int fuelLevel)
            {
                Make = make;
                Color = color;
                IsRunning = false;
                FuelLevel = fuelLevel;
            }

            public string Make { get; set; }
            public string Color { get; set; }
            public bool IsRunning { get; set; }
            public int FuelLevel { get; set; }

            public void printVehicleDetails()
            {
                base.printVehicleDetails(Make, Color, IsRunning, FuelLevel);
            }
        }

        public class CarType2 : VehicleType2
        {
            public CarType2(string make, string color, int fuelLevel, int trunkWidth)
                : base(make, color, fuelLevel)

            {
                TrunkWidth = trunkWidth;
            }

            public int TrunkWidth { get; set; }
        }

        public class TruckType2 : VehicleType2
        {
            public TruckType2(string make, string color, int fuelLevel, int flatbedLength)
                : base(make, color, fuelLevel)
            {
                FlatbedLength = flatbedLength;
            }

            public int FlatbedLength { get; set; }
        }
    }
}
