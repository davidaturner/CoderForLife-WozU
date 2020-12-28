using System;

namespace Fibonacci
{
    public class FibonacciEx01
    {
        // Use simple recursive.
        // Big O: Time O(exponential)
        //          Space O(N)
        static public int fib(int n)
        {
            Fibondetails.stat(n);

            if (n <= 2)
            {
                Fibondetails.returnval(1);
                return 1;
            }
            int sum = fib(n - 1) + fib(n - 2);
            Fibondetails.returnsum(sum);
            return sum;
        }
    }
}