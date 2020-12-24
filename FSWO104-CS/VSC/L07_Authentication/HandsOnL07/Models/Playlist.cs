using System.Collections.Generic;
namespace HandsOnL07.Models
{
    public class Playlist
    {
        public int PlaylistId { get; set; }
        public string Name { get; set; }
        public string Email { get; set; }
        public string Username { get; set; }
        public ICollection<PlaylistMovie> PlaylistMovies { get; set; }
        
    }
}