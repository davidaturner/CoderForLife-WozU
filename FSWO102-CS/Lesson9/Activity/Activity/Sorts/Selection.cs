using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity.Sorts
{
    class Selection
    {
        static public void Sort(int []numbers)
        {
            for(int i=0; i<numbers.Length; i++)
            {
                int smallestIndex = numbers.Length;
                for(int j=i, val=numbers[j]; j<numbers.Length; j++)
                {
                    if (numbers[j] < val)
                    {
                        val = numbers[j];
                        smallestIndex = j;
                    }
                }
                if (smallestIndex < numbers.Length)
                {
                    int tmp = numbers[smallestIndex];
                    numbers[smallestIndex] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
              
       /*
        * Selection Sort:
        *  For each element, find minimum value of array and swap.
        */
    }


}
