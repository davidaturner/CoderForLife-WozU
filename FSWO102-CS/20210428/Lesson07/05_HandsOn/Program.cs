using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Employees = _05_HandsOn.employees;

namespace _05_HandsOn
{
    public class Activity
    {
        public static void Part1()
        {
            Employees.Employee employee1 = new Employees.Employee("Rupert Scott", "42000", "11/22/2012");
            Console.WriteLine(employee1.getName());
            Console.WriteLine(employee1.getSalary());
            Console.WriteLine(employee1.hiredDate());
            Console.WriteLine();
        }

        public static void Part2()
        {
            Employees.SoftwareEngineer employee2 = new Employees.SoftwareEngineer("Shea Rovington", "92000", "03/27/2018", "MIT");
            Console.WriteLine(employee2.getName());
            Console.WriteLine(employee2.getSalary());
            Console.WriteLine(employee2.hiredDate());
            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            /*
            Employee Name: Rupert Scott
            Salary: 42000
            Hire Date: 11 / 22 / 12
            -------------------------------------------------- -
            Employee Name: Shea Rovington
            Salary: Sorry, this employee's salary is private.
            Hire Date: 03 / 27 / 18
            */
            Activity.Part1();
            Console.WriteLine("---------------------------------------------------");
            Activity.Part2();
            //
            Console.ReadLine();

        }
    }
}
