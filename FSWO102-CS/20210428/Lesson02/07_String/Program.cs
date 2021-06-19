using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07_String
{
    class Program
    {
        static void Main(string[] args)
        {
            string goodmorning = "Good Morning";
            string joesantos = "Joe Santos";

            Console.WriteLine("Hello, World!");

            Console.WriteLine(goodmorning);
            Console.WriteLine(joesantos);
            Console.WriteLine(goodmorning + ", " + joesantos + "!");

            bool isProgrammer = true;
            Console.WriteLine("Am I a programmer? " + isProgrammer);

            int age = 30;
            Console.WriteLine("My age: " + age);

            Console.WriteLine("Length: " + goodmorning.Length);
            Console.WriteLine(goodmorning.ToUpper());
            Console.WriteLine(goodmorning.ToLower());

            //
            Console.ReadLine();
        }
    }
}
