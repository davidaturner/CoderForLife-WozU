using System;

namespace L1101_fibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            test_fib();
        }

        static public int fib(int n)
        {
            return FibonacciEx01.fib(n);
        }

        static public void test_fib()
        {
            Console.WriteLine(fib(4)); // 3
            Console.WriteLine(fib(5)); // 5
            Console.WriteLine(fib(6)); // 8
            Console.WriteLine(fib(7)); // 13
            Console.WriteLine(fib(8)); // 21
        }

        static public void helloWorld()
        {
            FibonacciEx01.helloWorld();
        }
    }
}
