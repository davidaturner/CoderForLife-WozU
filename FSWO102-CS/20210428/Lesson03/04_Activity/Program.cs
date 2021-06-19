using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Activity
{
    class Program
    {
        public static class Activity
        {
            public static int[] doubleValue(int[] values)
            {
                int[] newValues = new int[values.Length];
                for(int i=0; i<values.Length; i++)
                {
                    newValues[i] = 2 * values[i];
                }
                return newValues;
            }
            public static int doAverage(int[] values)
            {
                int result = 0;
                int i = 0;
                do
                {
                    result += values[i++];
                } while (i < values.Length);
                return result / values.Length;
            }
            public static void preview(int[] arr)
            {
                for(int i=0; i<arr.Length; i++)
                {
                    Console.WriteLine(arr[i]);
                }
                Console.WriteLine();
            }
        }
        static void Main(string[] args)
        {
            int[] values = new int[] { 1, 2, 3 };
            Activity.preview(Activity.doubleValue(values));
            Console.WriteLine(Activity.doAverage(values));
            Console.WriteLine();
            //
            Console.ReadLine();
        }
    }
}
