using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity
{
    class Program
    {
        static public void GiveBirth(Animal animal)
        {
            Console.WriteLine(animal.GiveBirth());
        }
        static void Main(string[] args)
        {
            // Subtyping Polymorphism.
            GiveBirth(new Animal());
            GiveBirth(new Mammal());
            GiveBirth(new Bird());
            Console.WriteLine();

            // Ad hoc polymorphism.
            Animal test = new Animal();
            Console.WriteLine(test.GiveBirth());
            Console.WriteLine(test.GiveBirth(2));

            Console.WriteLine("\r\nDONE!");
        }
    }

    public class Animal
    {
        public virtual string GiveBirth()
        {
            return "I don't know how";
        }
        public string GiveBirth(int tries)
        {
            return "I can give birth at least " + tries + " times a year.";
        }
    }

    public class Mammal : Animal
    {
        public override string GiveBirth()
        {
            return "I give live birth";
        }
    }

    public class Bird: Animal
    {
        public override string GiveBirth()
        {
            return "I lay eggs";
        }
    }
}
