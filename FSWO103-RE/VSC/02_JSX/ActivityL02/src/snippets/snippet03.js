import React from "react";
import ReactDOM from "react-dom";

ReactDOM.render(
  <ul>
    <li>Apples</li>
    <ul>
      <li>"$1.00 per lb"</li>
    </ul>
    <li>Oranges</li>
    <ul>
      <li>"$0.70 per lb"</li>
    </ul>

    <li>Mangos</li>
    <ul>
      <li>"$2.00 per lb"</li>
    </ul>
  </ul>,
  document.getElementById("root")
);
