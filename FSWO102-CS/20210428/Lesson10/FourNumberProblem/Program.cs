using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//
using FourNumberProblem = _FourNumberProblem.FourNumberProblem;

namespace _FourNumberProblem
{
    class Program
    {
        static void Main(string[] args)
        {
            FourNumberProblem easy = new FourNumberProblem(24, new int[]{ 6, 6, 6, 3 });
            Console.WriteLine(easy.ToString());

            FourNumberProblem medium = new FourNumberProblem(24, new int[] { 3, 18, 12, 3 });

            FourNumberProblem hard = new FourNumberProblem(24, new int[] { 8, 34, 26, 4 });
            //
            Console.ReadLine();
        }
    }
}
