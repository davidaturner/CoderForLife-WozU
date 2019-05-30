using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes.ToConsole
{
    public class TTTConsoleMessages
    {
        static public void ToConsole(List<int> listing)
        {
            foreach (int element in listing)
            {
                Console.Write(element + " ");
            }
            Console.WriteLine();
        }
    }
}
