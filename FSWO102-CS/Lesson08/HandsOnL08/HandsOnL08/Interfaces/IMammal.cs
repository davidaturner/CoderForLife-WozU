using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOnL08.Interfaces
{
    interface IMammal : IAnimal
    {
        void Speak();
        void Run();
    }
}
