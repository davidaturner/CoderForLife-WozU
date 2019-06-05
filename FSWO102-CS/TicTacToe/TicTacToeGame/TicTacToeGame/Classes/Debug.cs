using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class Debug
    {
        static public void ToConsole(TicTacToeMoves myMoveList)
        {
            TicTacToeMove myMove = (TicTacToeMove)myMoveList.Unseal();
            for (int i = 0; i < myMoveList.Count; i++)
            {
                Console.Write(myMove.Value.Move + " ");
                myMove = (TicTacToeMove)myMove.Next;
            }
            Console.WriteLine();
        }
    }
}
