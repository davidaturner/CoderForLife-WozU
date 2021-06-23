using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animals = _04_Activity.animals;

namespace _04_Activity
{
    public class Activity
    {
        public static void Part1()
        {
            Animals.Animal goofy = new Animals.Animal();
            Animals.Bird daisy = new Animals.Bird();
            Animals.Mammal minnie = new Animals.Mammal();

            Console.WriteLine("Daisy says: {0}", daisy.GiveBirth());
            Console.WriteLine("Minnie says: {0}", minnie.GiveBirth());
            Console.WriteLine("Goofy says: {0}", goofy.GiveBirth());

            Console.WriteLine();
        }
        public static void Part2()
        {
            Animals.AnimalType2 goofy = new Animals.AnimalType2("Goofy", Animals.Animal.BIRTHMETHOD_KNOWHOW);
            Animals.BirdType2 daisy = new Animals.BirdType2("Daisy", true);

            Console.WriteLine(daisy.Name + " says about birth method: {0} Flies : {1}. ", daisy.GiveBirth(), daisy.Flies);
            Console.WriteLine(goofy.Name + " says about birth method: {0}", goofy.GiveBirth());
            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Activity.Part1();
            Activity.Part2();

            //
            Console.ReadLine();
        }
    }
}
