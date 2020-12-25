using System;

namespace L1101_fibonacci
{
    public class FibonacciEx01
    {
        /* 
            FibonacciEx01
            n:      1   2   3   4   5   6   7   8
            fib(n): 1   1   2   3   5   8   13  21
        */
        static public int fib(int n)
        {
            // base case
            if (n <= 2) return 1;
            // recursive case
            return (fib(n - 1) + fib(n - 2));
        }
        static public void helloWorld()
        {
            Console.WriteLine("Hello World!");
        }
    }
}