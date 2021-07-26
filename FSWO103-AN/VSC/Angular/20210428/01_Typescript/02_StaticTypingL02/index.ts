console.log("Ready!")

// Type examples
const sandwich : string = "BLT";
const orderNumber : number = 1738;
const isDelicious : boolean = true;

// Types on function example
function orderfood( sandwich : string) : number {
    var orderNumber;
    orderNumber = 1738;
    console.log("Your sandwich, a " + sandwich + ", is order number : " + orderNumber + ".");
    return orderNumber;
}

orderfood(sandwich);