using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_Interface
{
    public interface Shape
    {
        double area();
    }

    public class Square : Shape
    {
        double length;

        public Square(double length)
        {
            this.length = length;
        }

        public double area()
        {
            return length * length;
        }
    }

    public class Circle : Shape
    {
        double radius;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double area()
        {
            return Math.PI * radius * radius;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            double squareLength = 19.50;
            Square sq = new Square(squareLength);
            double area = sq.area();
            Console.WriteLine(area);

            double circleRadius = 4;
            Circle cir = new Circle(circleRadius);
            double circleArea = cir.area();
            Console.WriteLine(circleArea);
            //
            Console.ReadLine();
        }
    }
}
