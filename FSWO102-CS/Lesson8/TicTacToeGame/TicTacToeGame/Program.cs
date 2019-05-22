using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Classes;

namespace TicTacToeGame
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            TicTacToePlayer tttp = new TicTacToePlayer("Player", "One", "X");
            tttp.Wins();
            tttp.ToConsole();
            */
            RunInterview();
            
        }

        static void RunInterview()
        {
            int[] numbers = { 1, 2, 3, 4, 5};
            ToConsole(numbers);

            int temp;
            for(int i=0, j=numbers.Length-1; i<j; i++, j--)
            {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            ToConsole(numbers);

        }

        static void ToConsole(int[] numbers)
        {
            Console.Write("\r\nT(): ");
            foreach (int number in numbers)
            {
                Console.Write(number + " ");
            }
            Console.WriteLine();
        }
    }
}
