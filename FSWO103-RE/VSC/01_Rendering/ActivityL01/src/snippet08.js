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

const apples = React.createElement(
  "li",
  {},
  "Apple",
  React.createElement("ul", {}, React.createElement("li", {}, "$1.10 per lb"))
);
const oranges = React.createElement(
  "li",
  {},
  "Oranges",
  React.createElement("ul", {}, React.createElement("li", {}, "$.75 per lb"))
);
const mangos = React.createElement(
  "li",
  {},
  "Mangos",
  React.createElement("ul", {}, React.createElement("li", {}, "$2.03 per lb"))
);
ReactDOM.render(
  React.createElement("ul", {}, apples, oranges, mangos),
  document.getElementById("root")
);
