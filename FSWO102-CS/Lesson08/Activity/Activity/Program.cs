using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity
{
    // Activity A classes.
    interface Area
    {
        double GetArea();
    }
    public class Rectangle : Area
    {
        double height;
        double weight;

        public Rectangle(double height, double weight)
        {
            this.height = height;
            this.weight = weight;
        }
        public double GetArea()
        {
            return height * weight;
        }
    }

    // Activity B Classes
    public interface Drawable
    {
        string GetTopCard();
    }
    public class Deck : Drawable
    {
        List<string> _deck;

        public Deck (List<string> newDeck)
        {
            this._deck = newDeck;
        }
        public string GetTopCard()
        {
           return _deck.First<string>();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
        }
    }
}
