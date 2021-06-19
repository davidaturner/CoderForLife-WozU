using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Activity
{
    class Program
    {
        public static string GreetMe(string name)
        {
            return (name != null)? "Hello, " + name + ".": "Hello.";
        }

        public static double DoAverage(int[] values)
        {
            if (values == null || values.Length == 0)
            {
                return 0.0;
            }
            int sum = 0;
            for(int i=0; i<values.Length; i++)
            {
                sum += values[i];
            }
            return sum / values.Length;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(GreetMe("Adam"));

            int[] values = new int[] { 1, 2, 3 };
            Console.WriteLine(DoAverage(values));
            Console.WriteLine();

            //
            Console.ReadLine();
        }
    }
}
