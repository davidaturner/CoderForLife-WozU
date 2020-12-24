using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using HandsOnL07.Models;

namespace HandsOnL07.Data
{
    public class ApplicationDbContext : IdentityDbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
            : base(options)
        {
        }

        public DbSet<Movie> Movies { get; set; }
        public DbSet<Playlist> Playlists { get; set; }
        public DbSet<PlaylistMovie> PlaylistMovies { get; set; }

        protected override void OnModelCreating(ModelBuilder builder) {
            base.OnModelCreating(builder);
            builder.Entity<PlaylistMovie>().HasKey(pm => new { pm.PlaylistId, pm.MovieId });

            //One to many relationship
            builder.Entity<PlaylistMovie>()
                .HasOne<Playlist>(pm => pm.Playlist)
                .WithMany(p => p.PlaylistMovies)
                .HasForeignKey(pm => pm.PlaylistId);

            //One to many relationship
            builder.Entity<PlaylistMovie>()
                .HasOne<Movie>(pm => pm.Movie)
                .WithMany(m => m.PlaylistMovies)
                .HasForeignKey(pm => pm.MovieId);

        }
    }
}
