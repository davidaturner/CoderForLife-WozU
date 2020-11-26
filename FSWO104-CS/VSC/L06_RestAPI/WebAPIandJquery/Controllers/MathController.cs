using Microsoft.AspNetCore.Mvc;

namespace WebAPIandJquery.Controllers {
    [Route("api/[controller]/add")]
    public class MathController : Controller {
        // GET api/math/add/3/4 -> 7
        [HttpGet("{x:int}/{y:int}")]
        public int Get(int x, int y) {
            return x + y; // add
        }
    }
}