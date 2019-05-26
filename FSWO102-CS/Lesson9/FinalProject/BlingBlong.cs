using System;

namespace FinalProject.Part1
{
    public class BlingBlong
    {

        static public void Run(int limit)
        {
            for(int i=1; i<limit+1; i++)
            {
                Console.WriteLine(DetermineBlingBlong(i));
            }
        }

        static public void Test()
        {
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

            Console.WriteLine(DetermineBlingBlong(15) + " BlingBlong");     // BlingBlong
            Console.WriteLine(DetermineBlingBlong(5) + " Blong");           // Blong
            Console.WriteLine(DetermineBlingBlong(3) + " Bling");           // Bling
            Console.WriteLine(DetermineBlingBlong(1) + " 1");               // 1
            Console.WriteLine(DetermineBlingBlong(2) + " 2");               // 2
            Console.WriteLine(DetermineBlingBlong(45) + " BlingBlong");     // BlingBlong
            Console.WriteLine(DetermineBlingBlong(84) + " Bling");          // Bling
            Console.WriteLine(DetermineBlingBlong(10) + " Blong");          // Blong
            Console.WriteLine(DetermineBlingBlong(48) + " Bling");          // Bling
            Console.WriteLine(DetermineBlingBlong(225) + " BlingBlong");    // BlingBlong
            Console.WriteLine(DetermineBlingBlong(100) + " Blong");         // Blong

        }
        static private string DetermineBlingBlong(int i)
        {
            if ( i % 15 == 0)
            {
                return "BlingBlong";
            }
            else if ( i % 5 == 0)
            {
                return "Blong";
            }
            else if ( i % 3 == 0)
            {
                return "Bling";
            }

            return i.ToString();
        }
    }
}