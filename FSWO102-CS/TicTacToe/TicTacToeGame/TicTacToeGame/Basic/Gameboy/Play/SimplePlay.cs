using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class SimplePlay : IPlay
    {
        protected string alias;
        protected dynamic move;

        public SimplePlay(string alias, dynamic move)
        {
            this.alias = alias;
            this.move = move;
        }

        public string Alias => alias;

        public dynamic Move => move;

        public virtual bool isValidMove()
        {
            return (alias != null && move != null) ? true : false;
        }
    }
}
