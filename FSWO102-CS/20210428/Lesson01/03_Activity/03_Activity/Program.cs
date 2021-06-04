using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Activity
{
    class Program
    {
        public int Age()
        {
            return 25;
        }
        public string Joe()
        {
            string joe = "Joe Santos";
            return joe;
        }
        public double D121()
        {
            return 12.1d;
        }

        static void Main(string[] args)
        {
            Program program = new Program();
            Console.WriteLine(program.Age());
            Console.WriteLine(program.Joe());
            Console.WriteLine(program.D121());

            Console.ReadLine();
        }
    }
}
