using System;
using System.Linq;

namespace EFCoreConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Getting student1...");
            using (var context = new SchoolContext()) {
                var student1 = context.Students
                                    .Where(s => s.Id > 3)
                                    .FirstOrDefault<Student>();
                if (student1 == null) {
                    Console.WriteLine("Student1 Not Found.");
                } else {
                    Console.WriteLine(student1.Describe);
                }
            }
        }

        static void Create(string name) {
            Console.WriteLine("Student1 getting added...");
            using(var context = new SchoolContext()) {

                var student1 = new Student() {
                    Name = name
                };
                context.Students.Add(student1);
                context.SaveChanges();
            }
        }

        static void Get(int id) {
            Console.WriteLine("Finding Student1...");
            using (var context = new SchoolContext()) {
                var student1 = context.Students.Find(id);
                if (student1 == null) {
                    Console.WriteLine("Cannot find student1!");
                } else {
                    Console.WriteLine(student1.Describe);
                }
            }
        }

        static void GetRemaining(int startingId) {
            using (var context = new SchoolContext()) {
                Console.WriteLine("Finding students...");
                var students = context.Students
                               .Where(s => s.Id >= startingId)
                                .ToList();
                if (students == null) {
                    Console.WriteLine("No students found matching criteria.");
                } else {
                    foreach(var student1 in students) {
                        Console.WriteLine(student1.Describe);
                    }
                }
            }
        }
    }
}
