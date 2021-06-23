using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using CarType1 = _01_Inheritance.vehicleType1.CarType1;
using TruckType1 = _01_Inheritance.vehicleType1.TruckType1;

namespace _01_Inheritance
{
    class Activity
    {
        public static void Part1()
        {
            CarType1 newCar = new CarType1("AcmeCar", "Black", true, 15, 10);
            newCar.printVehicleDetails();
            Console.WriteLine("{0} has a Trunk Width of {1}", newCar.Make, newCar.TrunkWidth);

            TruckType1 newTruck = new TruckType1("AcmeTruck", "White", false, 25, 20);
            newTruck.printVehicleDetails();
            Console.WriteLine("{0} has a Flatbed Length of {1}", newTruck.Make, newTruck.FlatbedLength);

            Console.WriteLine();
        }

        public static void Part2()
        {
            Vehicle newVehicle = new Vehicle("AcmeVehicle", "Grey", 5);
            newVehicle.IsRunning = true;
            newVehicle.printVehicleDetails();

            Car newCar = new Car("AcmeCar", "Black", 15, 10);
            newCar.IsRunning = true;
            newCar.printVehicleDetails();
            Console.WriteLine("{0} has a Trunk Width of {1}", newCar.Make, newCar.TrunkWidth);

            Truck newTruck = new Truck("AcmeTruck", "White", 25, 20);
            newTruck.printVehicleDetails();
            Console.WriteLine("{0} has a Flatbed Length of {1}", newTruck.Make, newTruck.FlatbedLength);

            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * The Black AcmeCar has a fuel level of 15. Is it running? false
             * The White AcmeTruck has a fuel level of 25. Is it running? false
             */
            Activity.Part1();

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
