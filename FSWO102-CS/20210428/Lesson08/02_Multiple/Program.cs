﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Animal = _02_Multiple.animal.AnimalBase;
using Duck = _02_Multiple.bird.Duck;

namespace _02_Multiple
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
            Animal goofy = new Animal("Goofy", false);
            ReportOn(goofy);

            Duck daisy = new Duck("Daisy", true);
            ReportOn(daisy);
            //
            Console.ReadLine();

        }
    }
}
