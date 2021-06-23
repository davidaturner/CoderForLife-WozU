using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_Virtualoverride
{
    namespace members
    {
        public class MemberVIP : Member
        {
			public MemberVIP() : base()
            {
                BenefitLevel = 1;
            }

			public MemberVIP(string name, int benefitLevel)
				: base(name)
            {
                BenefitLevel = benefitLevel;
            }

            public override string Name
            {
                get
                {
                    return (this.name == "") ? "Unknown VIP Member" : this.name;
                }
                set
                {
                    this.name = value;
                }
            }
            public int BenefitLevel { get; set; }

			public static int GetPremiumBenefits(MemberVIP member)
            {
                return 20;
            }

            public override double CalculateBenefits()
            {
                return base.CalculateBenefits() + GetPremiumBenefits(this);
            }

            public override void print()
            {
                Console.WriteLine("VIP Member: Name: {0} Level: {1} Benefits: {2}", 
					Name, BenefitLevel, CalculateBenefits());
            }
        }
    }
}
