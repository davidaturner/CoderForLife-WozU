using System;

namespace Fibonacci
{
    class Program
    {
        /* Write a function that takes a int arg and returing the n-th value on
            fibonacci sequence. Example:
            n:      1   2   3   4   5   6   7   8
            fib(n): 1   1   2   3   5   8   13  21
        */
        static void Main(string[] args)
        {
            Fibondetails.detailsOn();

            Console.WriteLine(fib(7));

            Fibondetails.endstats();
        }

        static public int fib(int n)
        {
            return FibonacciEx02.fib(n);
            // return FibonacciEx01.fib(n);
        }

        static public void Ex01Test()
        {
            Fibondetails.detailson = true;

            Console.WriteLine(fib(3));
            Console.WriteLine(fib(4));
            Console.WriteLine(fib(5));
            Console.WriteLine(fib(6));
            Console.WriteLine(fib(7));

            // Following is very poor performance using O(exponential)
            // Console.WriteLine(fib(50));
        }

        static public void Ex02Test()
        {
            int nodeDeep = 3;
            Console.WriteLine(fib(nodeDeep));
            Console.WriteLine("Nodes visited: " + (Fibondetails.nodesvisited));
            // Console.WriteLine("Nodes calculated: " + exp(nodeDeep));
        }
    }
}
