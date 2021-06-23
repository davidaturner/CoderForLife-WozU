using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
// Aliases
using my = _04_HandsOn.myNamespace.AnotherProgram;
using text = _04_HandsOn.textNamespace.AnotherProgram;

namespace _04_HandsOn
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            my.printText();
            text.printText();

            //
            Console.ReadLine();
        }
    }
}
