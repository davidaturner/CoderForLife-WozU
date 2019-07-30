using System;
using FinalProject.Part1;
using FinalProject.Part2;

namespace FinalProject
{
    class Program
    {
        static void Main(string[] args)
        {
            RunPart1();
            Console.WriteLine();
            RunPart2();
            Console.WriteLine("\r\nDONE!");
            Console.WriteLine();
            Console.ReadLine();
        }

        static public void RunPart1() 
        {
            // ASSUMPTION: Using only non negative integers as input.

            // TESTCASE: Test one step: value=15
            // TESTCASE: Test one step: value=5
            // TESTCASE: Test one step: value=3
            // TESTCASE: Test one step: value=1
            // TESTCASE: Test one step: value=2
            // TESTCASE: Test one step: value=45
            // TESTCASE: Test one step: value=75
            // TESTCASE: Test one step: value=10
            // TESTCASE: Test one step: value=48
            // TESTCASE: Test one step: value=225
            // TESTCASE: Test one step: value=100
            // BlingBlong.Test();

            // TESTCASE: Run first 100 steps.
            BlingBlong.Run(100);
        }

        static public void RunPart2()
        {
            // ASSUMPTION: Use only non negative integer values.

            // TESTCASE: Test one step: value=0
            // TESTCASE: Test one step: value=1
            // TESTCASE: Test one step: value=2
            // TESTCASE: Test one step: value=3
            // TESTCASE: Test one step: value=10
            // Sequence.Test();

            // TESTCASE: Run 0, 1, 2 and 8 additional steps.
            Sequence.Run(8);
        }
    }
}
