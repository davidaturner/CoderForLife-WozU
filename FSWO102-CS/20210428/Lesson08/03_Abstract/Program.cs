using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Animal = _03_Abstract.animal.AnimalBase;

using Cat = _03_Abstract.mammal.Cat;
using Duck = _03_Abstract.bird.Duck;
using Bat = _03_Abstract.mammal.Bat;

namespace _03_Abstract
{
    class Program
    {
        public static void ReportOn(Animal a)
        {
            Console.WriteLine("Hi! My name is " + a.GetName() + ".");
            Console.WriteLine(a.GetName() + " says about gender: " + a.DeclareGender() + ".");
            Console.WriteLine(a.GetName() + " says about giving birth: " + a.GiveBirth() + ".");
            Console.WriteLine(a.GetName() + " says about speaking: " + a.Speak() + ".");
            Console.WriteLine(a.GetName() + " says about moving: " + a.Move() + ".");
            Console.WriteLine(a.GetName() + " says about eating: " + a.Eat() + ".");
            Console.WriteLine();
        }
        static void Main(string[] args)
        {
            Cat thomas = new Cat("Thomas", false);
            ReportOn(thomas);

            Duck daisy = new Duck("Daisy", true);
            ReportOn(daisy);

            Bat vampirella = new Bat("Vamp", true);
            ReportOn(vampirella);

            //
            Console.ReadLine();

        }
    }
}
