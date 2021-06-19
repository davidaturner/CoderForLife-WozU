using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Activity
{
    class Program
    {
        public static string[] theMusicians = { "John", "Mike", "Joe", "Kevin" };
        public static string[] theGrades = { "A", "B", "C", "D", "F" };
        public static void preview(string[] arr)
        {
            for(int i=0; i<arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            Console.WriteLine();
        }
        static void Main(string[] args)
        {
            Program.preview(theMusicians);
            Program.preview(theGrades);

            //
            Console.ReadLine();
        }
    }
}
