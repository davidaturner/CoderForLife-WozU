using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson3
{
    class Activity
    {
        public string[] NewArray()
        {
            string[] musicians = { "John", "Mike", "Joe", "Kevin" };
            return musicians;
        }

        public string[] NewArray2()
        {
            string[] grades = { "A", "B", "C", "D", "F" };
            return grades;
        }

        public void Loop()
        {
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine(i);
            }

        }

        public void Loop2(string string1)
        {
            for (int i = 0; i < string1.Length; i++)
            {
                Console.WriteLine(string1[i]);
            }

        }

        public void Loop3(string input)
        {
            int i = 0;
            while (i < input.Length)
            {
                Console.WriteLine(input[i++]);
            }

        }
    }
}
