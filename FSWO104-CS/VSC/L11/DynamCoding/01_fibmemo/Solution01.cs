using System;

namespace _01_fibmemo
{
    class Solution01
    {
        public static int fibval(int n) {
            // takes forward to calculate as n goes up.
            // BIG Q:

            //base case
            if (n <=2 ) return 1;

            //reclusion case
            return fibval(n-1) + fibval(n-2);
        }
        public static void printfib(int[] fibarr) { 
            if (fibarr != null && fibarr.Length <= 0) {
                Console.WriteLine("No sequence!");
                return;
            }
            Console.WriteLine("Sequence start: " + fibarr.Length);
            foreach(int fib in fibarr) {
                Console.Write(" " + fib);
            } 
            Console.WriteLine("\r\nDONE!");     
        }
        public static void helloworld () {
            Console.WriteLine("Hello World Man!");
        }
    }
}