using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    public interface IMovesList
    {
        bool Seal(IMove move);
        IMove Unseal();

        bool Evaluate(IMove move);
        IMove Clear();

        int Count
        {
            get;
        }

        bool IsEmpty();
    }
}
