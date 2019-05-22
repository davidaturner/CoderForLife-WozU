using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToePlayer : Player
    {
        string xoro;

        int wins;
        int losses;
        int draws;

        static public int TTTP_ALIAS_INDEX = 1;

        static public int TTTP_WIN_INDEX = 1;
        static public int TTTP_LOSE_INDEX = 2;
        static public int TTTP_DRAW_INDEX = 3;

        public TicTacToePlayer() 
            : this("", "", 0, "X", 0, 0, 0 )
        {
        }
        public TicTacToePlayer(string firstName, string lastName, string alias)
            :this(firstName, lastName, 0, alias, 0, 0, 0 )
        {
        }
        public TicTacToePlayer(string firstName, string lastName,
                                int gamesPlayed, string alias,
                                int wins, int losses, int draws)
            : base(firstName, lastName, gamesPlayed)
        {
            this.xoro = alias;
            this.wins = wins;
            this.losses = losses;
            this.draws = draws;

            PROFILE_LENGTH = 2;
            SCORES_LENGTH = 4;
        }

        override public string[] Profile()
        {
            string[] results = new string[PROFILE_LENGTH];

            results[PLAYER_NAME_INDEX] = firstName + " " + lastName;
            results[TTTP_ALIAS_INDEX] = xoro;

            return results;
        }

        override public string[] Scores()
        {
            string[] results = new string[SCORES_LENGTH];

            results[GC_INDEX] = gamesPlayed.ToString();

            results[TTTP_WIN_INDEX] = wins.ToString();
            results[TTTP_LOSE_INDEX] = losses.ToString();
            results[TTTP_DRAW_INDEX] = draws.ToString();

            return results;
        }

        override public void ToConsole()
        {
            string[] profile = Profile();
            string[] scores = Scores();

            Console.WriteLine("\r\nPlayer Name: " + profile[PLAYER_NAME_INDEX]);
            Console.WriteLine("Alias: " + profile[TTTP_ALIAS_INDEX]);
            Console.WriteLine("Games Played: " + scores[GC_INDEX]);
            Console.WriteLine();
            Console.WriteLine("Wins: " + scores[TTTP_WIN_INDEX]);
            Console.WriteLine("Losses: " + scores[TTTP_LOSE_INDEX]);
            Console.WriteLine("Draws: " + scores[TTTP_DRAW_INDEX]);
            Console.WriteLine();
        }

        // Restricted Accessors.
        public string Alias
        {
            get { return xoro;  }
            set { xoro = value;  }
        }

        public void Wins ()
        {
            wins++;
            UpdateScores();
        }
        public void Loses()
        {
            losses++;
            UpdateScores();
        }
        public void Draws()
        {
            draws++;
            UpdateScores();
        }
    }
}
