using System;
using System.Collections;
using System.Collections.Generic;

namespace _04_Collections
{
    class Program
    {
        public static void Way01()
        {
            // new List below
            var animals = new List<string>();
            animals.Add("bird");
            animals.Add("horse");
            animals.Add("dog");
            animals.Add("cat");

            // Iterate through the list.
            foreach (var animal in animals)
            {
                Console.WriteLine(animal + " ");
            }
        }

        public static void Way02()
        {
            var animals = new ArrayList();
            animals.Add("bird");
            animals.Add("horse");
            animals.Add("dog");
            animals.Add("cat");

            // Iterate through the list.
            foreach (var animal in animals)
            {
                Console.WriteLine(animal + " ");
            }
        }
        static void Main(string[] args)
        {
            Way01();
            Console.WriteLine();
            Way02();
            Console.WriteLine();
            //
            Console.ReadLine();
        }
    }
}