using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL07.Classes
{
    public class Employee
    {
        string name;
        string salary;
        string hireDate;

        public Employee() : this("", "", "")
        {
        }
        public Employee(string name, string salary, string hireDate)
        {
            this.name = name;
            this.salary = salary;
            this.hireDate = hireDate;
        }
        virtual public void GetName()
        {
            Console.WriteLine("Employee Name: " + name);
        }
        virtual public void GetSalary()
        {
            Console.WriteLine("Salary: " + salary);
        }
        virtual public void GetHireDate()
        {
            Console.WriteLine("Hire Date: " + hireDate);
        }

        // Accessors
        public string Name {
            get { return name; }
            set{ name = value; }
        }
        public string Salary
        {
            get { return salary; }
            set { salary = value; }
        }
        public string HireDate
        {
            get { return hireDate; }
            set { hireDate = value; }
        }

        // RunTest
        virtual public void RunTestSuite()
        {
            Console.WriteLine("Employee 1: ");
            RunRhodaScott();
            Console.WriteLine();

            Console.WriteLine("Employee 2: ");
            RunRupertScott();
            Console.WriteLine();
        }

        static public void RunRhodaScott ()
        {
            // Employee Name: Rhoda Scott
            // Salary: 37000
            // Hire Date: 11 / 22 / 12
            Employee emp = new Employee
            {
                Name = "Rhoda Scott",
                Salary = "37000",
                HireDate = "11/22/12"
            };
            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();
        }
        static public void RunRupertScott ()
        {
            // Employee Name: Rupert Scott
            // Salary: 42000
            // Hire Date: 11 / 22 / 12
            Employee emp = new Employee("Rupert Scott", "42000", "11/22/12");
            emp.GetName();
            emp.GetSalary();
            emp.GetHireDate();
        }
    }
}
