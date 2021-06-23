using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//
using Animal = _02_Multiple.animal.Animal;
using Mammal = _02_Multiple.animal.mammal.Mammal;

namespace _02_Multiple
{
    class Program
    {
        static void Main(string[] args)
        {
            Animal goofy = new Animal("0001DISNEY_GOOFY", "Goofy");
            Animal.PrintAlias(goofy);
            Animal.PrintBirthMethod(goofy);

            //
            Console.ReadLine();

        }
    }
}
