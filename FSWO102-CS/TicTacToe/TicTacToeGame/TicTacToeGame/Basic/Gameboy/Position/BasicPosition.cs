using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class BasicPosition : IPosition
    {
        public BasicPosition()
        {
        }
        public virtual int Evaluate()
        {
            throw new NotImplementedException();
        }
    }
}
