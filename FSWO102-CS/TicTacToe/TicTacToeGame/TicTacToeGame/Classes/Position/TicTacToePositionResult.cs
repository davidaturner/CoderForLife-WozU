using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToePositionResult : IPositionResult
    {
        int value;

        public TicTacToePositionResult(int value)
        {
            this.value = value;
        }
        public dynamic Value => value;
    }
}
