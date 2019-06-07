using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class CasualPlayer : IPlayer
    {
        protected string alias;

        protected string firstName;
        protected string lastName;

        public CasualPlayer() : this("")
        {
        }
        public CasualPlayer(string alias) : this(alias, "", "")
        {
        }
        public CasualPlayer(string alias, string firstName, string lastName)
        {
            this.alias = alias;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public string FullName
        {
            get => firstName + " " + lastName;
        }
        public string Alias {
            get => alias;
            set => alias = value;
        }
    }
}
