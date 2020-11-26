using Microsoft.EntityFrameworkCore;
namespace ContactsEntityFramework.Models {

    public class ContactsContext : DbContext {

        public DbSet<Contact> Contacts { get; set; }
        protected override void OnConfiguring (DbContextOptionsBuilder builder) => builder.UseSqlite ("Filename=ContactsEntityFramework.db");
    }
}