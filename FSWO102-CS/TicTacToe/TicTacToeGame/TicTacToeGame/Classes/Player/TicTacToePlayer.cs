using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame.Classes.Player
{
    public class TicTacToePlayer : IPlayer
    {
        protected string firstName;
        protected string lastName;

        protected string alias;

        protected int gamesPlayed;

        protected bool isInGame;

        public TicTacToePlayer(string firstName, string lastName, string alias)
            : this(firstName, lastName, alias, 0)                            
        {
        }
        public TicTacToePlayer(string  firstName, string lastName, string alias, int gamesPlayed)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.alias = alias;
            this.gamesPlayed = gamesPlayed;
        }

        public string FullName => firstName + " " + lastName;

        public string Alias => alias;

        public int GamesPlayed
        {
            get => gamesPlayed;
            set => gamesPlayed = value;
        }

        public void StartGame()
        {
            isInGame = true;
        }

        public void FinishGame()
        {
            isInGame = false;
        }

        public bool IsInAGame()
        {
            return isInGame;
        }
    }
}
