import React from "react";
import ReactDOM from "react-dom";
// <ul>
//     <li>Apples</li>
//     <ul>
//         <li>$1.00 per lb</li>
//     </ul>
//     <li>Oranges</li>
//     <ul>
//         <li>$.70 per lb</li>
//     </ul>
//     <li>Mangos</li>
//     <ul>
//         <li>$2.00 per lb</li>
//     </ul>
// </ul>
const apples = React.createElement("li", {}, "Apples");
const oranges = React.createElement("li", {}, "Oranges");
const mangos = React.createElement("li", {}, "Mangos");

const pricePerApple = React.createElement("li", {}, "$1.22 per lb");
const pricePerOrange = React.createElement("li", {}, "$.60 per lb");
const pricePerMango = React.createElement("li", {}, "$2.10 per lb");

ReactDOM.render(
  React.createElement(
    "ul",
    {},
    React.createElement("li", {}, "Apples"),
    React.createElement("ul", {}, pricePerApple),
    React.createElement("li", {}, "Oranges"),
    React.createElement("ul", {}, pricePerOrange),
    mangos,
    React.createElement("ul", {}, pricePerMango)
  ),
  document.getElementById("root")
);
