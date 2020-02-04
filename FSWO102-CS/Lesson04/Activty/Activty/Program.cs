using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activty
{
    // The designation -- static -- denotes that the associated method is NOT tied to an instance of an object.
    // The downside of this is you cannot use -- static -- if you need to input parameters.

    class Program
    {
        static void Main(string[] args)
        {
            // Static call.
            Console.WriteLine("\r\nStatic calls...");
            Program.HelloWorld(); // Specifying 'Program' is unnecessary here.
            Hello("Philadelphia");

            // Instance calls.
            Console.WriteLine("\r\nInstance calls...");
            Program p = new Program();
            p.HelloWorldFromProgram();

            string[] worlds = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus" };
            p.Hello(worlds);
            Console.WriteLine("\r\nDONE!");
        }

        public static void HelloWorld ()
        {
            Console.WriteLine("Hello World from Static!");
        }

        public static void Hello(string world)
        {
            Console.WriteLine("Hello, " + world);
        }

        public void Hello(string[] worlds)
        {
            if (worlds == null || worlds.Length == 0)
            {
                Hello("World");
            }
            else
            {
                for(int i=0; i<worlds.Length; i++)
                {
                    Hello(worlds[i]);
                }
            }
        }
        public void HelloWorldFromProgram()
        {
            Console.WriteLine("Hello World from Program instance!");
        }
    }
}
