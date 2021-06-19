using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Array
{
    class Program
    {
        public static class Array
        {
            public static int FAB_FOUR = 4;

            public static string[] theBeatles ()
            {
                string John = "John";
                string Paul = "Paul";
                string Ringo = "Ringo";
                string George = "George";
                
                string[] theBeatles = new string[FAB_FOUR];
                theBeatles[0] = John;
                theBeatles[1] = Paul;
                theBeatles[2] = Ringo;
                theBeatles[3] = George;

                return theBeatles;
            }
            public static string[] theBeatles2()
            {
                string[] theBeatles = new string[] { "John", "Paul", "Ringo", "George" };
                return theBeatles;
            }
            public static void display(string[] arr)
            {
                Console.WriteLine(arr[0]);
                Console.WriteLine(arr[1]);
                Console.WriteLine(arr[2]);
                Console.WriteLine(arr[3]);
                Console.WriteLine();
            }
            public static void display(int[] arr)
            {
                Console.WriteLine(arr[0]);
                Console.WriteLine(arr[1]);
                Console.WriteLine(arr[2]);
                Console.WriteLine(arr[3]);
                Console.WriteLine(arr[4]);
                Console.WriteLine();
            }
            public static string[] theGroceries()
            {
                string[] theGroceries = new String[] { "bread", "eggs", "milk", "tea"};
                return theGroceries;
            }
            public static int[] theTemperatures()
            {
                int[] theTemperatures = new int[] {120, 122, 121, 118, 119 };
                return theTemperatures;
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, Beatles!");
            Console.WriteLine();

            // Beatles
            Array.display(Array.theBeatles());
            Array.display(Array.theBeatles2());
            Console.WriteLine("Welcome! The " + Array.theBeatles().Length + " of you!");
            Console.WriteLine();

            // Groceries
            Array.display(Array.theGroceries());
            Console.WriteLine(Array.theGroceries()[1]);
            Console.WriteLine();
            string[] groceries = Array.theGroceries();
            groceries[1] = "beans";
            Array.display(groceries);

            // Temperatures
            Array.display(Array.theTemperatures());
            int[] temperatures = Array.theTemperatures();
            Console.WriteLine(temperatures[0]);
            Console.WriteLine(temperatures[4]);

            //
            Console.ReadLine();
        }
    }
}
