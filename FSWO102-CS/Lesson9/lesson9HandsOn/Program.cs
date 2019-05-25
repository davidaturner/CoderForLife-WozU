using System;

namespace lesson9HandsOn
{
    class Program
    {
        static void Main(string[] args)
        {
            // COMPILE ERROR 1: Initializing numbers array with square brackets.
            // COMPILE ERROR 2: The name 'number' does not exist in current context.
            // COMPILE ERROR 3: Use of unassigned local variable 'sum'.
            // REALTIME ERROR :  Index was outside the bounds of the array.
            // LOGICAL ERROR 1: For loop never reached. Condition i never true.
            // LOGICAL ERROR 2: To properly sum all elements i must be incremented.
            int[] numbers = new int[] { 4, 7, 29, 43, 12, 20, 88, 121 };
            int sum = 0;

            Console.WriteLine("Before for Loop: sum: " + sum);
            Console.Write("Updating sum in for loop: ");
            for (int i = 0; i < numbers.Length; i++)
            {
                sum += numbers[i];
                Console.Write(sum + " ");
            }
            Console.WriteLine();
            Console.WriteLine("Final result: sum: " + sum);
        }
    }
}
