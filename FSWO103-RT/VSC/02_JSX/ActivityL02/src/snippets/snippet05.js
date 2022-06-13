import React from "react";
import ReactDOM from "react-dom";

const apples = "Apples";
const applesPricePerLb = "$1.00 per lb";
const oranges = "Oranges";
const orangesPricePerLb = "$0.70 per lb";
const mangos = "Mangos";
const mangosPricePerLb = "$2.00 per lb";

// Render
ReactDOM.render(
  <ul>
    <li>{apples}</li>
    <ul>
      <li>{applesPricePerLb}</li>
    </ul>
    <li>{oranges}</li>
    <ul>
      <li>{orangesPricePerLb}</li>
    </ul>
    <li>{mangos}</li>
    <ul>
      <li>{mangosPricePerLb}</li>
    </ul>
  </ul>,
  document.getElementById("root")
);
