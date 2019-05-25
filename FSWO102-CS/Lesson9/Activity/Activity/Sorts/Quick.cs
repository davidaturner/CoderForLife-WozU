using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity.Sorts
{
    class Quick
    {
        // ASSUMPTION: Input is int values, no duplicates.

        static public void Sort(int[] numbers)
        {
            ToIntArray(Sort(new ArrayList(numbers)), numbers);

            /* Quicksort:
             *      Convert int[] into ArrayList to dynamic processing.
             *      Recursive split ArrayList into low, pivotal, and high pieces
             *      according to a value in original ArrayList.
             *      Overwrite original numbers with merged result.
             */
        }

        static private ArrayList Sort(ArrayList numbers)
        {
            // Base case.
            if (numbers == null || numbers.Count < 2)
            {
                return numbers;
            }

            // Recursive case.
            ArrayList low = new ArrayList();
            ArrayList high = new ArrayList();
            ArrayList pivotal = new ArrayList();
           
            for(int i=0, pval = (int)numbers[numbers.Count / 2]; 
                i<numbers.Count; i++)
            {
                if ((int)numbers[i] < pval)
                {
                    low.Add(numbers[i]);
                }
                else if ((int)numbers[i] > pval)
                {
                    high.Add(numbers[i]);
                }
                else
                {
                    pivotal.Add(numbers[i]);
                }
            }

            return Merge(Sort(low), pivotal, Sort(high));

        }

        static public ArrayList Merge(ArrayList low, ArrayList pivotal, ArrayList high)
        {
            ArrayList results = new ArrayList();
            results.AddRange(low);
            results.AddRange(pivotal);
            results.AddRange(high);

            return results;
        }

        static public void ToIntArray(ArrayList sorted, int []numbers)
        {
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = (int)sorted[i];
            }
        }

    }
}
