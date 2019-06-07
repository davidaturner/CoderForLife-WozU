using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboyPlayerDataUpdate
    {
        void Score(IRankedPlayer player1, IRankedPlayer player2, IPosition position);
    }
}
