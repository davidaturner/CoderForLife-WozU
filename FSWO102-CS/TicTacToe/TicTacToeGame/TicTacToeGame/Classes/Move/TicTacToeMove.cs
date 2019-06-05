using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToeMove : IMove
    {
        protected IMoveValue moveValue;
        protected IMove next;

        public TicTacToeMove(string alias, int value)
        {
            this.moveValue = new TicTacToeMoveValue(alias, value);
            this.next = null;
        }

        public IMoveValue Value => moveValue;

        public IMove Next
        {
            get => next;
            set => next = value;
        }
    }
}
