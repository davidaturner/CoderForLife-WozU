using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using console = TicTacToeGame.Classes.Debug;

namespace TicTacToeGame.Classes
{
    public class TicTacToeMoves : IMovesList
    {
        int count;
        IMove moves;

        public TicTacToeMoves ()
        {
            count = 0;
            moves = null;
        }

        public int Count => count;

        public IMove Clear()
        {
            if (!IsEmpty())
            {
                IMove detached = moves;
                moves = moves.Next;
                count--;

                return detached;
            }

            return null;
        }

        public bool Evaluate(IMove move)
        {
            return (move != null && move.Value != null &&
                move.Value.Move > 0 && move.Value.Move < 10) ? true : false;
        }

        public bool IsEmpty()
        {
            return (moves == null) ? true : false;
        }

        public bool Seal(IMove move)
        {
            if (move == null)
            {
                return false;
            }
            if ( !IsEmpty())
            {
                move.Next = moves;
            }
            moves = move;
            count++;

            return true;
        }

        public IMove Unseal()
        {
            if (!IsEmpty())
            {
                return moves;
            }

            return null;
        }
    }

    class TicTacToeMovesTest
    {
        static public void RunTest01()
        {
            TicTacToeMoves myMoves = new TicTacToeMoves();

            myMoves.Seal(new TicTacToeMove("X", 5));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("O", 1));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("X", 9));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("O", 4));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("X", 7));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("O", 8));
            console.ToConsole(myMoves);

            myMoves.Seal(new TicTacToeMove("X", 3));
            console.ToConsole(myMoves);

            Console.WriteLine(myMoves.Count);
            TicTacToeMove move = (TicTacToeMove)myMoves.Unseal();

            Console.WriteLine(move.Value.Alias + " " + move.Value.Move);
        }
    }

}
