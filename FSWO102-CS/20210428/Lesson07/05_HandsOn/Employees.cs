using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_HandsOn
{
    namespace employees
    {
        public class Employee
        {
            string name;
            string salary;
            string hireDate;

            public Employee() : this("", "", "") { }

            public Employee(string name, string salary, string hireDate)
            {
                this.name = name;
                this.salary = salary;
                this.hireDate = hireDate;
            }

            public virtual string getName()
            {
                return "Employee Name: " + name;
            }

            public virtual string getSalary()
            {
                return "Salary: " + salary;
            }

            public virtual string hiredDate()
            {
                return "Hire Date: " + hireDate;
            }
        }

        public class Engineer : Employee
        {
            public string schoolAttended;

            public Engineer() : base()
            {
                schoolAttended = "";
            }
            public Engineer(string name, string salary, string hireDate, string schoolAttended)
                : base(name, salary, hireDate)
            {
                this.schoolAttended = schoolAttended;
            }
        }

        public class SoftwareEngineer: Engineer
        {
            public SoftwareEngineer() : base() { }
            public SoftwareEngineer(string name, string salary, string hireDate, string schoolAttended)
                : base(name, salary, hireDate, schoolAttended) { }

            public override string getSalary()
            {
                return "Salary: Sorry, this employee's salary is private.";
            }
        }
    }

}
