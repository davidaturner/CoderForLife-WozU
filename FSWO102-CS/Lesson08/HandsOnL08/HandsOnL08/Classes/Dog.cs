using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HandsOnL08.Interfaces;

namespace HandsOnL08.Classes
{
    public class Dog : IMammal
    {
        public void Eat()
        {
            Console.WriteLine("Dogs eat bones.");
        }

        public void Run()
        {
            Console.WriteLine("Dogs can run at a top speed of 45 mph!");
        }

        public void Speak()
        {
            Console.WriteLine("Bark!");
        }
    }
}
