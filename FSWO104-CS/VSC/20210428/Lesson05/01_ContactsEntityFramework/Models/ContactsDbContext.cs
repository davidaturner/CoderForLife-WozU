using Microsoft.EntityFrameworkCore;

namespace _01_ContactsEntityFramework.Models
{
    public class ContactsDbContext : DbContext
    {
        public ContactsDbContext(DbContextOptions<ContactsDbContext> options) : base(options)
        {

        }
        public DbSet<Contact> Contacts { get; set; }
    }
}