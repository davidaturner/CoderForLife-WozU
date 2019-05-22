using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    interface IPlayer
    {
        string[] Profile();

        string[] Scores();
        void UpdateScores();
    }
}
