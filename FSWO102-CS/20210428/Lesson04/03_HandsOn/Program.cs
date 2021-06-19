using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_HandsOn
{
    class Program
    {
        public static int doubleMe(int value)
        {
            return value + value;
        }

        public static int quadrupleMe(int value)
        {
            return doubleMe(value) + doubleMe(value);
        }

        public static int doubleMeMultipleTimes(int value, int numberOfTimes)
        {
            if (value <= 0 || numberOfTimes <= 0)
            {
                return 0;
            }
            int result = value;
            while( numberOfTimes > 0 )
            {
                result *= value;
                numberOfTimes--;
            }
            return result;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Doubled Number: " + doubleMe(4));
            Console.WriteLine("Quadrupled Number: " + quadrupleMe(5));
            Console.WriteLine("Doubled Multiple Time: " + doubleMeMultipleTimes(2, 3));
            Console.WriteLine();

            //
            Console.ReadLine();
        }
    }
}
