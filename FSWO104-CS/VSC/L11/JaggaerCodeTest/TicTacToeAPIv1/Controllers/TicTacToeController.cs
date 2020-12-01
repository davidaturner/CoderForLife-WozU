using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using TicTacToeAPIv1.Models;

namespace TicTacToeAPIv1.Controllers {
    [Route ("v1/[controller]")]
    [ApiController]
    public class TicTacToeController : ControllerBase {
        private TicTacToePositionContext _context;
        private TicTacToePositionEvaluator _eval;

        public TicTacToeController (TicTacToePositionContext context) {
            _context = context;
            _eval = new TicTacToePositionEvaluator ();
        }

        [HttpGet]
        public ActionResult<IEnumerable<TicTacToePositionJSON>> Get () {
            return _context.Positions.ToList<TicTacToePositionJSON> ();
        }

        [HttpGet ("{id}")]
        public ActionResult<TicTacToePositionJSON> Get (int id) {
            return _context.Positions
                .Where (b => b.Id == id)
                .FirstOrDefault<TicTacToePositionJSON> ();
        }

        [HttpPost]
        public void Post ([FromBody] TicTacToePositionJSON json) {
            EvaluatePosition (json);
        }

        [HttpPost ("solver")]
        public ActionResult<TicTacToePositionStateJSON> Evaluate ([FromBody] TicTacToePositionJSON json) {
            return new TicTacToePositionStateJSON (EvaluatePosition (json));
        }
        private string EvaluatePosition (TicTacToePositionJSON position) {
            _eval.Embark (position);
            _eval.Evaluate ();
            TicTacToePositionJSON positionEvaluated = _eval.Disembark ();
            _context.Positions.Add (positionEvaluated);
            _context.SaveChanges ();
            return positionEvaluated.State;
        }
    }
}