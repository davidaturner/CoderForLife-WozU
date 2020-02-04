import React from "react";
import ReactDOM from "react-dom";

//
//<ul>
//  <li>Apples</li>
//  <li>Oranges</li>
//  <li>Mangos</li>
//</ul>
ReactDOM.render(
  React.createElement(
    "ul",
    {},
    React.createElement("li", {}, "Apple"),
    React.createElement("li", {}, "Oranges"),
    React.createElement("li", {}, "Mangos")
  ),
  document.getElementById("root")
);
