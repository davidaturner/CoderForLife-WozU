using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO103_AN.Lesson1.Interfaces
{
    public interface IPersonable
    {
        string LastName { get; set; }
        string FirstName { get; set; }

        DateTime Birthday { get; set; }

    }
}
