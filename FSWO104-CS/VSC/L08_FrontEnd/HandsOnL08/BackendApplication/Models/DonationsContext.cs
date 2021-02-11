using Microsoft.EntityFrameworkCore;

namespace BackendApplication.Models
{
    public class DonationsContext : DbContext
    {
        public DonationsContext(DbContextOptions<DonationsContext> options)
            : base(options)
        {

        }
        public DbSet<Donation> Donations { get; set; }
    }
}