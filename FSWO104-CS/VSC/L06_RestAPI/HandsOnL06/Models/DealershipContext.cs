using Microsoft.EntityFrameworkCore;
namespace HandsOnL06.Models {
    public class DealershipContext : DbContext {
        public DbSet<Car> Cars { get; set; }

        protected override void OnConfiguring (DbContextOptionsBuilder builder) => builder.UseSqlite ("Filename=DealershipContext.db");
    }
}