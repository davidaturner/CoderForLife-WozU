using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IConsole
    {
        void ToConsole(int value);

        void ToConsole(string value);

        void ToConsole(string prompt, string value);

        void ToConsole(int[] arr);

        void ToConsole(string[] arr);

        void ToConsole(List<int> intList);

    }
}
