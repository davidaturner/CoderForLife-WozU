﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animal = _02_Multiple.animal;
using Bird = _02_Multiple.animal.behavior.bird;


namespace _02_Multiple
{
    namespace bird
    {
        public class BirdBase : Animal.AnimalBase, Animal.AnimalRunning
        {
            public BirdBase(string name, bool isFemale)
                : base(name, isFemale) { }

            public override string GiveBirth()
            {
                return Bird.AnimalBehavior.LAYEGGS;
            }
            public string Run()
            {
                return animal.behavior.AnimalBehavior.CANNOTRUN;
            }
        }
        public class Duck : BirdBase, Animal.AnimalSwimming, Animal.AnimalFlying
        {
            public Duck(string name, bool isFemale)
                : base(name, isFemale) { }

            public override string Eat()
            {
                return Bird.AnimalBehavior.DUCKFOOD; 
            }

            public override string Move()
            {
                return animal.behavior.AnimalBehavior.FLYSWIM;
            }

            public override string Speak()
            {
                return Bird.AnimalBehavior.QUACK;
            }

            public string Fly()
            {
                return Bird.AnimalBehavior.BAF72;
            }

            public string Swim()
            {
                return Bird.AnimalBehavior.BSW03;
            }
        }

        public class Penguin : BirdBase, Animal.AnimalSwimming
        {
            public Penguin(string name, bool isFemale)
                : base(name, isFemale) { }

            public override string Eat()
            {
                return Bird.AnimalBehavior.PENGUINFOOD;
            }

            public override string Move()
            {
                return animal.behavior.AnimalBehavior.SWIM;
            }

            public override string Speak()
            {
                return Bird.AnimalBehavior.SQUAWK;
            }

            public string Swim()
            {
                return Bird.AnimalBehavior.PSW05;
            }
        }
    }

    namespace animal.behavior.bird
    {
        public class AnimalBehavior
        {
            // Bird season
            public static string LAYEGGS = "I lay eggs";

            // Duck season
            public static string DUCKFOOD = "I eat duck food";
            public static string BMV08 = "I waddle a top speed of about 8mph";
            public static string QUACK = "Quack";
            public static string BSW03 = "I swim a top speed of about 3mph";
            public static string BAF72 = "I fly a top speed of about 72mph";

            //Penguin season
            public static string PENGUINFOOD = "I eat fish";
            public static string PMV02 = "I waddle a top speed of about 2mph";
            public static string SQUAWK = "Squawk";
            public static string PSW05 = "I swim a top speed of about 5mph";
        }
    }
}
