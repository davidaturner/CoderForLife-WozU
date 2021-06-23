using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Animal = _02_Multiple.animal;
using AnimalBehavior = _02_Multiple.animalBehavior;

namespace _02_Multiple
{
    namespace animal.mammal
    {
        public class Mammal : Animal
        {
            public override string giveBirth()
            {
                return AnimalBehavior.BirthMethod.GIVELIVE;
            }
        }

        public class Bat : Animal
        {

        }

        public class Cat : Animal
        {

        }
    }
}
