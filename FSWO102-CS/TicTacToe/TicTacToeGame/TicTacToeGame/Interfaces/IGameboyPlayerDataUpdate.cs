using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    public interface IGameboyPlayerDataUpdate
    {
        void Score(IPlayer player1, IPlayer player2, IPositionResult result);
    }
}
