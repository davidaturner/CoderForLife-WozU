using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson2
{
    class HandsOn2
    {
        public void Run()
        {
            int age = 23;
            bool isStudent = true;

            Console.WriteLine("Since you are " + age + " years old.");
            Console.WriteLine("   And you " + (isStudent ? "are" : "are NOT")
                + " a Student...");
            if (age >= 65)
            {
                Console.WriteLine("You pay 7 dollars.");
            }
            else if (age <= 12 || isStudent)
            {
                Console.WriteLine("You pay 8 dollars.");
            }
            else if (age < 0)
            {
                Console.WriteLine("Invalid Age!");
            }
            else
            {
                Console.WriteLine("You pay 10 dollars.");
            }
        }
    }
}
