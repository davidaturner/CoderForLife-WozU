using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson1
{
    class HandsOn1
    {
        bool isSunny = true;

        public void Run()
        {
            Console.WriteLine("Testing Lesson 1 Hands On.");
            Console.WriteLine("If isSunny == true");
            if ( isSunny == true)
            {
                Console.WriteLine("   Wear Sunglasses!");
            }
            else
            {
                Console.WriteLine("   Don't Wear Sunglasses.");
            }
            Console.WriteLine("Lesson 1 Test Completed.");
        }
    }
}
