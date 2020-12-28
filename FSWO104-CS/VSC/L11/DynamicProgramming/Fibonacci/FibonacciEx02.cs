namespace Fibonacci
{
    public class FibonacciEx02
    {
        static int[] memo = new int[50];

        static public int fib(int n)
        {
            /* Use Big O notation
                Time O(2N)-> O(N)
                Space O(N)
            */
            // stat
            Fibondetails.stat(n);
            if (memo[n] != 0)
            {
                //returnval
                Fibondetails.returnval(memo[n]);
                return memo[n];
            }

            if (n <= 2)
            {
                memo[n] = 1;
                Fibondetails.returnval(memo[n]);
                return memo[n];
            }

            memo[n] = fib(n - 1) + fib(n - 2);
            //sum
            Fibondetails.returnsum(memo[n]);
            return memo[n];
        }
    }
}