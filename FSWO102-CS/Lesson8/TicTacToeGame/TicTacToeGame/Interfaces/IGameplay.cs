using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Interfaces
{
    interface IGameplay
    {
        bool PlayGame();
        bool PlayOneMove();

        void StartGame();
    }
}
