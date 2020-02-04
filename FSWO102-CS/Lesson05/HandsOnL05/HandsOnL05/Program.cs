using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL05
{
    public class Person
    {
        string firstName;
        string lastName;
        int age;

        public Person() : this("", "", 0)
        {         
        }
        public Person(string firstName, string lastName) : this(firstName, lastName, 0)
        {
        }
        public Person(string firstName, string lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = (age < 0)? 0 : age;

            // Do NOT add the following in SERIOUS CODE.
            if (age < 0)
            {
                Console.WriteLine("Attempted to set age to an invalid value. Set age to 0 instead.");
            }
        }

        public string FirstName
        {
            get { return firstName;  }
            set { firstName = value; }
        }
        public string LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }
        public string FullName
        {
            get { return firstName + " " + lastName;  }
        }
        public int Age
        {
            get { return age; }
            set
            {
                age = (value < 0) ? 0 : value;
                // Do NOT add the following in SERIOUS CODE.
                if (value < 0)
                {
                    Console.WriteLine("Attempted to set age to an invalid value. Set age to 0 instead.");
                }
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            RunPart1();
            RunPart3();
            RunPart2();
        }

        static void RunPart1()
        {
            // Henry Boswald is 33 years old.
            // Lola Boswald is 31 years old.
            Person henry = new Person();
            henry.FirstName = "Henry";
            henry.LastName = "Boswald";
            henry.Age = 33;

            Person lola = new Person();
            lola.FirstName = "Lola";
            lola.LastName = "Boswald";
            lola.Age = 31;

            Console.WriteLine(henry.FullName + " is " + henry.Age + " years old.");
            Console.WriteLine(lola.FullName + " is " + lola.Age + " years old.");
        }

        static void RunPart2()
        {
            // Emilia Hill is 42 years old.
            // Lucius Hill is 45 years old.
            Person emilia = new Person("Emilia", "Hill", 42);
            Person lucius = new Person("Lucius", "Hill", 45);

            Console.WriteLine(emilia.FullName + " is " + emilia.Age + " years old.");
            Console.WriteLine(lucius.FullName + " is " + lucius.Age + " years old.");
        }

        static void RunPart3()
        {
            int negAge = -1;
            // Mickey Mouse is -1 years old.
            Person mickey = new Person("Mickey", "Mouse", negAge);
            mickey.Age = negAge;

/* Calling program should test if invalid age setting was attempted (or any invalid input attempted). Not a constructor.  
 * Constructors should simply set (or initialize) values ONLY (Best Practice).
            if (negAge < 0)
            {
                "Attempted to set age to an invalid value. Set age to 0 instead.";
            }
*/
            Console.WriteLine(mickey.FullName + " is " + mickey.Age + " years old.");

        }
    }
}
