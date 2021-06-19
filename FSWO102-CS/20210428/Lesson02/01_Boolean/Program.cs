using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Boolean
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            // Assignment
            int a = 5;
            int b = 2;

            int c = 5;

            // Equality
            Console.WriteLine(a == b);
            Console.WriteLine(a == c);

            bool d = a == c;
            Console.WriteLine(d);
            Console.WriteLine();

            // Inequality
            Console.WriteLine(5 != 2);
            Console.WriteLine(a != b);
            Console.WriteLine(a != c);

            d = a != b;
            Console.WriteLine(d);

            // Keep terminal displayed
            Console.ReadLine();
        }
    }
}
