using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace myNamespace
{
    class AnotherProgram
    {
        static public void PrintText()
        {
            Console.WriteLine("Hello Earth!");
        }
    }
}

namespace joeyNamespace
{
    class AnotherProgram
    {
        static public void PrintText()
        {
            Console.WriteLine("Hello World!");
        }
    }      
}

namespace textNamespace
{
    class AnotherProgram
    {
        static public void PrintText()
        {
            Console.WriteLine("I am text from the textNamespace.");
        }
    }
}
