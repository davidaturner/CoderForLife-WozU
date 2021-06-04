using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_IfElse
{
    class Program
    {
        static public void IsItOpen(bool isItOpen)
        {
            if (isItOpen)
            {
                Console.WriteLine("Yay! It's open!");
            }
            else
            {
                Console.WriteLine("Pooh. It's not open today.");
            }
        }

        static void Main(string[] args)
        {
            Console.WriteLine(true);
            Console.WriteLine(false);

            Console.ReadLine();
        }
    }
}
