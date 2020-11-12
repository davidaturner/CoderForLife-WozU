using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace EFConsoleGetStarted.Model {
    public class Blog {
        public int BlogId { get; set; }
        public string Url { get; set; }

        public List<Post> Posts { get; } = new List<Post> ();
    }
}