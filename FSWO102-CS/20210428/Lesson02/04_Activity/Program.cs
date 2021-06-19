using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Activity
{
    class Program
    {
        public static class Activity
        {
            public static bool checkEverything(bool bool1, bool bool2, bool bool3)
            {
                bool isAllTrue = false;
                if (bool1 == true && bool2 == true && bool3 == true)
                {
                    isAllTrue = true;
                }
                return isAllTrue;
            }

            public static bool watchWithParent(int age, bool withParent)
            {
                bool canWatch = false;
                if (age >= 18 || (age >= 13 && withParent))
                {
                    canWatch = true;
                }
                return canWatch;

            }
        }

        static void Main(string[] args)
        {
            bool bool1 = true, bool2 = true, bool3 = true;
            int age = 18;
            bool withParent = true;

            Console.WriteLine(Activity.checkEverything(bool1, bool2, bool3));

            Console.WriteLine(Activity.checkEverything(false, bool2, bool3));

            Console.WriteLine(Activity.checkEverything(false, false, false));
            Console.WriteLine();

            Console.WriteLine(Activity.watchWithParent(age, false));

            Console.WriteLine(Activity.watchWithParent(13, withParent));

            Console.WriteLine(Activity.watchWithParent(13, false));

            Console.WriteLine(Activity.watchWithParent(10, withParent));

            Console.WriteLine(Activity.watchWithParent(21, withParent));
            Console.ReadLine();

        }
    }
}
