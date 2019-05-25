using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Activity.Sorts;
using Activity.Algorithms;

namespace Activity
{
    class Program
    {
        static void Main(string[] args)
        {
            RunSort();
            // RunAlgorithm();

        }

        static void RunSort ()
        {
            // int[] numbers = { 6, 3, 2, 1 };
            int[] numbers = { 45, 72, 38, 62, 33, 87, 99, 11, 31, 15 };
            // int[] numbers = { 6 };
            // int[] numbers = {81, 7};
            // int[] numbers = {};

            Console.WriteLine("Sorting: ");
            Utility.ToConsole(numbers);
            Console.WriteLine("\r\nSorted: ");

            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();

            // Selection.Sort(numbers);
            // Insertion.Sort(numbers);
            // Bubble.Sort(numbers);
            // Quick.Sort(numbers);
            Merge.Sort(numbers);
            Utility.ToConsole(numbers);

            stopwatch.Stop();

            Console.WriteLine("\r\nTicks Taken: " + stopwatch.ElapsedTicks + " Ticks");
            Console.WriteLine("\r\nDONE!");
            stopwatch.Reset();
        }
    }
}
