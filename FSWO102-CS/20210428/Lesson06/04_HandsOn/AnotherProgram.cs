using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_HandsOn
{
    namespace myNamespace
    {
        public class AnotherProgram
        {
            public static void printText()
            {
                Console.WriteLine("Hello, Earth!");
            }
        }
    }

    namespace textNamespace
    {
        public class AnotherProgram
        {
            public static void printText()
            {
                Console.WriteLine("I am text from the textNamespace.");
            }
        }
    }
}
