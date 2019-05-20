using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HandsOnL07.Classes;

namespace HandsOnL07
{
    class Program
    {
        static void Main(string[] args)
        {
            // RunPart1();
            RunPart2();
        }

        static void RunPart1 ()
        {
            //           new Employee().RunTestSuite();
            Employee.RunRupertScott();
            ConsoleWriteLineDONE();
        }

        static void RunPart2()
        {
            //          new Employee().RunTestSuite();
            Employee.RunRupertScott();
            ConsoleWriteLine();

            //          new Engineer().RunTestSuite();
            //           Engineer.RunToniBucci();
            // ConsoleWriteLine();

            //          new SoftwareEngineer().RunTestSuite();
            SoftwareEngineer.RunSheaRovington();
            ConsoleWriteLineDONE();
        }

        static void ConsoleWriteLine()
        {
            Console.WriteLine("---------------------------------------------------");
        }
        static void ConsoleWriteLineDONE()
        {
            Console.WriteLine("\r\nDONE!");
            Console.WriteLine();
            Console.ReadLine();
        }
    }
}
