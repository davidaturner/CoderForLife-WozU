using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboy
    {
        void StartGame();
        void PlayAgain();
        void PlayDemo();

        void Settings();

        void ScoreBoard();
    }
}
