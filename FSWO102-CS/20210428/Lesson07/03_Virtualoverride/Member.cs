using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Virtualoverride
{
    namespace members
    {
        public class Member
        {
            protected string name;

            public Member() : this("") {}

            public Member(string name)
            {
                Name = name;
                IsDelinquent = false;
            }

            public virtual string Name
            {
                get
                {
                    return (this.name == "") ? "Unknown Member" : this.name;
                }
                set
                {
                    this.name = value;
                }
            }
            public bool IsDelinquent { get; set; }

            public static int GetBaseBenefits(Member member)
            {
                return 10;
            }

            public virtual double CalculateBenefits()
            {
                return GetBaseBenefits(this);
            }

            public virtual void print()
            {
                Console.WriteLine("Member: Name: {0} Benefits: {1}", Name, CalculateBenefits());
            }
        }
    }
}
