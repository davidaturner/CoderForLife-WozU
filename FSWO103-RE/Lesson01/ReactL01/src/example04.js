import React from "react";
import ReactDOM from "react-dom";
ReactDOM.render(
  React.createElement(
    "div",
    { name: "div1" },
    React.createElement("div", { name: "div2" }, "Child1"),
    React.createElement("div", { name: "div3" }, "Child2")
  ),

  document.getElementById("root")
);
