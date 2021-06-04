using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_DataTypes
{
    class Program
    {
        static void Main(string[] args)
        {
            int daysInAYear = 365;
            Console.WriteLine(daysInAYear);

            double someMoney = 3.00;
            Console.WriteLine(someMoney);

            string joesantos;
            joesantos = "Joe Santos";
            Console.WriteLine(joesantos);

            bool isTrue = true;
            Console.WriteLine(isTrue);

            string greeting;
            greeting = "Hello, World!";
            Console.WriteLine(greeting);
            greeting = "Hi Mary";
            Console.WriteLine(greeting);

            int age = 32;
            Console.WriteLine(age);
            age += 10;
            Console.WriteLine(age);

            float pi = 3.14F;
            Console.WriteLine(pi);

            // C# allows the use of 'var'
            var piAlso = pi;
            Console.WriteLine(piAlso);

            Console.ReadLine();
        }
    }
}
