using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson2
{
    class HandsOn3
    {
        public void Run()
        {
            int age = 13;
            bool isStudent = true;

            RunConditions(66, true);
            RunConditions(65, false);
            RunConditions(8, false);
            RunConditions(-1, true);

            RunConditions(age, isStudent);
            RunConditions(age, false);
        }

        static public void RunConditions(int age, bool isStudent)
        {
            Console.WriteLine("Since you are " + age + " years old.");
            Console.WriteLine("   And you " + (isStudent ? "are" : "are NOT") 
                + " a Student...");
            if (age >= 65)
            {
                Console.WriteLine("You pay 7 dollars.");
            }
            else if (age < 0)
            {
                Console.WriteLine("Invalid Age!");
            }
            else if ((age >= 0 && age <= 12) || isStudent)
            {
                Console.WriteLine("You pay 8 dollars.");
            }
           else
            {
                Console.WriteLine("You pay 10 dollars.");
            }
            Console.WriteLine("\r\n");
        }
    }
}
