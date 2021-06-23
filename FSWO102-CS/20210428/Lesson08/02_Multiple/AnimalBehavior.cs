using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Multiple
{
    namespace animalBehavior
    {
        public class BirthMethod
        {
            public static string DONTKNOW = "Birth Method? Gosh! I don't rightly know.";
            public static string GIVELIVE = "I give live birth.";
            public static string LAYEGGS = "I lay eggs.";
        }

        public class TalkMethod
        {
            public static string DONTKNOW = "I am silent.";
            public static string CLICK = "I speak in clicks and chirps.";
        }

        public class WalkMethod
        {
            public static string DONTKNOW = "Come on! I cannot walk";
        }

        public class FlyMethod
        {
            public static string DONTKNOW = "Shoot! I cannot fly.";
        }
    }
}
