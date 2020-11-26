using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using HandsOnL06.Models;
using Microsoft.AspNetCore.Mvc;

namespace HandsOnL06.Controllers {

    [Route ("api/[controller]")]
    [ApiController]
    public class DealershipController : ControllerBase {
        private DealershipContext _context;

        public DealershipController (DealershipContext context) {
            _context = context;
        }

        // GET api/dealership
        [HttpGet]
        public ActionResult<IEnumerable<Car>> Get () {
            var cars = _context.Cars
                .OrderByDescending (c => c.Year)
                .ToList ();
            if (cars == null) {
                Console.WriteLine ("Cars not found.");
            } else {
                return cars;
            }
            return null;
        }

        // GET api/dealership
        [HttpGet ("lowpassengers")]
        public ActionResult<IEnumerable<Car>> GetLowPassengers () {
            var cars = _context.Cars
                .Where (c => c.NumberOfPassengers < 3)
                .OrderByDescending (c => c.Year)
                .ToList ();
            if (cars == null) {
                Console.WriteLine ("Cars not found.");
            } else {
                return cars;
            }
            return null;
        }
        // GET api/dealership/5
        [HttpGet ("{id}")]
        public ActionResult<Car> Get (int id) {
            var car = _context.Cars
                .Where (c => c.Id == id)
                .FirstOrDefault ();
            if (car == null) {
                Console.WriteLine ("Car with " + id + " not found.");
            } else {
                return car;
            }
            return null;
        }

        // POST api/dealership
        [HttpPost]
        public void Post ([FromBody] Car value) {
            _context.Cars.Add (value);
            _context.SaveChanges ();

            // return value.Describe ();
        }

        // PUT api/dealership/5
        [HttpPut ("{id}")]
        public void Put (int id, [FromBody] Car value) {
            var car = _context.Cars
                .Where (c => c.Id == id)
                .FirstOrDefault ();
            if (car != null) {
                if (stringSetToChange (car.Year, value.Year)) {
                    car.Year = value.Year;
                }
                if (stringSetToChange (car.Make, value.Make)) {
                    car.Make = value.Make;
                }
                if (stringSetToChange (car.Model, value.Model)) {
                    car.Model = value.Model;
                }
                if (intSetToChange (car.NumberOfPassengers, value.NumberOfPassengers)) {
                    car.NumberOfPassengers = value.NumberOfPassengers;
                }

                _context.SaveChanges ();
                // return car.Describe ();
            }
            // return null;
        }
        private bool stringSetToChange (string car, string value) {
            return (value != null && car != value) ? true : false;
        }
        private bool intSetToChange (int car, int value) {
            return (value > 0 && car != value) ? true : false;
        }

        // DELETE api/dealership/5
        [HttpDelete ("{id}")]
        public void Delete (int id) { }
    }
}