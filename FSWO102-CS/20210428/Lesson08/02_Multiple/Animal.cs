using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AnimalBehavior = _02_Multiple.animalBehavior;

namespace _02_Multiple
{
    namespace animal
    {
        public class Animal
        {
            public string Id { get; set; }
            public string Alias { get; set; }

            public Animal() : this("", "") { }
            public Animal(string id, string alias)
            {
                Id = id;
                Alias = alias;
            }

            public virtual string giveBirth()
            {
                return AnimalBehavior.BirthMethod.DONTKNOW;
            }

            public static void PrintAlias(Animal a)
            {
                Console.WriteLine(a.Alias + " says: Hi! My name is " + a.Alias + "!");
            }

            public static void PrintBirthMethod(Animal a)
            {
                Console.WriteLine(a.Alias + " says: " + a.giveBirth());
            }
        }

        interface Talking
        {
            string talk();
        }
        interface Walking
        {
            string talk();
            string landSpeed();
        }
        interface Flying
        {
            string fly();
            string airSpeed();
        }
    }
}
