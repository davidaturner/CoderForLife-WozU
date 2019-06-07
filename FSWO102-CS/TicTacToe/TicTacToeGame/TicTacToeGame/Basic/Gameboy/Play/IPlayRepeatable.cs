using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IPlayRepeatable
    {
        void Seal(IPlay play);
        IPlay Unseal();

        List<IPlay> Playback();
      
    }
}
