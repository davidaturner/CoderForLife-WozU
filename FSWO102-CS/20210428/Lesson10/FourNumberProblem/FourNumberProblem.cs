using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//
using ISolvable = problemspace.ISolvable;

namespace _FourNumberProblem
{
    public class FourNumberProblem
    {
        protected int goal;
        protected int[] choices;
        private ISolvable fourNumberProblemSolver;

        public FourNumberProblem() : this(0, null, null) { }
        public FourNumberProblem(int goal, int[] choices) : this(goal, choices, null) { }
        public FourNumberProblem(int goal, int[] choices, ISolvable problemSolver)
        {
            this.goal = goal;
            this.choices = choices;
            fourNumberProblemSolver = problemSolver;
        }

        public int GetGoal()
        {
            return goal;
        }
        public int[] GetChoices()
        {
            return this.choices;
        }

        public override string ToString()
        {
            string str = "";
            foreach (int choice in choices)
            {
                str += choice + " ";
            }
            return "Goal: " + goal + " Choices: " + str;
        }

        public bool isSolvable()
        {
            return true;
        }

        public string[] getSolution()
        {
            return null;
        }
    }
}
