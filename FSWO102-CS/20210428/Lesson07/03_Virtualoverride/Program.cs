using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
// Members
using Member = _03_Virtualoverride.members.Member;
using MemberVIP = _03_Virtualoverride.members.MemberVIP;

namespace _03_Virtualoverride
{
    class Program
    {
        static void Main(string[] args)
        {
            MemberVIP blankMemberVIP = new MemberVIP();
            blankMemberVIP.print();
            Member blankMember = new Member();
            blankMember.print();
            Console.WriteLine();

            /*
                // Create some new employees.
                PremiumMember member1 = new PremiumMember("Alice", 11200, 500);
                Member member2 = new Member("Bob", 11200);
                Console.WriteLine("Premium Member: " + member1.name + " paid " + member1.CalculateSupplies());
                Console.WriteLine("Member: " + member2.name + " paid " + member2.CalculateSupplies());
            */

            MemberVIP member1 = new MemberVIP("Alice", 1);
            Member member2 = new Member("Bob");
            Console.WriteLine("VIP Member: " + member1.Name + " were paid " + member1.CalculateBenefits() + " benefits.");
            Console.WriteLine("Member: " + member2.Name + " were paid " + member2.CalculateBenefits() + " benefits.");

            Console.WriteLine();
            //
            Console.ReadLine();
        }
    }
}
