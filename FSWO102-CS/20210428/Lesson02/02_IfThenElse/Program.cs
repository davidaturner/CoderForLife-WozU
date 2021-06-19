using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_IfThenElse
{
    class Program
    {
        public static class Grader
        {
            public static string gradeIt(int score)
            {
                if (score == 100)
                {
                    return "AWESOME, dude!";
                } else if (score >= 90)
                {
                    return "You did well. Keep it going.";
                } else if (score >= 80)
                {
                    return "Pretty good, sir!";
                } else if (score >= 70)
                {
                    return "You did ok. But seek out a tutor for help.";
                }

                return "Cretin!! You FAILED!";
            }
        }
        static void Main(string[] args)
        {
            // Score = 100
            Console.WriteLine(Grader.gradeIt(100));

            // Score = 92
            Console.WriteLine(Grader.gradeIt(92));

            // Score = 87
            Console.WriteLine(Grader.gradeIt(87));

            // Score = 70
            Console.WriteLine(Grader.gradeIt(70));

            // Score = 69
            Console.WriteLine(Grader.gradeIt(69));

            Console.ReadLine();
        }
    }
}
