using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Interfaces;
using console = TicTacToeGame.Classes.ToConsole.TTTConsoleMessages;

namespace TicTacToeGame.Classes.Move
{
    public class TTTMove : IMove
    {
        protected int currentMove;
        protected IMove next;

        public TTTMove(int newMove)
        {
            this.currentMove = newMove;
            this.next = null;
        }

        public int CurrentMove => currentMove;

        public IMove Next
        {
            get => next;
            set => next = value;
        }
    }

    public class TTTMovelist : IMovelist
    {
        int count;
        IMove moveList;

        public TTTMovelist()
        {
            moveList = null;
            count = 0;
        }

        public IMove Unseal()
        {
            return moveList;
        }
        public bool Seal(IMove move)
        {
            if ( !Evaluate(move))
            {
                return false;
            }

            if (moveList == null)
            {
                moveList = move;
            }
            else
            {
                move.Next = moveList;
                moveList = move;
            }

            count++;

            return true;
        }
        public IMove Clear()
        {
            if (moveList == null)
            {
                return null;
            }

            IMove detached = moveList;
            moveList = moveList.Next;
            if (count > 0)
            {
                count--;
            }

            return detached;
        }

        public bool Evaluate(IMove move)
        {
            return (move.CurrentMove > 0 && move.CurrentMove < 10)? true: false;
        }

        public List<int> Playlist()
        {
            if (isEmpty())
            {
                return null;
            }

            IMove nextMove = moveList;
            List<int> lister = new List<int>();
            for (int i = 0; i < count; i++)
            {
                lister.Add(nextMove.CurrentMove);
                nextMove = nextMove.Next;
            }

            lister.Reverse<int>();

            return lister;
        }

        public bool isEmpty()
        {
            return (count == 0) ? true : false;
        }

        public int Count => count;
    }

    public class TTTMovelistTester
    {
        static public void Run()
        {
            TTTMovelist myMoveList = new TTTMovelist();
            Console.WriteLine("\r\nEmpty Movelist");
            Console.WriteLine(myMoveList.Unseal());
            Console.WriteLine(myMoveList.Count);

            if ( myMoveList.Seal(new TTTMove(5))) {
                Console.WriteLine("\r\nMovelist with 1 element");
                console.ToConsole(myMoveList.Playlist());
            }

            if (myMoveList.Seal(new TTTMove(1)))
            {
                Console.WriteLine("\r\nMovelist with 2 element");
                console.ToConsole(myMoveList.Playlist());
            }

            if ( !myMoveList.Seal(new TTTMove(10)))
            {
                Console.WriteLine("\r\nInvalid move : " + new TTTMove(10).CurrentMove + " No Seal!");
                console.ToConsole(myMoveList.Playlist());
            }

            if (myMoveList.Seal(new TTTMove(9)))
            {
                Console.WriteLine("\r\nMovelist with 3 element");
                console.ToConsole(myMoveList.Playlist());
            }

            TTTMove badMove = (TTTMove)myMoveList.Clear();
            Console.WriteLine("\r\nMovelist with 1 element cleared");
            console.ToConsole(myMoveList.Playlist());

            Console.WriteLine();
            Console.WriteLine("\r\nDONE!");
        }
    }

}
