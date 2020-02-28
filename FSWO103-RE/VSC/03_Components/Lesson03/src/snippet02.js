import React from "react";
import ReactDOM from "react-dom";

const root = document.getElementById("root");

const groceryListA = (item1, price1, item2, price2, item3, price3) => {
  return (
    <ul>
      <li>{item1}</li>
      <ul>
        <li>{price1}</li>
      </ul>
      <li>{item2}</li>
      <ul>
        <li>{price2}</li>
      </ul>
      <li>{item3}</li>
      <ul>
        <li>{price3}</li>
      </ul>
    </ul>
  );
};

// ReactDOM.render(
//   groceryListA(
//     "Apple",
//     "$1.00 per lb",
//     "Orange",
//     "$0.70 per lb",
//     "Mango",
//     "$2.00 per lb"
//   ),
//   document.getElementById("root")
// );

const groceryListB = (item1, item2, item3) => {
  return (
    <ul>
      <li>{item1}</li>
      <li>{item2}</li>
      <li>{item3}</li>
    </ul>
  );
};

// ReactDOM.render(
//   groceryListB("Apple", "Orange", "Mango"),
//   document.getElementById("root")
// );

const GroceryListC = props => {
  return (
    <ul>
      <li>{props.item1}</li>
      <li>{props.item2}</li>
      <li>{props.item3}</li>
    </ul>
  );
};

ReactDOM.render(
  <GroceryListC item1="Apple" item2="Orange" item3="Mango" />,
  document.getElementById("root")
);

// ReactDOM.render(
//   React.createElement("h1", { className: "redb marker" }, "Hello, World!"),
//   document.getElementById("root")
// );
