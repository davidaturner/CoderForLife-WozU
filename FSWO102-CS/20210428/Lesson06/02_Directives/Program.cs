using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
// Directives and Aliases
using _02_Directives;
using _01_Namespaces = _02_Directives.myspace01;

namespace _02_Directives
{
    namespace myspace01
    {
        class Activity
        {
            public static void helloWorld()
            {
                Console.WriteLine("Hello, Activity!");
            }
        }
    }

    class Program
    {
        public static void helloWorld(string name)
        {
            Console.WriteLine("Hello, " + name + "!");
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Ready!");
            Program.helloWorld("Roger");
            myspace01.Nocturnal.helloWorld("Ramjet");
            _02_Directives.Program.helloWorld("World");
            _01_Namespaces.Activity.helloWorld();
            myspace01.Nocturnal.helloWorld("Nocturnal");

            //
            Console.ReadLine();
        }
    }
}

namespace _02_Directives.myspace01
{

    class Nocturnal
    {
        public static void helloWorld(string name)
        {
            Console.WriteLine("Hello, " + name + "!");
        }
    }
}

