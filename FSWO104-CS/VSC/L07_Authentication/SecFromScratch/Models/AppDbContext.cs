using Microsoft.EntityFrameworkCore;

namespace SecFromScratch.Models
{
    public class AppDbContext : DbContext
    {
        public DbSet<User> Users { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder builder)
            => builder.UseSqlite("Filename=ApDbContext.db");
    }
}