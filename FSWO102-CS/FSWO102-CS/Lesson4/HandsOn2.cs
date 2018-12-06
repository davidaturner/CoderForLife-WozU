using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FSWO102_CS.Lesson4;

namespace FSWO102_CS.Lesson4
{
    class HandsOn2
    {
        public void Run()
        {
            QuadrupleMe(1);
            QuadrupleMe(13);
            QuadrupleMe(3944);
        }

        public int QuadrupleMe(int myInt)
        {
            Console.WriteLine("Old value: " + myInt);

            HandsOn1 handsOn = new HandsOn1();
            int quadruple = handsOn.DoubleMe( handsOn.DoubleMe(myInt, true), true);

            Console.WriteLine("New value: " + quadruple);

            return quadruple;
        }

    }
}
