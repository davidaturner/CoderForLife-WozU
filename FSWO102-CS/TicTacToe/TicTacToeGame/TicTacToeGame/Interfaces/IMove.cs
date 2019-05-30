using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    public interface IMove
    {
        int CurrentMove
        {
            get;
        }
        IMove Next
        {
            get;
            set;
        }
    }
}
