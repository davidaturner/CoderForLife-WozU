using System.Collections.Generic;
namespace HandsOnL07.Models
{
    public class Movie
    {
        public int MovieId { get; set; }
        public string Title { get; set; }
        public ICollection<PlaylistMovie> PlaylistMovies { get; set; }
    }
}