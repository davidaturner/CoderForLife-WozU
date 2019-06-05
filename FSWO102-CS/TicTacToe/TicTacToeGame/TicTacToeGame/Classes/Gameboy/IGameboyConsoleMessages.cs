using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboyConsoleMessages
    {
        void WelcomeMessage();
        bool PlayGame();
        void ShowResults();
        bool PlayAgain();
        void GoodbyeMessage();
    }
}
