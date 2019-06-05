using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IRanked
    {
        int Ranking
        {
            get;
        }
       
        int GamesWon
        {
            get;
        }
        int GamesLost
        {
            get;
        }
        int GamesDrawn
        {
            get;
        }

        int Wins();
        int Loses();
        int Drawn();

    }
}
