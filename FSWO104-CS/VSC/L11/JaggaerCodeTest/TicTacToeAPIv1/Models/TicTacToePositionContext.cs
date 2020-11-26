using Microsoft.EntityFrameworkCore;
namespace TicTacToeAPIv1.Models {
    public class TicTacToePositionContext : DbContext {
        public DbSet<TicTacToePositionJSON> Positions { get; set; }

        protected override void OnConfiguring (DbContextOptionsBuilder builder) => builder.UseSqlite ("Filename=TicTacToeContext.db");
    }
}