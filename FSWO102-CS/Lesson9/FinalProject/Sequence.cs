using System;

namespace FinalProject.Part2
{
    public class Sequence
    {

        static public void Run(int limit)
        {
            for(int i=0; i<limit+3; i++)
            {
                Console.WriteLine( DetermineFibonacci(i));
            }
        }

        static public void Test()
        {
            // TESTCASE: Test one step: value=0
            // TESTCASE: Test one step: value=1
            // TESTCASE: Test one step: value=2
            // TESTCASE: Test one step: value=3
            // TESTCASE: Test one step: value=10
            Console.WriteLine(DetermineFibonacci(0) + " 0");    // 0
            Console.WriteLine(DetermineFibonacci(1) + " 1");    // 1
            Console.WriteLine(DetermineFibonacci(2) + " 1");    // 1
            Console.WriteLine(DetermineFibonacci(3) + " 2");    // 2
            Console.WriteLine(DetermineFibonacci(4) + " 3");    // 3
            Console.WriteLine(DetermineFibonacci(12) + " 144");  // 144

        }

        static public int DetermineFibonacci(int i)
        {
            // Base case.
            if (i<2)
            {
                return i;
            }

            // Recursive case.
            return DetermineFibonacci(i - 2) + DetermineFibonacci(i - 1);
        }
    }
}