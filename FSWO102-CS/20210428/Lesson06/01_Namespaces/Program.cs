using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Namespaces
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
            _01_Namespaces.Program.helloWorld("World");
            _01_Namespaces.myspace01.Activity.helloWorld();
            _01_Namespaces.myspace01.Nocturnal.helloWorld("Nocturnal");

            //
            Console.ReadLine();
        }
    }
}

namespace _01_Namespaces.myspace01 {

    class Nocturnal
    {
        public static void helloWorld(string name)
        {
            Console.WriteLine("Hello, " + name + "!");
        }
    }
}

