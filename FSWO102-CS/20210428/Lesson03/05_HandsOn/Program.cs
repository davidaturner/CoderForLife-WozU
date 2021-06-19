using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_HandsOn
{
    class Program
    {
        public static string[] names = new string[] { "Emily", "Harry", "Rupert", "Clara", "Lily", "Michael"};
        public static void haveYouSeen(string [] names)
        {
            for(int i=0; i<names.Length; i++)
            {
                Console.WriteLine("Have you seen " + names[i] + "?");
            }
            Console.WriteLine();
        }
        public static void reverseIt(string[] names)
        {
            for (int i = names.Length-1; i>=0; i--)
            {
                Console.WriteLine("Have you seen " + names[i] + "?");
            }
            Console.WriteLine();
        }
        static void Main(string[] args)
        {
            Program.haveYouSeen(names);
            Program.reverseIt(names);

            //
            Console.ReadLine();
        }
    }
}
