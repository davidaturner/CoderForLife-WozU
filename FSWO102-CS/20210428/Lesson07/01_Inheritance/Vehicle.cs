using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VehicleType2 = _01_Inheritance.vehicleType2.VehicleType2;
using CarType2 = _01_Inheritance.vehicleType2.CarType2;
using TruckType2 = _01_Inheritance.vehicleType2.TruckType2;

namespace _01_Inheritance
{
    public class Vehicle : VehicleType2
    {
        public Vehicle(string make, string color, int fuelLevel)
            : base(make, color, fuelLevel) { }

    }
    public class Car : CarType2
    {
        public Car(string make, string color, int fuelLevel, int trunkWidth)
            : base(make, color, fuelLevel, trunkWidth) { }
    }
    public class Truck : TruckType2
    {
        public Truck(string make, string color, int fuelLevel, int flatbedLength)
            : base(make, color, fuelLevel, flatbedLength) { }
    }

}
