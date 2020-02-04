using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL04
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] test = { 4, 5, 2 };
            int numberOfTimes = 3;

            Console.WriteLine("Doubled Number: " + DoubleMe(test[0]));
            Console.WriteLine("Quadrupled Number: " + QuadrupleMe(test[1]));
            Console.WriteLine("Number Doubled Many Times: " + 
                DoubleNumberMultipleTimes(test[2], numberOfTimes));
            Console.WriteLine("\r\nDONE!");
        }

        public static int DoubleMe(int number)
        {
            return 2 * number;
        }

        public static int QuadrupleMe(int number)
        {
            return 2 * DoubleMe(number);
        }

        public static int DoubleNumberMultipleTimes(int number, int numberOfTimes)
        {
            int result = number;
            for(int i=0; i<numberOfTimes; i++)
            {
                // result += DoubleMe(result);
                result = DoubleMe(result);
            }
            return result;
        }
    }
}
