using Microsoft.EntityFrameworkCore;

namespace HandsOnL05.Models
{
    public class ContactsContext : DbContext
    {
        public DbSet<Contact> Contacts { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder options)
            => options.UseSqlite("Filename=ContactsContext.db");
    }
}