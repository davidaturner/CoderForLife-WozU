using Microsoft.AspNetCore.Mvc;
using HandsOnL07.Data;
namespace HandsOnL07.Controllers
{
    public class MoviesController : Controller
    {
        private readonly ApplicationDbContext _context;

        public MoviesController(ApplicationDbContext context)
        {
            _context = context;
        }

        public IActionResult Index() {
            return View();
        }

        public IActionResult Create() {
            return View();
        }

        public IActionResult Delete() {
            return View();
        }

        public IActionResult Find() {
            return View();
        }

        public IActionResult Update() {
            return View();
        }
    }
}