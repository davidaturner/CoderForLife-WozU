using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10_HandsOn
{
    class Program
    {
        public static class HandsOn
        {
            public static double Part1(int age)
            {
                if (age <= 12)
                {
                    return 8.00;
                } else if (age >= 65)
                {
                    return 7.00;
                }
                else
                {
                    return 10.00;
                }
            }
            public static double Part2(int age, bool isStudent)
            {
                if (age >= 65)
                {
                    return 7.00;
                }
                else if (age <= 12 || isStudent)
                {
                    return 8.00;
                }
                else
                {
                    return 10.00;
                }
            }
            public static string Part3(int age, bool isStudent)
            {
                if (age < 0)
                {
                    return "Invalid Age!";
                }
                else if (age >= 65)
                {
                    return "7";
                }
                else if (age <= 12 || isStudent)
                {
                    return "8";
                }
                else
                {
                    return "10";
                }
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine(HandsOn.Part1(3));

            Console.WriteLine(HandsOn.Part1(12));

            Console.WriteLine(HandsOn.Part1(13));

            Console.WriteLine(HandsOn.Part1(65));
            Console.WriteLine();

            bool isStudent = true;
            Console.WriteLine(HandsOn.Part2(11,false));

            Console.WriteLine(HandsOn.Part2(21, false));

            Console.WriteLine(HandsOn.Part2(64, isStudent));

            Console.WriteLine(HandsOn.Part2(11, isStudent));

            Console.WriteLine(HandsOn.Part2(78, isStudent));
            Console.WriteLine();

            Console.WriteLine(HandsOn.Part3(-1, isStudent));

            Console.WriteLine(HandsOn.Part3(-10, false));

            Console.WriteLine(HandsOn.Part3(44, isStudent));

            Console.WriteLine(HandsOn.Part3(32, false));


            //
            Console.ReadLine();
        }
    }
}
