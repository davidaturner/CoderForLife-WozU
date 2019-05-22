using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame.Classes
{
    public class Player : IPlayer, IConsoleSupport
    {
        protected string firstName;
        protected string lastName;
        protected int gamesPlayed;

        static public int PLAYER_NAME_INDEX = 0;
        static public int GC_INDEX = 0;

        protected int PROFILE_LENGTH = 1;
        protected int SCORES_LENGTH = 1;

        public Player() : this("", "", 0)
        {
        }
        public Player(string firstName, string lastName) 
            : this(firstName, lastName, 0)
        {
        }
        public Player(string firstName, string lastName, int gamesPlayed)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gamesPlayed = gamesPlayed;
        }

        virtual public string[] Profile()
        {
            string[] results = new string[PROFILE_LENGTH];

            results[PLAYER_NAME_INDEX] = firstName + " " + lastName;

            return results;
        }

        virtual public string[] Scores()
        {
            string[] results = new string[SCORES_LENGTH];

            results[GC_INDEX] = gamesPlayed.ToString();

            return results;
        }

        virtual public void ToConsole()
        {
            string[] profile = Profile();
            string[] scores = Scores();

            Console.WriteLine("\r\nPlayer Name: " + profile[PLAYER_NAME_INDEX]);
            Console.WriteLine("Games Completed: " + scores[GC_INDEX]);
            Console.WriteLine();
        }

        public void UpdateScores()
        {
            gamesPlayed++;
        }
    }
}
