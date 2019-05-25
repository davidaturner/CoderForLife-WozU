using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity.Sorts
{
    public class Insertion
    {
        static public void Sort(int[] numbers)
        {
            // ASSUMPTION: Finite set of integers, no duplicates.
            int toBeInserted;
            int[] results = new int[numbers.Length];
            for(int i=1; i<numbers.Length; i++)
            {
                toBeInserted = (numbers[i] < numbers[i - 1]) ? numbers[i] : 0;
                if (toBeInserted > 0)
                {
                    int k = 0;
                    for(int j=i; j>0 && toBeInserted<numbers[j-1]; j--)
                    {
                        k = j - 1;
                        numbers[j] = numbers[k];
                    }
                    numbers[k] = toBeInserted;
                }
            }
        }

        /*
         * Insertion Sort:
         * Skip the first element (0th element).
         * For each element,
         *      Do-while
         *          If previous element > current
         *          swap current with previous;
         *          Otherwise, break out of Do-while.
         */
        // int [] numbers = { 45, 72, 38, 62, 33, 87, 99, 11, 31, 15 };
    }
}
