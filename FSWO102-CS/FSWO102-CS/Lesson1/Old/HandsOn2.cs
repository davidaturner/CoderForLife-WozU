using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson1
{
    class HandsOn2
    {
        bool isSunny = true;
        bool atBeach = true;

        public void Run()
        {
            Console.WriteLine("Testing Lesson 1 Hands On.");
            Console.WriteLine("If isSunny == true and atBeach == true");
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
            }
            Console.WriteLine("Lesson 1 Test Completed.");
        }

    }
}
