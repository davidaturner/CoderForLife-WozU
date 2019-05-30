using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FSWO102_CS.Lesson1;

namespace FSWO102_CS.Lesson4
{
    class HandsOn3
    {
        public void Run()
        {
            DoubleNumberOfTimes(2, 3);
            DoubleNumberOfTimes(-10, 2);
            DoubleNumberOfTimes(1, -23);
            DoubleNumberOfTimes(1, 7);
        }

        public int DoubleNumberOfTimes(int myInt, int numberOfTimes)
        {
            HandsOn1 handsOn1 = new HandsOn1();

            Console.WriteLine("Old value: " + myInt + " Number of Times: " + numberOfTimes);

            int doubledTimes = myInt, i = 0;
            if (numberOfTimes <= 0)
            {
                Console.WriteLine("Invalid Number of Times value!");
                return myInt;
            }
            else
            {
                i = numberOfTimes;
            }
            while( i-- > 0)
            {
                doubledTimes = handsOn1.DoubleMe(doubledTimes, true);
            }

            Console.WriteLine("New value: " + doubledTimes);

            return doubledTimes;
        }
    }
}
