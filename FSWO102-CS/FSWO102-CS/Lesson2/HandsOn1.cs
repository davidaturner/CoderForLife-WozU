using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson2
{
    class HandsOn1
    {
        public void Run()
        {
            int age = 65;

            Console.WriteLine("Since you are " + age + " years old...");
            if ( age >= 65)
            {
                Console.WriteLine("You pay 7 dollars.");
            }
            else if ( age <= 12)
            {
                Console.WriteLine("You pay 8 dollars.");
            }
            else
            {
                Console.WriteLine("You pay 10 dollars.");
            }
        }
    }
}
