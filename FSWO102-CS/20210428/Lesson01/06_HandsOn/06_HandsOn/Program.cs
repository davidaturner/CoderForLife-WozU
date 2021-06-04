using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_HandsOn
{
    class Program
    {
        static string wear = "Wear sunglasses";
        static string dontWear = "You don't need to wear sunglasses";
        static string sunblock = "Wear sun block";
        static string noSunblock = "You do not need to wear sunblock";
        static string going = "Awesome! Glad you don't mind clouds";
        static string notGoing = "No worries! Hopefully next time we will have some sun!";

        static string sunny = " >> It is sunny";
        static string notSunny = " >> It is NOT sunny";
        static string isAtBeach = " >> At beach";
        static string notAtBeach = " >> Not at beach";
        static string isGoingAnyway = " >> Going to the beach anyway?";
        static string notGoingOhWell = " >> Not going to the beach then?";


        static void reportSunny()
        {
            Console.WriteLine(sunny);
            Console.WriteLine(wear);
        }
        static void reportNotSunny()
        {
            Console.WriteLine(notSunny);
            Console.WriteLine(dontWear);
        }
        static void reportIsAtBeach()
        {
            Console.WriteLine(isAtBeach);
            Console.WriteLine(sunblock);
        }
        static void reportNotAtBeach()
        {
            Console.WriteLine(notAtBeach);
            Console.WriteLine(noSunblock);
        }
        static void reportGoingAnyway()
        {
            Console.WriteLine(isGoingAnyway);
            Console.WriteLine(going);
        }
        static void reportNotGoing()
        {
            Console.WriteLine(notGoingOhWell);
            Console.WriteLine(notGoing);
        }
        static void HandsOnPartOne(bool isSunny)
        {
            if (isSunny == true)
            {
                reportSunny();
            }
            else
            {
                reportNotSunny();
            }
        }
        static void HandsOnPartTwo(bool isSunny, bool atBeach)
        {
            if (isSunny == true)
            {
                reportSunny();
                if (atBeach == true)
                {
                    reportIsAtBeach();
                } else
                {
                    reportNotAtBeach();
                }
            }
            else
            {
                reportNotSunny();
            }
        }
        static void HandsOnPartThree(bool goAnyway)
        {
            bool isSunny = false;
            bool atBeach = false;
            if (isSunny == true)
            {
                reportSunny();
                if (atBeach == true)
                {
                    reportIsAtBeach();
                }
                else
                {
                    reportNotAtBeach();
                }
            }
            else
            {
                reportNotSunny();
                if (goAnyway)
                {
                    reportGoingAnyway();
                }
                else
                {
                    reportNotGoing();
                }
            }
        }
        static void HandsOnPartThree(bool isSunny, bool atBeach)
        {
            if (isSunny == true)
            {
                reportSunny();
                if (atBeach == true)
                {
                    reportIsAtBeach();
                }
                else
                {
                    reportNotAtBeach();
                }
            }
            else
            {
                bool isGoingAnyway = atBeach;
                reportNotSunny();
                if (isGoingAnyway)
                {
                    reportGoingAnyway();
                }
                else
                {
                    reportNotGoing();
                }
            }
        }

        static void Main(string[] args)
        {
            //           HandsOnPartOne(true);

            //         HandsOnPartTwo(true, true);

            //           HandsOnPartThree(true);

            HandsOnPartThree(false, true);
            Console.ReadLine();
        }
    }
}
