using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL07.Classes
{
    class Engineer : Employee
    {
        string schoolAttended;

        public Engineer () : base("", "", "")
        {
            this.schoolAttended = "";
        }
        public Engineer (string name, string salary, string hireDate, string schoolAttended) : base(name, salary, hireDate)
        {
            this.schoolAttended = schoolAttended;
        }

        public void GetSchoolAttended ()
        {
            if (schoolAttended != null && schoolAttended != "")
            {
                Console.WriteLine("School Attended: " + schoolAttended);
            }
        }

        // Accessor.
        public string SchoolAttended
        {
            get{ return schoolAttended; }
            set { schoolAttended = value;  }
        }

        override public void RunTestSuite()
        {
            Console.WriteLine("Engineer 1: ");
            RunAlenaBucci();
            Console.WriteLine();

            Console.WriteLine("Engineer 2: ");
            RunTonyBucci();
            Console.WriteLine();
        }

        static public void RunAlenaBucci()
        {
            // Employee Name: Alena Bucci
            // Salary: 47000
            // Hire Date: 03 / 27 / 18
            Employee emp = new Engineer
            {
                Name = "Alena Bucci",
                Salary = "47000",
                HireDate = "03/27/18",
                SchoolAttended = null
            };

            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();

            ((Engineer)emp).GetSchoolAttended();
        }

        static public void RunTonyBucci()
        {
            // Employee Name: Tony Bucci
            // Salary: 46000
            // Hire Date: 03 / 27 / 18
            Engineer emp = new Engineer("Tony Bucci", "46000", "03/27/18", "Carnegie Mellon");
            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();

            emp.GetSchoolAttended();
        }

    }
}
