using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Activity.Algorithms;

namespace Activity.Sorts
{
    class Merge
    {
        static public void Sort(int[] numbers)
        {
            Utility.ToNumbers(Sort(new List<int>(numbers)), numbers);
        }

        static private List<int> Sort(List<int> numbers)
        {
            // Base case.
            if (numbers == null || numbers.Count < 2)
            {
                return numbers;
            }

            // Recursive case.
            List<int> larr = new List<int>();
            List<int> rarr = new List<int>();

            for(int i=0, index=numbers.Count/2; i<numbers.Count; i++)
            {
                if (i<index)
                {
                    larr.Add(numbers[i]);
                }
                else
                {
                    rarr.Add(numbers[i]);
                }
            }

            return MergeLeftAndRight(Sort(larr), Sort(rarr));
        }

        static private List<int> MergeLeftAndRight(List<int> left, List<int> right)
        {
            List<int> results = new List<int>();

            for(int l=0, r=0; l<left.Count || r<right.Count; )
            {

                if (l==left.Count)
                {
                    results.Add(right[r++]);
                }
                else if (r==right.Count)
                {
                    results.Add(left[l++]);
                }
                else
                {
                    if (left[l] < right[r])
                    {
                        results.Add(left[l++]);
                    }
                    else
                    {
                        results.Add(right[r++]);
                    }
                }
            }

            return results;
        }
    }
}
