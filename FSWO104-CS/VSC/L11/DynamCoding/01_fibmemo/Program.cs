using System;

namespace _01_fibmemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(fib(7));
        }
        static public int fib(int n) {
            return Solution01.fibval(n);
        }

        static public void helloWorld() {
            Console.WriteLine("Hello World!");
        }

        static public void basictest01() {
            Console.WriteLine(Solution01.fibval(1));
            Console.WriteLine(Solution01.fibval(2));
            Console.WriteLine(Solution01.fibval(3));
            Console.WriteLine(Solution01.fibval(4));
            Console.WriteLine(Solution01.fibval(5));
            Console.WriteLine(Solution01.fibval(6)); 
        }
    }
}
