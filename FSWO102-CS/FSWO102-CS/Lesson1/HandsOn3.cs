using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson1
{
    class HandsOn3
    {
        bool isSunny;
        bool atBeach;

        public void Run()
        {
            Console.WriteLine("Testing Lesson 1 Hands On.");

            isSunny = true;
            atBeach = true;
            RunConditions(isSunny, atBeach);

            isSunny = true;
            atBeach = false;
            RunConditions(isSunny, atBeach);

            isSunny = false;
            atBeach = true;
            RunConditions(isSunny, atBeach);

            RunConditions(false, false);

            Console.WriteLine("Lesson 1 Test Completed.");
        }

        static public void RunConditions(bool isSunny, bool atBeach)
        {

            Console.WriteLine("If isSunny == " + isSunny + " and atBeach == " + atBeach);
            if (isSunny == true)
            {
                Console.WriteLine("   Wear Sunglasses!");
                if (atBeach == true)
                {
                    Console.WriteLine("      Wear Sunblock!");
                }
                else
                {
                    Console.WriteLine("      Don't Wear Sunblock.");
                }
            }
            else
            {
                Console.WriteLine("   Don't Wear Sunglasses.");
                if (atBeach == true)
                {
                    Console.WriteLine("      Come Back Tomorrow.");
                }
                else
                {
                    Console.WriteLine("      Don't Go to Beach.");
                }

            }
            Console.WriteLine("\r\n");
        }

    }

}

