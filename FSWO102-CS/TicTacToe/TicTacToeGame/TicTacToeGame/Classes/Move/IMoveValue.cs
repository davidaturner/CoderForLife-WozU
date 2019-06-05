using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IMoveValue
    {
        string Alias
        {
            get;
        }
        dynamic Move
        {
            get;
        }
    }
}
