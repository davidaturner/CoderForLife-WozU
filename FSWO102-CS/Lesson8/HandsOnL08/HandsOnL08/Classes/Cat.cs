using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HandsOnL08.Interfaces;

namespace HandsOnL08.Classes
{
    public class Cat : IMammal
    {
        public void Eat()
        {
            Console.WriteLine("Cats eat mice.");
        }

        public void Run()
        {
            Console.WriteLine("Cats can run at a top speed of 30 mph!");
        }

        public void Speak()
        {
            Console.WriteLine("Meow!");
        }
    }
}
