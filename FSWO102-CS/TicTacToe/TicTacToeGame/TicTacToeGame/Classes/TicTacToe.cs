using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToe : IGameboy
    {
        public void PlayAgain()
        {
            Console.WriteLine("Play again?");
        }

        public void PlayDemo()
        {
            Console.WriteLine("Spooling up Demo play.");
        }

        public void ScoreBoard()
        {
            Console.WriteLine("Calculating Scoreboard...");
        }

        public void Settings()
        {
            Console.WriteLine("Going to Settings page.");
        }

        public void StartGame()
        {
            Console.WriteLine("Would you like to play Tic Tac Toe, Mr. Turner?");
        }
    }
}
