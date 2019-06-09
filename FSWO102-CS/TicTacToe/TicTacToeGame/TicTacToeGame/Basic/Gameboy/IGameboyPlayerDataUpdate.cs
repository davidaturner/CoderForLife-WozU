using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboyPlayerDataUpdate
    {
        void Score(IRanked player1, IRanked player2, IPosition position);
    }
}
