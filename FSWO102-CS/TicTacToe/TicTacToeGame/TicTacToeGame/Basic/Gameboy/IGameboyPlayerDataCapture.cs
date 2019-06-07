using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboyPlayerDataCapture
    {
        IPlayer CreateNew();
        IRankedPlayer CreateNewRanked();

        IPlayer RetrieveExisting();
        IRankedPlayer RetrieveRanked();
    }
}
