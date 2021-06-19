using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Accessors
{
    class Student
    {
        string firstName;
        string lastName;
        string courseFocus;

        // Declare a FirstName property of type string
        public string FirstName
        {
            get
            {
                return firstName;
            }
            set
            {
                firstName = value;
            }
        }

        // Declare a LastName property of type string
        public string LastName
        {
            get
            {
                return lastName;
            }
            set
            {
                lastName = value;
            }
        }

        // Declare a CourseFocus property of type string
        public string CourseFocus
        {
            get
            {
                return courseFocus;
            }
            set
            {
                courseFocus = value;
            }
        }

        public override string ToString()
        {
            return FirstName + " " + LastName + " is studying " + CourseFocus + ".";
        }
    }

    class Program
    {

        static void Main(string[] args)
        {
            // instantiate three student objects
            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();

            // set the information for student 1
            student1.FirstName = "Harry";
            student1.LastName = "Potter";
            student1.CourseFocus = "Flying";

            // set the information for student 2
            student2.FirstName = "Ron";
            student2.LastName = "Weasley";
            student2.CourseFocus = "Herbology";

            // set the information for student 3
            student3.FirstName = "Hermione";
            student3.LastName = "Granger";
            student3.CourseFocus = "Potions";

            // print information for each student
            Console.WriteLine("{0}", student1);
            Console.WriteLine(student2.ToString());
            Console.WriteLine(student3.ToString());

            //
            Console.ReadLine();
        }
    }
}
