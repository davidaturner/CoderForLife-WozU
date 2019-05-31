using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame.Classes.Move
{
    public class TicTacToeMoveValue : IMoveValue
    {
        protected string alias;
        protected int move;

        public TicTacToeMoveValue(string alias, int move)
        {
            this.alias = alias;
            this.move = move;
        }

        public string Alias => alias;

        public dynamic Move => move;
    }
}
