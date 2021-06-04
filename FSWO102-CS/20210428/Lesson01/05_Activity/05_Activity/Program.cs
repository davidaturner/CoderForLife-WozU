using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_Activity
{
    class Program
    {
        static public bool isNumberAlsoBool(int isNumber)
        {
            return (isNumber == 1 || isNumber == 0) ? true : false;
        }
        static public bool isBoolTrue(bool isBool)
        {
            return (isBool == true) ? true : false;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(isNumberAlsoBool(1));
            Console.WriteLine(isNumberAlsoBool(0));
            Console.WriteLine(isNumberAlsoBool(2));

            bool isBool = false;
            Console.WriteLine(isBoolTrue(isBool));
            isBool = true;
            Console.WriteLine(isBoolTrue(isBool));

            Console.ReadLine();
        }
    }
}
