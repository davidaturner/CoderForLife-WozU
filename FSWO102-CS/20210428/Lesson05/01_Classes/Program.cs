using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Classes
{
    class Program
    {
        public static void consoleIsStudying(string firstname, string lastname, string courseFocus)
        {
            Console.WriteLine(firstname + " " + lastname + " is studying " + courseFocus + '.');
        }

        public static void theOldWay()
        {
            Console.WriteLine("The Old Way");
            {
                string firstName = "Andrew";
                string lastName = "Coder";
                string courseFocus = "C#";

                consoleIsStudying(firstName, lastName, courseFocus);
            }
            {
                consoleIsStudying("Anders", "Hejlsberg", "C#");
            }
            Console.WriteLine();
        }

        public class Student {
            string firstname;
            string lastname;
            string coursefocus;

            public Student() {
                firstname = "";
                lastname = "";
                coursefocus = "";
                Console.WriteLine("Blank Student created!");
            }

            // overloaded constructor
            public Student(string firstname, string lastname, string coursefocus)
            {
                this.firstname = firstname;
                this.lastname = lastname;
                this.coursefocus = coursefocus;
                consoleIsStudying(this.firstname, this.lastname, this.coursefocus);
            }
        }

        public static void theClassWay()
        {
            Console.WriteLine("The Class Way");
            {
                new Student();
            }
            {
                new Student("Andrew", "Coder", "C#");
            }
            {
                new Student("Anders", "Hejlsberg", "C#");
            }
            Console.WriteLine();
        }

        static void Main(string[] args)
        {

            theOldWay();
            theClassWay();

            //
            Console.ReadLine();
        }
    }
}
