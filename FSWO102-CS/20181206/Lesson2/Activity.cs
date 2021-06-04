using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson2
{
    class Activity
    {
        public bool CheckEverything2()
        {
            bool isAllTrue;

            bool bool1 = true;
            bool bool2 = true;
            bool bool3 = true;

            if (bool1 && bool2 && bool3)
            {
                isAllTrue = true;
            }
            else
            {
                isAllTrue = false;
            }

            return isAllTrue;
        }

        public bool Relational()
        {
            bool result = (2 != 4) ? true : false;
            return result;
        }

        public int Binary()
        {
            // Enter your answer below by filling in the question marks
            int total = 9 * 5;
            return total;
        }

        public int Binary2()
        {
            // Enter your answer below by filling in the question marks
            int total = 270 / 6;

            return total;
        }

        public string NewString()
        {
            string hello = "Hello, World!";

            return hello;
        }

        public string NewString2()
        {
            string firstName = "John";
            string lastName = "Smith";
            string fullName = firstName + " " + lastName;


            return fullName;
        }
    }
}
