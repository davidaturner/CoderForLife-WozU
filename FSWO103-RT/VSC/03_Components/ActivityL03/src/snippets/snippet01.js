import React from "react";
import ReactDOM from "react-dom";

const GroceryListComponent = (props) => {
  return (
    <ul>
      <li>{props.item1}</li>
      <ul>
        <li>{props.item1Price}</li>
      </ul>
      <li>{props.item2}</li>
      <ul>
        <li>{props.item2Price}</li>
      </ul>
      <li>{props.item3}</li>
      <ul>
        <li>{props.item3Price}</li>
      </ul>
    </ul>
  );
};

ReactDOM.render(
  <GroceryListComponent
    item1="Apples"
    item1Price="$1.00 per lb"
    item2="Oranges"
    item2Price="$0.70 per lb"
    item3="Mangos"
    item3Price="$2.00 per lb"
  />,
  document.getElementById("root")
);
