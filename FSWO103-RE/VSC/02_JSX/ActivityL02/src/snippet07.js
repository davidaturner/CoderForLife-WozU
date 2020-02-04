import React from "react";
import ReactDOM from "react-dom";

// Use brackets if const is with HTML section.
const apples = "Apples";
const applescost = "$1.20 per lb";
const oranges = "Oranges";
const orangescost = "$.70 per lb";
const mangos = <li>Mangos</li>;
const fruitList = (
  <ul>
    <li>{apples}</li>
    <ul>
      <li>{applescost}</li>
    </ul>
    <li>{oranges}</li>
    <ul>
      <li> {orangescost}</li>
    </ul>
    {mangos}
    <ul>
      <li>$2.02 per lb</li>
    </ul>
  </ul>
);
// Do not use brackets if const is not in HTML section.
const root = document.getElementById("root");

ReactDOM.render(fruitList, root);
