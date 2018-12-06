using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO102_CS.Lesson4
{
    class HandsOn1
    {
        public void Run ()
        {
            DoubleMe(1);
            DoubleMe(40);
            DoubleMe(-2);
            DoubleMe(12445);
        }

        public int DoubleMe(int myInt)
        {
            Console.WriteLine("Old value: " + myInt);
            int doubled = myInt * 2;
            Console.WriteLine("New value: " + doubled);

            return doubled;
        }

        public int DoubleMe(int myInt, bool suppressWrite)
        {
            if ( !suppressWrite)
            {
                Console.WriteLine("Old value: " + myInt);
            }

            int doubled = myInt * 2;

            if ( !suppressWrite)
            {
                Console.WriteLine("New value: " + doubled);
            }

            return doubled;
        }
    }
}
