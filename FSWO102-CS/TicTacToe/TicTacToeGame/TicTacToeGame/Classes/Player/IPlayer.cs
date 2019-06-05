using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IPlayer
    {
        string FullName
        {
            get;
        }
        string Alias
        {
            get;
        }

        void StartGame();
        void FinishGame();

        bool IsInAGame();

        int GamesPlayed
        {
            get;
            set;
        }
    }
}
