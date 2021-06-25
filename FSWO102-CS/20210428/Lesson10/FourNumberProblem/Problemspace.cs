using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace problemspace
{
    public interface ISolvable
    {
        bool isSolved();
        string[] solved();
    }

    public class ProblemToBeSolved
    {
        ISolvable problemSolver;

        public ProblemToBeSolved(ISolvable problemSolver)
        {
            this.problemSolver = problemSolver;
        }
    }
}

namespace problemspace.FourNumberProblem
{

}
