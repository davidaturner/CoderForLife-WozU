using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using BlingBlong = Final.blingblong.BlingBlong;
using Sequence = Final.fibonacci.Sequence;


namespace Final
{
    class Program
    {
        static void Main(string[] args)
        {
            //            BlingBlong.play();
            Sequence.play(8);

            Console.WriteLine("\r\n");
            Console.WriteLine("Done!");
            //
            Console.ReadLine();
        }
    }
}
