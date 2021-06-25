using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Final
{
    namespace blingblong
    {
        public class BlingBlong
        {
            public static int PlayUpToValue = 20;
            public static string calculateBlingBlongValue(int i)
            {
                if (i % 3 == 0 && i % 5 == 0)
                {
                    return "BlingBlong";
                } else
                {
                    if (i % 5 == 0)
                    {
                        return "Blong";
                    } else if (i % 3 == 0)
                    {
                        return "Bling";
                    }
                }
                return i.ToString();
            }

            public static void play()
            {
                for(int i=1; i<= PlayUpToValue; i++)
                {
                    Console.WriteLine(calculateBlingBlongValue(i));
                }
            }
        }
    }

}
