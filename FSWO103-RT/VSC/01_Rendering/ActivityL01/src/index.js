import React from "react";
import ReactDOM from "react-dom";

const apples = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "$1.00 per lb")
);
const oranges = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "$0.70 per lb")
);
const mangos = React.createElement(
  "ul",
  {},
  React.createElement("li", {}, "$2.00 per lb")
);

ReactDOM.render(
  React.createElement(
    "ul",
    {},
    React.createElement("li", {}, "Apples", apples),
    React.createElement("li", {}, "Oranges", oranges),
    React.createElement("li", {}, "Mangos", mangos)
  ),
  document.getElementById("root")
);
