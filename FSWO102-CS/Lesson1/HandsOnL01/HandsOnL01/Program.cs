using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL01
{
    class Program
    {
        static void Main(string[] args)
        {
            RunPart3();
        }

        static void RunPart1()
        {
            // Part 1
            bool isSunny = true;

            string wear = "Wear sunglasses!";
            string dontWear = "You don't need to wear sunglasses.";

            if (isSunny == true)
            {
                Console.WriteLine(wear);
            }
            else
            {
                Console.WriteLine(dontWear);
            }
        }

        static void RunPart2()
        {
            // Part 1
            bool isSunny = true;

            string wear = "Wear sunglasses!";
            string dontWear = "You don't need to wear sunglasses.";

            // Part 2
            bool atBeach = true;

            string sunblock = "Sunblock is a good idea.";
            string noSunblock = "Sunblock isn't needed.";

            if (isSunny == true)
            {
                Console.WriteLine(wear);

                if (atBeach == true)
                {
                    Console.WriteLine(sunblock);
                }
                else
                {
                    Console.WriteLine(noSunblock);
                }
            }
            else
            {
                Console.WriteLine(dontWear);
            }
        }

        static void RunPart3()
        {
            // Part 1
            bool isSunny = false;

            string wear = "Wear sunglasses!";
            string dontWear = "You don't need to wear sunglasses.";

            // Part 2
            bool atBeach = true;

            string sunblock = "Sunblock is a good idea.";
            string noSunblock = "Sunblock isn't needed.";

            // Part 3
            bool goAnyway = true;

            string going = "Awesome! Glad you don't mind clouds!";
            string nextTime = "No worries! Hopefully next time we will have some sun!";

            if (isSunny == true)
            {
                Console.WriteLine(wear);

                if (atBeach == true)
                {
                    Console.WriteLine(sunblock);
                }
                else
                {
                    Console.WriteLine(noSunblock);
                }
            }
            else
            {
                Console.WriteLine(dontWear);

                if (goAnyway == true)
                {
                    Console.WriteLine(going);
                }
                else
                {
                    Console.WriteLine(nextTime);
                }
            }
        }
    }
}
