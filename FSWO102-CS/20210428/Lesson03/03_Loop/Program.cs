using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Loop
{
    class Program
    {
        public static void printToTen()
        {
            int i = 1;
            while (i < 10)
            {
                Console.WriteLine(i);
                i++;
            }
            Console.WriteLine();

        }
        public static void doPrintToTen()
        {
            int i = 1;
            do
            {
                Console.WriteLine(i);
                i++;
            } while (i < 10);

            Console.WriteLine();

        }
        public static void forPrintingToTen()
        {
            for (int i = 10; i > 0; i--)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine("Lift Off!!");
            Console.WriteLine();
        }

        public static void preview(string[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            Program.printToTen();
            Program.doPrintToTen();
            Program.forPrintingToTen();

            string[] theBeatles = new string[] { "John", "Paul", "Ringo", "George" };
            Program.preview(theBeatles);

            //
            Console.ReadLine();
        }
    }
}

