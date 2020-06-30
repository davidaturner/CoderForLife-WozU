const sandwich: string = "BLT";
const orderNumber: number = 1738;
const delicious: boolean = true;

console.log(sandwich);
console.log(orderNumber);
console.log(delicious);

function orderFood(sandwich: string, orderNumber: number): void {
  console.log(
    "Your order number is " +
      orderNumber +
      " and contains a " +
      sandwich +
      " sandwich."
  );
}

orderFood(sandwich, orderNumber);
