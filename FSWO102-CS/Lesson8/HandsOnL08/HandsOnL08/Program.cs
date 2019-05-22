using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HandsOnL08.Classes;

namespace HandsOnL08
{
    class Program
    {
        static void Main(string[] args)
        {
            // RunPart1();
            RunPart2();
        }

        static public void RunPart1()
        {
            Dog dog = new Dog();
            dog.Speak();
            dog.Run();

            Cat cat = new Cat();
            cat.Speak();
            cat.Run();

            Cow cow = new Cow();
            cow.Speak();
            cow.Run();
        }

        static public void RunPart2()
        {
            Dog dog = new Dog();
            dog.Speak();
            dog.Run();
            dog.Eat();

            Cat cat = new Cat();
            cat.Speak();
            cat.Run();
            cat.Eat();

            Cow cow = new Cow();
            cow.Speak();
            cow.Run();
            cow.Eat();
        }
    }
}
