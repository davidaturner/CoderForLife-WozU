using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FSWO103_AN.Lesson1.Interfaces
{
    public interface IContactable
    {
        string FormatPhoneNumber(string phoneNumber);

        int PhoneNumber { get; set; }

        string EmailAddress { get; set; }
        string SlackAddress { get; set; }
    }
}
