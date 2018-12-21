using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FSWO103_AN.Lesson1.Interfaces;

namespace FSWO103_AN.Lesson1
{
    public class ContactCard : IPersonable, IContactable
    {
        public ContactCard()
        {
            LastName = "Turner";
            FirstName = "Sam";

            Birthday = new DateTime(1933, 1, 5);

            PhoneNumber = 2233879;
            EmailAddress = "turnin19@earthlink.net";

            SlackAddress = "davidaturner";
        }

        public void SendMessage()
        {
            Console.WriteLine("Sending a message");
        }
        public void AddToFavorites()
        {
            Console.WriteLine("Add to Favorites");
        }

        public string LastName { get; set; }
        public string FirstName { get; set; }
        public DateTime Birthday { get; set; }

        public int PhoneNumber { get; set; }
        public string EmailAddress { get; set; }
        public string SlackAddress { get; set; }

        public string FormatPhoneNumber(int areaCode)
        {
            string convertedNumber = "XXX";
            if (areaCode > 0)
            {
                convertedNumber = areaCode.ToString();
            }
            convertedNumber += PhoneNumber.ToString();
            return FormatPhoneNumber(convertedNumber);

        }
        public string FormatPhoneNumber(string number)
        {
            return "(" + number.Substring(0, 3) +
                     ")" + number.Substring(3, 3) +
                    "-" + number.Substring(6);
        }
    }
}
