using Microsoft.AspNetCore.Mvc;

namespace SimpleWebApi31.Controllers {

    [Route("api/[Controller]")]
    public class MathController : ControllerBase {

        [HttpGet("{x:int}/{y:int}")]
        public int Get(int x, int y) {
            return x + y;
        }
    }
}