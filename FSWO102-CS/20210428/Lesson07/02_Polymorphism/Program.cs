using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Vehicle = _01_Inheritance.vehicle.Vehicle;
using Car = _01_Inheritance.vehicle.Car;
using Truck = _01_Inheritance.vehicle.Truck;

namespace _01_Inheritance
{
    class Activity
    {
        public static void Part2()
        {
            Vehicle newVehicle = new Vehicle("AcmeVehicle", "Grey", 5);

            Car newCar = new Car("AcmeCar", "Black", 15, 10);

            Truck newTruck = new Truck("AcmeTruck", "White", 25, 20);

            Vehicle.printVehicleColor(newVehicle);
            Vehicle.printVehicleColor(newCar);
            Vehicle.printVehicleColor(newTruck);

            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * The Grey AcmeVehicle has a fuel level of 5. Is it running? true
             * The Black AcmeCar has a fuel level of 15. Is it running? true
             * The White AcmeTruck has a fuel level of 25. Is it running? false
            */
            Activity.Part2();

            //
            Console.ReadLine();
        }
    }
}
