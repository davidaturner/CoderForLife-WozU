using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// More class and class methods found in Turnerstuff folder.

namespace Activity
{
    // new nested namespace
    namespace NewNestedNamespace
    {
        class MyExample
        {
            public static void Print()
            {
                Console.WriteLine("Calling newnestednamespace member.");
            }
        }
    }

    class MyPersonal
    {
        public static void Print()
        {
            Console.WriteLine("Calling mypersonal namespace member..");
        }
    }
}
namespace Activity.NestedNamespace
{
    class FinalExample
    {
        public static void Print()
        {
            Console.WriteLine("Calling finalexample nestednamespace member.");
        }
    }
}

namespace PrivateNamespace
{
    class MyExample
    {
        public static void Print()
        {
            Console.WriteLine("Calling private namespace member.");
        }
    }
}

