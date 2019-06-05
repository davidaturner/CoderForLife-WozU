using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class TicTacToePosition : IPosition
    {
        public IPositionResult Evaluate()
        {
            return null;
        }

        private int CheckWinCondition()
        {
            int results = 0;
            results += CheckTopRow();
            results += CheckMiddleRow();
            results += CheckBottomRow();
            results += CheckLeftColumn();
            results += CheckMiddleColumn();
            results += CheckRightColumn();
            results += CheckLeftDiagonal();
            results += CheckRightDiagonal();

            return results;
        }
        private bool CheckDrawCondition()
        {
            bool allFilled = false;

            return allFilled;
        }

        private int CheckTopRow()
        {
            return 0;
        }
        private int CheckMiddleRow()
        {
            return 0;
        }
        private int CheckBottomRow()
        {
            return 0;
        }
        private int CheckLeftColumn()
        {
            return 0;
        }
        private int CheckMiddleColumn()
        {
            return 0;
        }
        private int CheckRightColumn()
        {
            return 0;
        }
        private int CheckLeftDiagonal()
        {
            return 0;
        }
        private int CheckRightDiagonal()
        {
            return 0;
        }
    }
}
