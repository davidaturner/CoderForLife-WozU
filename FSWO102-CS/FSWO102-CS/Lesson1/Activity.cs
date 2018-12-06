using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson1
{
    class Activity
    {
        int age = 25;

        string name = "Fresh";

        double number = 1.0d;

        public bool isBool(int number1)
        {
            bool isUno;

            if (number1 == 1)
            {
                isUno = true;
            }
            else
            {
                isUno = false;
            }


            return isUno;
        }

        public bool CheckEverything()
        {
            bool isTrue;

            bool bool1 = true;

            if (bool1 == true)
            {
                isTrue = true;
            }
            else
            {
                isTrue = false;
            }

            return isTrue;
        }

    }
}
