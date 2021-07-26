"use strict";
console.log("Ready!");
// Type examples
var sandwich = "BLT";
var orderNumber = 1738;
var isDelicious = true;
// Types on function example
function orderfood(sandwich) {
    var orderNumber;
    orderNumber = 1738;
    console.log("Your sandwich, a " + sandwich + ", is order number : " + orderNumber + ".");
    return orderNumber;
}
orderfood(sandwich);
