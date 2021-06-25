using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Final
{
    namespace fibonacci
    {
        public class Sequence
        {
            public static void play(int additionalTries)
            {
                var sequence = new List<Int32>();
                for(int i=0; i<additionalTries+3; i++)
                {
                    if (i==0 || i==1)
                    {
                        Console.WriteLine(i);
                        sequence.Add(i);
                    } 
                    else
                    {
                        var newValue = sequence[i - 2] + sequence[i - 1];
                        Console.WriteLine(newValue);
                        sequence.Add(newValue);
                    }
                }
            }
        }
    }

}
