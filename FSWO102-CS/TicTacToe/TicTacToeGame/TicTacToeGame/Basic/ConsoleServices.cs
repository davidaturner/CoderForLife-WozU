using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class ConsoleServices
    {
        public static void ToConsole(string prompt, int value)
        {
            if (prompt != null)
            {
                Console.WriteLine(prompt + " " + value);
            }
            else
            {
                Console.Write(value + " ");
            }
        }

        public static void ToConsole(string prompt, string value)
        {
            if (prompt != null)
            {
                Console.WriteLine(prompt + " " + value);
            }
            else
            {
                Console.Write(value + " ");
            }
        }

        public static void ToConsole(string prompt, int[] arr)
        {
            if (prompt != null)
            {
                Console.Write(prompt + " ");
            }
            foreach(int value in arr)
            {
                Console.Write(value + " ");
            }
            Console.WriteLine();
        }

        public static void ToConsole(string prompt, List<int> arr)
        {
            if (prompt != null)
            {
                Console.Write(prompt + " ");
            }
            foreach (int value in arr)
            {
                Console.Write(value + " ");
            }
            Console.WriteLine();
        }
    }
}
