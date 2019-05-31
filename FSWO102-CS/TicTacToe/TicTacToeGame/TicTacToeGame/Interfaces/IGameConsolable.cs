using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    public interface IGameConsolable
    {
        IPlayer PlayerOne
        {
            get;
        }
        IPlayer PlayerTwo
        {
            get;
        }

        IMovesLinkable Moves
        {
            get;
        }

        IPosition position
        {
            get;
        }
    }
}
