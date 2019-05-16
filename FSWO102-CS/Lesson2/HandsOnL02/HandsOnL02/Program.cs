using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL02
{
    class Program
    {
        static void Main(string[] args)
        {
            RunPart3();
        }

        static void RunPart1 ()
        {
            int age = 66;

            // if senior citizen, pay $7
            if (age >= 65)
            {
                Console.WriteLine("Pay $7.");
            }

            // if child, pay $8
            else if (age <= 12)
            {
                Console.WriteLine("Pay $8.");
            }

            // everyone else, pay $10
            else
            {
                Console.WriteLine("Pay $10.");
            }
        }

        static void RunPart2()
        {
            int age = 10;
            bool isStudent = false;

            // if senior citizen, pay $7
            if (age >= 65)
            {
                Console.WriteLine("Pay $7.");
            }

            // if child OR student, pay $8
            else if (age <= 12 || isStudent)
            {
                Console.WriteLine("Pay $8.");
            }

            // everyone else, pay $10
            else
            {
                Console.WriteLine("Pay $10.");
            }
        }

        static void RunPart3()
        {
            int age = -2;
            bool isStudent = true;

            // if age a negative number, print "Invalid Age!"
            if (age < 0)
            {
                Console.WriteLine("Invalid Age!");
            }

            // if senior citizen, pay $7
            else if (age >= 65)
            {
                Console.WriteLine("Pay $7.");
            }

            // if child OR student, pay $8
            else if (age <= 12 || isStudent)
            {
                Console.WriteLine("Pay $8.");
            }

            // everyone else, pay $10
            else
            {
                Console.WriteLine("Pay $10.");
            }
        }
    }
}
