using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_HandsOn
{
    interface Animal
    {
        void eat();
    }
    interface Mammal : Animal
    {
        void speak();
        void run();
    }
    public class Dog : Mammal
    {
        public Dog()
        {}

        public void eat()
        {
            Console.WriteLine("Dogs eat bones.");
        }

        public void run()
        {
            Console.WriteLine("Dogs can run at a top speed of 45 mph!");
        }

        public void speak()
        {
            Console.WriteLine("Bark!");
        }
    }
    public class Cow : Mammal
    {
        public Cow()
        { }

        public void eat()
        {
            Console.WriteLine("Cows eat grass.");
        }

        public void run()
        {
            Console.WriteLine("Cows can run at a top speed of 25 mph!");
        }

        public void speak()
        {
            Console.WriteLine("Moo!");
        }
    }
    public class Cat : Mammal
    {
        public Cat()
        { }

        public void eat()
        {
            Console.WriteLine("Cats eat mice.");
        }

        public void run()
        {
            Console.WriteLine("Cats can run at a top speed of 30 mph!");
        }

        public void speak()
        {
            Console.WriteLine("Meow!");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Dog dog = new Dog();
            Cat cat = new Cat();
            Cow cow = new Cow();

            dog.speak();
            dog.run();
            dog.eat();
            cat.speak();
            cat.run();
            cat.eat();
            cow.speak();
            cow.run();
            cow.eat();
            //
            Console.ReadLine();
        }
    }
}
