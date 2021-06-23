using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Activity
{
    namespace animals
    {

        public class Animal
        {
            public static string BIRTHMETHOD_EGGS = "I lay eggs.";
            public static string BIRTHMETHOD_LIVE = "I give live birth.";
            public static string BIRTHMETHOD_KNOWHOW = "Gosh! I don't know how.";

            public virtual string GiveBirth()
            {
                return Animal.BIRTHMETHOD_KNOWHOW;
            }
        }

        public class Mammal : Animal
        {
            public override string GiveBirth()
            {
                return Animal.BIRTHMETHOD_LIVE;
            }
        }

        public class Bird : Animal
        {
            public override string GiveBirth()
            {
                return Animal.BIRTHMETHOD_EGGS;
            }
        }

        public class AnimalType2
        {
            private string birthMethod;

            public string Name{ get; set; }
            public AnimalType2() : this("", "") {}

            public AnimalType2(string name, string birthMethod)
            {
                Name = name;
                this.birthMethod = birthMethod;
            }
            public string GiveBirth()
            {
                return this.birthMethod;
            }
        }

        public class BirdType2 : AnimalType2
        {
            public bool Flies { get; set; }

            public BirdType2 () : base()
            {
                Flies = true;
            }
            
            public BirdType2(string name, bool flies)
                : base(name, Animal.BIRTHMETHOD_EGGS)
            {
                Flies = flies;
            }
        }
    }


}
