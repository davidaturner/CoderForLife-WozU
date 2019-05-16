using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExerciseLoop
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] test = {1, 2, 3};
            Console.WriteLine("Average : " + GetAverage(test));
        }

        static public double GetAverage(int[] numbers)
        {
            double results = 0.0;
            if (numbers.Length > 0)
            {
                int i = 0;
                do
                {
                    results += numbers[i];
                } while (++i < numbers.Length);

                results /= numbers.Length;
            }
            return results;
        }
    }
}
