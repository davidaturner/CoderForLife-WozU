using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_HandsOn
{
    class PersonType1
    {
        public PersonType1 ()
        {
            FirstName = "";
            LastName = "";
            Age = 0;
        }

        virtual public string FirstName { get; set; }
        virtual public string LastName { get; set; }
        virtual public int Age { get; set; }
    }
    class PersonType2 : PersonType1
    {
        public PersonType2() : base() { }
        public PersonType2(string firstName, string lastName, int age): base()
        {
            FirstName = firstName;
            LastName = lastName;
            Age = age;
        }
    }
    class Person : PersonType2
    {
        public Person(): base() {}
        public Person(string firstName, string lastName, int age):base(firstName, lastName, age)
        {}

        override public int Age
        {
            set
            {
                if (value < 0)
                {
                    Console.WriteLine("Attempted to store invalid age: {0} Setting to 0.", value);
                    base.Age = 0;
                } else
                {
                    base.Age = value;
                }
            }
        }
        public override string ToString()
        {
            return FirstName + " " + LastName + " is " + Age + " years old.";
        }
    }

    static class HandsOn
    {
        public static void Part1()
        {
            /*
            Henry Boswald is 33 years old.
            Lola Boswald is 31 years old.
            */
            Person henryboswald = new Person();
            henryboswald.FirstName = "Henry";
            henryboswald.LastName = "Boswald";
            henryboswald.Age = 33;
            Console.WriteLine("{0}", henryboswald);

            Person lolaboswald = new Person();
            lolaboswald.FirstName = "Lola";
            lolaboswald.LastName = "Boswald";
            lolaboswald.Age = 31;
            Console.WriteLine("{0}", lolaboswald);
            Console.WriteLine();
        }
        public static void Part2()
        {
            /*
                Emilia Hill is 42 years old.
                Lucius Hill is 45 years old.
            */
            Person emiliahill = new Person("Emilia", "Hill", 42);
            Console.WriteLine("{0}", emiliahill);

            Person luciushill = new Person("Lucius", "Hill", 45);
            Console.WriteLine("{0}", luciushill);
            Console.WriteLine();
        }
        public static void Part3()
        {
            /*
            Henry Boswald is 33 years old.
            Lola Boswald is 31 years old.
            */
            Person henryboswald = new Person();
            henryboswald.FirstName = "Henry";
            henryboswald.LastName = "Boswald";
            henryboswald.Age = 33;
            Console.WriteLine("{0}", henryboswald);

            Person lolaboswald = new Person();
            lolaboswald.FirstName = "Lola";
            lolaboswald.LastName = "Boswald";
            lolaboswald.Age = 31;
            Console.WriteLine("{0}", lolaboswald);

            /*
                Emilia Hill is -42 years old.
                Lucius Hill is 45 years old.
            */
            Person emiliahill = new Person("Emilia", "Hill", -42);
            Console.WriteLine("{0}", emiliahill);

            Person luciushill = new Person("Lucius", "Hill", 45);
            Console.WriteLine("{0}", luciushill);
            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            HandsOn.Part1();
            HandsOn.Part2();
            HandsOn.Part3();

            //
            Console.ReadLine();
        }
    }
}
