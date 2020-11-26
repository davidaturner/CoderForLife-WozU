using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

namespace SimpleWebAPI.Controllers {

    [Route ("api/[controller]")]
    public class MathController : ControllerBase {

        private readonly ILogger<MathController> _logger;

        public MathController (ILogger<MathController> logger) {
            _logger = logger;
        }

        [HttpGet ("{x:int}/{y:int}")]
        public int Get (int x, int y) {

            return x + y;
        }

    }
}