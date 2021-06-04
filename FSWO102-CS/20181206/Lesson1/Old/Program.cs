using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FSWO102_CS.Lesson1;
using FSWO102_CS.Lesson2;

namespace FSWO102_CS
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Run test...\r\n");
            TestLesson4HandsOn3();
            Console.WriteLine("\r\nDONE!");
        }

        static public void HelloWorld()
        {
            Console.WriteLine("Hello, World");
        }

        static public void TestLesson1HandsOn1 ()
        {
            FSWO102_CS.Lesson1.HandsOn1 h = new FSWO102_CS.Lesson1.HandsOn1();
            h.Run();
        }

        static public void TestLesson1HandsOn2()
        {
            FSWO102_CS.Lesson1.HandsOn2 h = new FSWO102_CS.Lesson1.HandsOn2();
            h.Run();
        }

        static public void TestLesson1HandsOn3()
        {
            FSWO102_CS.Lesson2.HandsOn3 h = new FSWO102_CS.Lesson2.HandsOn3();
            h.Run();
        }

        static public void TestLesson2HandsOn1()
        {
            FSWO102_CS.Lesson2.HandsOn1 h = new FSWO102_CS.Lesson2.HandsOn1();
            h.Run();
        }

        static public void TestLesson2HandsOn2()
        {
            FSWO102_CS.Lesson2.HandsOn2 h = new FSWO102_CS.Lesson2.HandsOn2();
            h.Run();
        }

        static public void TestLesson2HandsOn3()
        {
            FSWO102_CS.Lesson2.HandsOn3 h = new FSWO102_CS.Lesson2.HandsOn3();
            h.Run();
        }

        static public void TestLesson3HandsOn1()
        {
            FSWO102_CS.Lesson3.HandsOn1 h = new FSWO102_CS.Lesson3.HandsOn1();
            h.Run();
        }

        static public void TestLesson3HandsOn2()
        {
            FSWO102_CS.Lesson3.HandsOn2 h = new FSWO102_CS.Lesson3.HandsOn2();
            h.Run();
        }

        static public void TestLesson4HandsOn1()
        {
            FSWO102_CS.Lesson4.HandsOn1 h = new FSWO102_CS.Lesson4.HandsOn1();
            h.Run();
        }

        static public void TestLesson4HandsOn2()
        {
            FSWO102_CS.Lesson4.HandsOn2 h = new FSWO102_CS.Lesson4.HandsOn2();
            h.Run();
        }

        static public void TestLesson4HandsOn3()
        {
            FSWO102_CS.Lesson4.HandsOn3 h = new FSWO102_CS.Lesson4.HandsOn3();
            h.Run();
        }
    }
}
