using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL07.Classes
{
    class SoftwareEngineer : Engineer
    {

        public SoftwareEngineer() : base("", "", "", "")
        {
        }
        public SoftwareEngineer(string name, string salary, string hireDate, string schoolAttended) 
            : base(name, salary, hireDate, schoolAttended)
        {
        }

        public override void GetSalary()
        {
            Console.WriteLine("Salary: Sorry, this employee's salary is private.");
        }

        override public void RunTestSuite()
        {
            Console.WriteLine("Software Engineer 1: ");
            RunRayRayRovington();
            Console.WriteLine();

            Console.WriteLine("Software Engineer 2: ");
            RunSheaRovington();
            Console.WriteLine();
        }

        static public void RunRayRayRovington()
        {
            // Employee Name: Ray Ray Rovington
            // Salary: Sorry, this employee's salary is private.
            // Hire Date: 03 / 27 / 18
            Employee emp = new SoftwareEngineer
            {
                Name = "Ray Ray Rovington",
                Salary = "47000",
                HireDate = "03/27/18",
                SchoolAttended = "Carnegie Mellon"
            };

            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();

            ((SoftwareEngineer)emp).GetSchoolAttended();

        }

        static public void RunSheaRovington()
        {
            // Employee Name: Shea Rovington
            // Salary: Sorry, this employee's salary is private.
            // Hire Date: 03 / 27 / 18
            SoftwareEngineer emp = new SoftwareEngineer("Shea Rovington", "53000", "03/27/18", "");
            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();

            emp.GetSchoolAttended();
        }

    }
}
