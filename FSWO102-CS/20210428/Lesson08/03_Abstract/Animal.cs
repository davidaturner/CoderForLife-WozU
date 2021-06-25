using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Abstract
{
    namespace animal
    {
        interface AnimalInterface
        {
            string DeclareGender();
            string Eat();
            string GiveBirth();
            string Move();
            string Speak();
        }

        interface AnimalRunning
        {
            string Run();
        }

        interface AnimalFlying
        {
            string Fly();
        }

        interface AnimalSwimming
        {
            string Swim();
        }

        public abstract class AnimalBase : AnimalInterface
        {
            protected string Name { get; set; }
            protected bool Female { get; set; }

            public AnimalBase() : this("", true) { }
            public AnimalBase(string name, bool isFemale)
            {
                Name = name;
                Female = isFemale;
            }
            public string GetName()
            {
                return Name;
            }
            public bool IsFemale()
            {
                return Female;
            }

            public string DeclareGender()
            {
                return IsFemale() ? animal.behavior.AnimalBehavior.FEMALE :
                                    animal.behavior.AnimalBehavior.MALE;
            }

            public abstract string Eat();

            public virtual string GiveBirth()
            {
                return IsFemale() ? animal.behavior.AnimalBehavior.UNKNOWN :
                    animal.behavior.AnimalBehavior.CANNOTBIRTH;
            }

            public abstract string Move();

            public abstract string Speak();


        }
    }

    namespace animal.behavior
    {
        public class AnimalBehavior
        {
            public static string UNKNOWN = "Unknown";
            public static string CANNOTBIRTH = "I cannot do that";
            public static string FEMALE = "I am female";
            public static string MALE = "I am male";
            public static string RUN = "I can run";
            public static string CANNOTRUN = "I don't run very fast";
            public static string FLY = "I can run and fly";
            public static string SWIM = "I can run and swim";
            public static string FLYSWIM = "I can run and fly and swim";
            public static string CANNOTFLY = "I cannot fly";
        }
    }
}
