using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Logical
{
    class Program
    {
        public static class Logical
        {
            public static string hungry(bool isHungry, bool isRestaurantOpen)
            {
                if ( isHungry && isRestaurantOpen )
                {
                    return "Great! Let's go eat!";
                }
                else if ( isRestaurantOpen ) {

                    return "Cool. Maybe I will go later.";
                }

                return "Restaurant closed? Ok, I wasn't hungry anyway";
            }

            public static string sleepy(bool isSleepy, bool atLibrary)
            {
                if (isSleepy || atLibrary )
                {
                    return "You should go home and sleep.";
                }

                return "Maybe stay at the library a bit longer.";
            }

            public static string thirsty(bool isThirsty)
            {
                if (!isThirsty)
                {
                    return "Buy a bottled water for later.";
                }

                return "Drink your bottled water.";
            }

            public static string consumer(bool isRestaurantOpen, bool isHungry, bool isThirsty)
            {
                // order of precedent
                if ( isRestaurantOpen && (isHungry || isThirsty))
                {
                    return "Go the restaurant and hang out.";
                }

                return "Go home, no point hanging out.";
            }

            public static string comparator(int a, int b)
            {
                if (a < b)
                {
                    return "a is less than b";
                }
                else if (a <= b)
                {
                    return "a is less than or equal to b";
                }
                else
                {
                    return "a is not less than nor equal to b";
                }
            }

        }
        static void Main(string[] args)
        {
            bool isHungry = true;
            bool isRestaurantOpen = true;
            bool isSleepy = true;
            bool atLibrary = true;
            bool isThirsty = true;

            // AND operator
            Console.WriteLine(Logical.hungry(isHungry, isRestaurantOpen));

            Console.WriteLine(Logical.hungry(isHungry, false));

            Console.WriteLine(Logical.hungry(false, isRestaurantOpen));

            Console.WriteLine(Logical.hungry(false, false));
            Console.WriteLine();

            // OR operator
            Console.WriteLine(Logical.sleepy(isSleepy, atLibrary));

            Console.WriteLine(Logical.sleepy(isSleepy, false));

            Console.WriteLine(Logical.sleepy(false, atLibrary));

            Console.WriteLine(Logical.sleepy(false, false));
            Console.WriteLine();

            // NOT operator
            Console.WriteLine(Logical.thirsty(isThirsty));

            Console.WriteLine(Logical.thirsty(false));
            Console.WriteLine();

            // Order of precedent
            Console.WriteLine(Logical.consumer(isRestaurantOpen, isHungry, false));

            Console.WriteLine(Logical.consumer(isRestaurantOpen, isHungry, isThirsty));

            Console.WriteLine(Logical.consumer(isRestaurantOpen, false, false));

            Console.WriteLine(Logical.consumer(false, isHungry, isThirsty));

            Console.WriteLine(Logical.consumer(false, false, isThirsty));
            Console.WriteLine();

            // Comparator
            Console.WriteLine(Logical.comparator(2, 5));

            Console.WriteLine(Logical.comparator(5, 5));

            Console.WriteLine(Logical.comparator(5, 2));
            Console.WriteLine();

            //
            Console.ReadLine();
        }
    }
}
