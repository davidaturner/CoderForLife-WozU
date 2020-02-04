using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity
{
    public class Greeter
    {
        public static string[] Greet(Person[] people)
        {
            if (people == null || people.Length == 0)
            {
                return null;
            }

            string[] greetings = new string[people.Length];
            int i = 0;
            foreach(Person person in people)
            {
//                greetings[i++] = "Hello " + person.FirstName + " " + person.LastName + "!";
                greetings[i++] = "Hello " + person.FullName + "!";

            }

            return greetings;
        }
    }
    // Person class is already defined in Activity!
    // Do not add.
    public class Person
    {

        protected string firstName;
        protected string lastName;

        public double hours { get; set; }

        public Person() : this("", "")
        {
        }
        public Person(string firstName, string lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public string FirstName
        {
            get { return firstName; }
            set { firstName = value; }
        }
        public string LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }

        public string FullName
        {
            get { return firstName + " " + lastName; }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            List<Person> people = new List<Person>();

            people.Add(new Person("Bill", "Barnes"));
            people.Add(new Person("Sally", "Smith"));

            string[] greetings = Greeter.Greet(people.ToArray<Person>());
            foreach(string greet in greetings)
            {
                Console.WriteLine(greet);
            }
            Console.WriteLine("\r\nDONE!");
        }
    }
}
