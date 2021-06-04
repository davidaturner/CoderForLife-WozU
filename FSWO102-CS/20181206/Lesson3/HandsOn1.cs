using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson3
{
    class HandsOn1
    {
        public void Run()
        {
            string[] names = new string[] { "John", "Jim", "Lady", "Annie" };

            int i = 0;
            while (i < names.Count())
            {
                Console.WriteLine("Where is " + names[i++] + " at today?");
            }
        }
    }
}
