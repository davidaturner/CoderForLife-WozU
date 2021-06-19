using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_Arithmetic
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(2 + 2);

            int sum = 2 + 2;
            Console.WriteLine(sum);

            Console.WriteLine(2 - 2);

            Console.WriteLine(2 * 2);

            Console.WriteLine(2 / 2);

            Console.WriteLine(3 % 2);

            sum += 2;
            Console.WriteLine(sum);

            sum -= 1;
            Console.WriteLine(sum);

            sum *= -10;
            Console.WriteLine(sum);

            sum /= 3;
            Console.WriteLine(sum);

            sum %= 4;
            Console.WriteLine(sum);

            sum = 0;
            Console.WriteLine(++sum);
            Console.WriteLine(--sum);
            Console.WriteLine(sum++);
            Console.WriteLine(sum);

            /*
            The order of how math operations are performed is called order of operations. You can remember the 
            order of operations for math formulas with the acronym P.E.M.D.A.S.:

            Parenthesis
            Exponents
            Multiplication
            Division
            Addition
            Subtraction
            */
            Console.WriteLine(2 + 5 * 5 / 5 - 1);

            Console.ReadLine();

        }
    }
}
