using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_Activity
{
    class Program
    {
        public static class Activity
        {
            public static double newPayments(double cost, double deliveryFee)
            {
                return (cost + deliveryFee) *100;
            }

            public static double getAverage(double a, double b)
            {
                return (a + b) / 2;
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine(Activity.newPayments(10, 2.50));

            Console.WriteLine(Activity.getAverage(18, 2));

            //
            Console.ReadLine();
        }
    }
}
