import React from "react";
import ReactDOM from "react-dom";

// Use brackets if const is with HTML section.
const apples = "Apples";
const applescost = "$1.20 per lb";
const oranges = "Oranges";
const orangescost = "$.70 per lb";

// Do not use brackets if const is not in HTML section.
const root = document.getElementById("root");

ReactDOM.render(
  <ul>
    <li>{apples}</li>
    <ul>
      <li>{applescost}</li>
    </ul>
    <li>{oranges}</li>
    <ul>
      <li> {orangescost}</li>
    </ul>
    <li>Mangos</li>
    <ul>
      <li>$2.00 per lb</li>
    </ul>
  </ul>,
  root
);
