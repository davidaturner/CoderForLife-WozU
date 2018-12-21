using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FSWO103_AN.Lesson1;

namespace FSWO103_AN
{
    class Program
    {
        static void Main()
        {
            Lesson1HandsOn();

        }

        static void Lesson1HandsOn()
        {
            ContactCard myContact = new ContactCard();
            Console.WriteLine(myContact.FirstName + " " + myContact.LastName);
            Console.WriteLine(myContact.Birthday);
            Console.WriteLine();
            Console.WriteLine("Find me!");
            Console.WriteLine(myContact.FormatPhoneNumber(412));
            Console.WriteLine(myContact.EmailAddress);
            Console.WriteLine(myContact.SlackAddress);
            Console.WriteLine();
            myContact.SendMessage();
            myContact.AddToFavorites();
            Console.ReadLine();
        }
    }
}
