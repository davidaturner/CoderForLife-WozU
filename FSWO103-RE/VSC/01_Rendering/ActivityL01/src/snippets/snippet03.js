import React from "react";
import ReactDOM from "react-dom";

ReactDOM.render(
  React.createElement(
    "a",
    { href: "https://google.com" },
    "Take me to google.com"
  ),
  document.getElementById("root")
);
