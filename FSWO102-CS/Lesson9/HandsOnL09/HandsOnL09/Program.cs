using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL09
{
    class Program
    {
        static void Main(string[] args)
        {
            // COMPILE ERROR 1 : Attempting to initial int[] with square brackets.
            // COMPILE ERROR 2 : Variable 'number' is not defined.
            // COMPILE ERROR 3 : Use of unassigned local variable 'sum'
            // REALTIME ERROR  : For loop attempts to access array Index Out of Range/Bound.
            // LOGICAL ERROR 1 : Condition in for loop is never 'true'.
            // LOGICAL ERROR 2 : Local variable for loop i decements to 'i' value.
            int[] numbers = new int[] { 4, 7, 29, 43, 12, 20, 88, 12 };
            int sum = 0;

            for (int i = 0; i < numbers.Length; i++)
            {
                sum += numbers[i];
                Console.Write(sum + " ");
            }
            Console.WriteLine("Final: " + sum);
        }
    }
}
