using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;

namespace WebAuthExampleEpTwo.Data {
    public class AppDbContext : IdentityDbContext {
        public AppDbContext (DbContextOptions<AppDbContext> options) : base (options) {

        }
    }
}