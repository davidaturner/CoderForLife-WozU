using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//
using Animal = _03_Abstract.animal;
using Mammal = _03_Abstract.animal.behavior.mammal;

namespace _03_Abstract
{
    namespace mammal
    {
        public class Bat : Animal.AnimalBase, Animal.AnimalRunning, Animal.AnimalFlying
        {
            public Bat(string name, bool isFemale)
                : base(name, isFemale) { }

            public override string Eat()
            {
                return Mammal.AnimalBehavior.BATFOOD;
            }

            public override string Move()
            {
                return animal.behavior.AnimalBehavior.FLY;
            }
            public override string Speak()
            {
                return Mammal.AnimalBehavior.MOTHERESE;
            }
            public string Fly()
            {
                return Mammal.AnimalBehavior.BAF100;
            }

            public override string GiveBirth()
            {
                return IsFemale() ? Mammal.AnimalBehavior.LIVEBIRTH :
                    animal.behavior.AnimalBehavior.CANNOTBIRTH;
            }

            public string Run()
            {
                return animal.behavior.AnimalBehavior.CANNOTRUN;
            }
        }

        public class Cat : Animal.AnimalBase, Animal.AnimalRunning {

            public Cat(string name, bool isFemale)
                : base(name, isFemale) { }

            public override string Eat()
            {
                return Mammal.AnimalBehavior.CATFOOD;
            }

            public override string Move()
            {
                return animal.behavior.AnimalBehavior.RUN;
            }

            public override string Speak()
            {
                return Mammal.AnimalBehavior.MEOW;
            }

            public override string GiveBirth()
            {
                return IsFemale() ? Mammal.AnimalBehavior.LIVEBIRTH :
                    animal.behavior.AnimalBehavior.CANNOTBIRTH;
            }

            public string Run()
            {
                return Mammal.AnimalBehavior.BMV10;
            }
        }
    }

    namespace animal.behavior.mammal
    {
        public class AnimalBehavior
        {
            // Mammal
            public static string LIVEBIRTH = "I give live birth";

            // Bat season
            public static string BATFOOD = "I eat bat food";
            public static string BMV02 = "I move a top speed of about 2mph";
            public static string MOTHERESE = "I speak motherese";
            public static string BAF100 = "I fly a top speed of about 100mph";

            // Cat season
            public static string CATFOOD = "I eat cat food";
            public static string BMV10 = "I move a top speed of about 10mph";
            public static string MEOW = "Meow";
        }
    }
}
