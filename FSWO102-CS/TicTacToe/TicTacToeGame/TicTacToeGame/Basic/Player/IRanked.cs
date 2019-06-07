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
        int Score
        {
            get;
        }

        int GamesPlayed
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

        void Played();
        void Wins();
        void Loses();

        void RankIt();
        void ScoreIt();

    }
}
