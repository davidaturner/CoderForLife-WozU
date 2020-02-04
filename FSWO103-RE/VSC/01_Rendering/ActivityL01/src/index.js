import React from "react";
import ReactDOM from "react-dom";

/* <ul>
  <li>Apples</li>
  <ul>
    <li>$1.00 per lb</li>
  </ul>
  <li>Oranges</li>
  <ul>
    <li>$.70 per lb</li>
  </ul>
  <li>Mangos</li>
  <ul>
    <li>$2.00 per lb</li>
  </ul>
</ul> */
const applesCostPerLb = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "$1.50 per lb")
);
// applesCostPerLb - This is Javascript. Order is important.
const apples = React.createElement("li", {}, "Apples", applesCostPerLb);

const orangesCostPerLb = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "$.70 per lb")
);
const mangosCostPerLb = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "2.30 per lb")
);
ReactDOM.render(
  React.createElement(
    "ul",
    {},
    apples,
    React.createElement("li", {}, "Oranges", orangesCostPerLb),
    React.createElement("li", {}, "Mangos", mangosCostPerLb)
  ),
  document.getElementById("root")
);
