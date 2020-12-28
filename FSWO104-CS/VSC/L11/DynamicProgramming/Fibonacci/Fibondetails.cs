using System;

namespace Fibonacci
{
    public class Fibondetails
    {
        static public int nodesvisited = 0;
        static public int nodesexpected = 0;
        static public bool detailson = false;

        static public void stat(int n)
        {
            if (detailson)
            {
                Console.WriteLine("n: " + n + " node: " + ++nodesvisited);
            }
        }

        static public void returnval(int val)
        {
            if (detailson)
            {
                Console.WriteLine("return " + val);
            }
        }

        static public void returnsum(int sum)
        {
            if (detailson)
            {
                Console.WriteLine("sum: " + sum);
            }
        }

        static public void detailsOn()
        {
            nodesvisited = 0;
            detailson = true;
        }

        static public void endstats()
        {
            if (detailson)
            {
                Console.WriteLine("endstats: nodes visited: " + (Fibondetails.nodesvisited));
            }
        }
    }
}