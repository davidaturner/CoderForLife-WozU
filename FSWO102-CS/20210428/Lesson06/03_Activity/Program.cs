using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Auto = _03_Activity.Transportation.Vehicles.Auto;
using Widget = _03_Activity.MyObject.Widget;
using Exercise = _03_Activity.Exercise;

namespace _03_Activity
{
    namespace Transportation
    {
        namespace Vehicles
        {
            class Auto
            {
                public Auto() : this("", "") { }
                public Auto(string make, string model)
                {
                    Make = make;
                    Model = model;
                }
                public string Make { get; set; }
                public string Model { get; set; }

                public override string ToString()
                {
                    return "I drive a " + Make + " " + Model + "!";
                }
            }
        }
    }

    namespace MyObject
    {
        public class Widget {
            public int viewed;
            public Widget()
            {
                this.viewed = 0;
            }
        }
    }

    namespace Exercise
    {
        class Test
        {
            public static void TestWidget(Widget widget)
            {
                ++widget.viewed;
            }
        }
    }

    class Activity
    {
        public static void Part1()
        {
            Auto auto = new Transportation.Vehicles.Auto();
            auto.Make = "Subaru";
            auto.Model = "Forester";

            Auto auto2 = new Auto("Honda", "Civic");

            Console.WriteLine(auto.ToString());
            Console.WriteLine(auto2.ToString());
            Console.WriteLine();
        }

        public static void Part2()
        {
            Widget widget = new Widget();
            for(int i=0; i<10; i++)
            {
                Exercise.Test.TestWidget(widget);
                Console.WriteLine(widget.viewed);
            }
            Console.WriteLine();
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            Activity.Part1();
            Activity.Part2();
            //
            Console.ReadLine();

        }
    }
}
