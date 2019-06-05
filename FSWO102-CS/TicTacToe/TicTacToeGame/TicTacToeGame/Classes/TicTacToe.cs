using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToe
    {
        IPlayer playerX, playerO;
        IMovesList moveList;
        IPosition position;

        public TicTacToe()
        {
        }

        public void Run()
        {
            Console.WriteLine("Run TicTacToe Game.");
        }
    }
}
