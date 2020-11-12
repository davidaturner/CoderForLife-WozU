using Microsoft.EntityFrameworkCore;
using MySQL.Data.EntityFrameworkCore.Diagnostics;

namespace EFConsoleMySql
{
    public class LibraryContext : DbContext
    {
        public DbSet<Book> Book { get; set; }

        public DbSet<Publisher> Publisher { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder options) {
            options.UseMySQL("server=localhost;database=library;user=root;password=Password1");
        }

        protected override void OnModelCreating(ModelBuilder builder) {
            base.OnModelCreating(builder);

            builder.Entity<Publisher>(entity => {
                entity.HasKey(e => e.ID);
                entity.Property(e => e.Name).IsRequired();
            });

            builder.Entity<Book>(entity => {
                entity.HasKey(e => e.ISBN);
                entity.Property(e => e.Title).IsRequired();
                entity.HasOne(d => d.Publisher)
                    .WithMany(p => p.Books);
            });
        }
    }
}