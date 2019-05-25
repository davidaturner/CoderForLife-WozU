using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Activity.Algorithms
{
    public class Utility
    {
        static public void ToConsole(List<int> arr)
        {
            for (int i = 0; i < arr.Count; i++)
            {
                Console.Write(arr[i] + " ");
            }
            Console.WriteLine();
        }
        static public void ToConsole(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + " ");
            }
            Console.WriteLine();
        }

        static public void ToNumbers(List<int> sorted, int[] numbers)
        {
            int[] newSorted = sorted.ToArray<int>();
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = newSorted[i];
            }
        }
        static public void ToNumbers(int[] sorted, int[] numbers)
        {
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = sorted[i];
            }
        }

    }
}
