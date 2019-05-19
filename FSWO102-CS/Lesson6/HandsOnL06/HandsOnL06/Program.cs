using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using mine = myNamespace.AnotherProgram;
using joey = joeyNamespace.AnotherProgram;
using textNamespace;

namespace HandsOnL06
{
    class Program
    {
        static void Main(string[] args)
        {
            joey.PrintText();
            mine.PrintText();
            AnotherProgram.PrintText(); // from textNamespace. vague, when no use alias.

            Console.WriteLine("\r\nDONE!");
            Console.ReadLine();
        }
    }
}
