using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_Activity
{
    class Program
    {
        interface Area
        {
            double GetArea();
        }

        public class Rectangle : Area
        {
            public double Height { get; set; }
            public double Width { get; set; }

            public Rectangle(double height, double width)
            {
                Height = height;
                Width = width;
            }
            public double GetArea()
            {
                return Height * Width;
            }
        }

        interface Drawable
        {
            string GetFirstCard();
        }

        public class Deck : Drawable
        {
            List<String>_Deck { get; set; }

            public Deck(List<String>deck)
            {
                _Deck = deck;
            }
            public string GetFirstCard()
            {
                return _Deck.First<String>();
            }
        }

        class Activity
        {
            public static void Part1()
            {
                Rectangle rect = new Rectangle(2, 3);
                Console.WriteLine("Height: {0} Width: {1} Area: {2}", rect.Height, rect.Width, rect.GetArea());
                Console.WriteLine();

            }
            public static void Part2()
            {
                /*
                var deck = new List<String>();
                deck.Add("3");
                deck.Add("2");
                deck.Add("4");
                deck.Add("1");
                deck.Add("5");
                */
                List<String> deck = new List<String> { "4", "5", "2", "3", "1" };

                Deck newDeck = new Deck(deck);
                Console.WriteLine(newDeck.GetFirstCard());
                Console.WriteLine();

            }
        }
        static void Main(string[] args)
        {
            Activity.Part1();
            Activity.Part2();
            //
            Console.ReadLine();
        }
    }
}
