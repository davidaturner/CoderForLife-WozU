using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL03
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] useNames = { "Emily", "Harry", "Rupert", "Clara", "Lily", "Michael" };

            HaveYouSeen(useNames);
            Console.WriteLine();
            HaveYouSeenInReverseOrder(useNames);
        }

        static void HaveYouSeen(string[] names)
        {
            if (names != null && names.Length > 0)
            {
                for(int i=0; i<names.Length; i++)
                {
                    Console.WriteLine("Have you seen " + names[i] + "?");
                }
            }
        }

        static void HaveYouSeenInReverseOrder(string[] names)
        {
            if (names != null && names.Length > 0)
            {
                for (int i = names.Length-1; i >= 0; i--)
                {
                    Console.WriteLine("Have you seen " + names[i] + "?");
                }
            }
        }
    }
}
