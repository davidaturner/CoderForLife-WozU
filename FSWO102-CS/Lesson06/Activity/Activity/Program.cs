using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Activity.Transportation.Vehicles;

namespace Activity
{
    namespace Transportation {

        namespace Vehicles {

            class Auto {
                public string make;
                public string model;

                public Auto () :this("","") {
                }
                public Auto(string make, string model) {
                    this.make = make;
                    this.model = model;
                }
            }
        }
    }

    // nested namespace
    namespace NestedNamespace
    {
        class MyExample
        {
            public static void Print()
            {
                Console.WriteLine("Calling nestednamespace member.");
            }
        }
    }

    class MyExample
    {
        public static void Print()
        {
            Console.WriteLine("Calling namespace member.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            //RunExamples();

            Transportation.Vehicles.Auto myAuto = new Transportation.Vehicles.Auto("Subaru", "Forester");
            Console.WriteLine(myAuto.make + " "  + myAuto.model);

            //using Activity.Transportation.Vehicles
            Auto myOtherAuto = new Auto("Toyota", "Camry");
            Console.WriteLine(myOtherAuto.make + " " + myOtherAuto.model);

            Console.WriteLine("\r\nDONE!");
            Console.ReadLine();
        }

        public static void RunExamples () {

             // Unnecessary to use Activity here.
            Activity.MyExample.Print();
            Activity.NestedNamespace.MyExample.Print();
            NestedNamespace.AnotherExample.Print();

            NestedNamespace.FinalExample.Print();
            Activity.NewNestedNamespace.MyExample.Print();
            Activity.MyPersonal.Print(); 

            // Not a class method in Activity.
            PrivateNamespace.MyExample.Print();       
        }
    }
}

// same namespace as nested namespace above
namespace Activity.NestedNamespace
{
    class AnotherExample
    {
        public static void Print()
        {
            Console.WriteLine("Calling anotherexample nestednamespace member.");
        }
    }
}
