using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08_Activity
{
    class Program
    {
        public static class Activity
        {
            public static string getFullName(string firstName, string lastName)
            {
                return firstName + " " + lastName;
            }

            public static bool doesLengthMatch(string a, string b)
            {
                return a.Length == b.Length;
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine(Activity.getFullName("Joe", "Santos"));

            Console.WriteLine(Activity.doesLengthMatch("coffee", "dirty"));

            Console.WriteLine(Activity.doesLengthMatch("alive", "death"));

            //
            Console.ReadLine();
        }
    }
}
