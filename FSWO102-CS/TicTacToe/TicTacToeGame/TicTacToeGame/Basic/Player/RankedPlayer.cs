using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public abstract class RankedPlayer : CasualPlayer, IRanked
    {
        protected int ranking;
        protected int score;

        protected int gamesPlayed;
        protected int gamesWon;
        protected int gamesLost;

        public RankedPlayer () : this("", "", "", 0, 0, 0, 0, 0)
        {
        }
        public RankedPlayer (string alias, string firstName, string lastName) 
            : this(alias, firstName, lastName, 0, 0, 0, 0, 0)
        {
        }
        public RankedPlayer (string alias, string firstName, string lastName,
                                int ranking, int score,
                                int gamesPlayed, int gamesWon, int gamesLost) 
            : base(alias, firstName, lastName)
        {
            this.ranking = ranking;
            this.score = score;
            this.gamesPlayed = gamesPlayed;
            this.gamesWon = gamesWon;
            this.gamesLost = gamesLost;
        }

        public int Ranking => ranking;

        public int Score => score;

        public int GamesWon => gamesWon;

        public int GamesLost => gamesLost;

        public int GamesPlayed => gamesPlayed;

        public virtual void Wins()
        {
            gamesWon++;
        }

        public virtual void Loses()
        {
            gamesLost++;
        }

        public virtual void Played()
        {
            gamesPlayed++;
        }

        public abstract void RankIt();

        public abstract void ScoreIt();


    }
}
