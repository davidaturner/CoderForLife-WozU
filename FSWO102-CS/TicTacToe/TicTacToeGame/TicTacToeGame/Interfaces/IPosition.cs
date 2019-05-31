using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    public interface IPosition
    {
        int Evaluate();

        bool Update(IMove move);
    }
}
