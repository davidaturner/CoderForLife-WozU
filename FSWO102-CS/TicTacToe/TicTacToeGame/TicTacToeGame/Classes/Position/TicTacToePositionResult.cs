using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame.Classes.Position
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
