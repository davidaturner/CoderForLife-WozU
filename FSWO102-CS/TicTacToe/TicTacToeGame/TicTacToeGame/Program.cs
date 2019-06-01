using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Classes.Gameboy;
using TicTacToeGame.Classes.Move;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame
{
    class Program
    {
        static void Main(string[] args)
        {
            TicTacToe game = new TicTacToe();

            game.Run();
        }

    }
}
