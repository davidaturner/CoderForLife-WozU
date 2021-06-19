using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Functions
{
    class Program
    {
        public static void Welcome()
        {
            Console.WriteLine("Welcome to Earth!");
        }

        public static void GreetPerson(string name)
        {
            Console.WriteLine("Hello " + name + "!");
        }

        public static bool IsEven(int number)
        {
            return number % 2 == 0;
        }

        public static int Add(int number1, int number2)
        {
            return number1 + number2;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Welcome();
            Console.WriteLine();

            GreetPerson("Emilia");
            GreetPerson("Thomas");
            GreetPerson("Gail");
            GreetPerson("Abraham");
            Console.WriteLine();

            Console.WriteLine(IsEven(2));
            Console.WriteLine(IsEven(33));
            Console.WriteLine(IsEven(256));
            Console.WriteLine();

            int num1 = 1, num2 = 2;
            Console.WriteLine(Add(num1, num2));

            Console.WriteLine(Add(88, 12));
            Console.WriteLine();

            //
            Console.ReadLine();
        }
    }
}
