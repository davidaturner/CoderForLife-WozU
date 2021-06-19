using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_StaticClasses
{
    class Student
    {
        private string firstName;

        public string FirstName
        {
            get
            {
                return firstName;
            }
        }
        public string LastName { get; set; }

        public string CourseFocus { get; set; }

        public override string ToString()
        {
            return FirstName + " " + LastName + " is studying " + CourseFocus + ".";
        }

        public Student(string firstName, string lastName, string courseFocus)
        {
            this.firstName = firstName;
            LastName = lastName;
            CourseFocus = courseFocus;
        }

    }

    public class MyMath
    {
        public static double Add(double a, double b)
        {
            return a + b;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Student student1 = new Student("Andrew", "Coder", "C#");
            Student student2 = new Student("Howard", "Carcinogen", "C#");

            Console.WriteLine("{0}", student1);
            Console.WriteLine("{0}", student2);

            double dubDub = -2.34;
            Console.WriteLine(Math.Abs(dubDub));

            double rubDubDub = 13.22;
            Console.WriteLine(MyMath.Add(dubDub, rubDubDub));

            //
            Console.ReadLine();
        }
    }
}
