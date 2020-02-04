using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HandsOnL08.Interfaces;

namespace HandsOnL08.Classes
{
    public class Cow : IMammal
    {
        public void Eat()
        {
            Console.WriteLine("Cows eat grass.");
        }

        public void Run()
        {
            Console.WriteLine("Cows can run at a top speed of 25 mph!");
        }

        public void Speak()
        {
            Console.WriteLine("Moo!");
        }
    }
}
