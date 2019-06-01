using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;

namespace TicTacToeGame.Classes.Gameboy
{
    public class TicTacToeMoveDataCapture : IGameboyMoveDataCapture
    {
        public IMove CaptureMove(IPlayer player)
        {
            throw new NotImplementedException();
        }
    }
}
