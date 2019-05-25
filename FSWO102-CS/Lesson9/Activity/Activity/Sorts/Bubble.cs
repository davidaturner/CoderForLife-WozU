using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity.Sorts
{
    class Bubble
    {
        static public void Sort(int[] numbers)
        {
            bool noSwap;
            do
            {
                noSwap = true;
                for (int i = 0; i < numbers.Length - 1; i++)
                {
                    if (numbers[i] > numbers[i + 1])
                    {
                        int tmp = numbers[i + 1];
                        numbers[i + 1] = numbers[i];
                        numbers[i] = tmp;

                        noSwap = false;
                    }
                }
            } while ( !noSwap );
        }

           /*
            * Bubble Sort:
            *  For each element, compare element with next element
            *  (if not at end of array). If next element is < swap.
            *  Set a flag saying a swap has occurred then repeat
            *  looping until no more swaps occur.
            */
    }
}
