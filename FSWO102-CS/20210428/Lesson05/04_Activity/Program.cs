using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Activity
{
    public class Person
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string FullName
        {
            get
            {
                return FirstName + " " + LastName;
            }
        }

        public Person(string firstName, string lastName)
        {
            FirstName = firstName;
            LastName = lastName;
        }
    }
    public static class Greeter
    {
        public static string[] Greet(Person[] people)
        {
            if (people == null || people.Length <= 0)
            {
                return null;
            }
            string[] hellos = new string[people.Length];
            for(int i=0; i<people.Length; i++)
            {
                hellos[i] = "Hello, " + people[i].FirstName + " " + people[i].LastName + "!";
            }
            return hellos;
        }
    }
    class Activity
    {
        public static void Activity1()
        {
            Person[] people = new Person[2];
            people[0] = new Person("Andrew", "Coder");
            people[1] = new Person("Martin", "Tobain");

            string[] hellos = Greeter.Greet(people);
            Console.WriteLine("{0}", hellos[0]);
            Console.WriteLine("{0}", hellos[1]);
            Console.WriteLine();
        }

        public static void Activity2()
        {
            Person[] people = new Person[2];
            people[0] = new Person("Andrew", "Coder");
            people[1] = new Person("Martin", "Tobain");

            Console.WriteLine("Hello, {0}!", people[0].FullName);
            Console.WriteLine("Hello, {0}!", people[1].FullName);
            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Activity.Activity1();
            Activity.Activity2();

            //
            Console.ReadLine();
        }
    }
}
