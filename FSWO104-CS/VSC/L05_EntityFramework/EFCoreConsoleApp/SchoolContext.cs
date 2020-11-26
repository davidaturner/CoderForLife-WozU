using Microsoft.EntityFrameworkCore;
namespace EFCoreConsoleApp
{
    public class SchoolContext : DbContext
    {
        public DbSet<Student> Students { get; set; }
        public DbSet<Course> Courses { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder options) => options.UseSqlite("Filename=SchoolContext.db");
    }
}