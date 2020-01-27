import React from "react";
import ReactDOM from "react-dom";

ReactDOM.render(
  React.createElement(
    "ul",
    {},
    React.createElement(
      "li",
      {},
      "Favorite Colors",
      React.createElement(
        "ul",
        {},
        React.createElement("li", {}, "Red"),
        React.createElement("li", {}, "Blue"),
        React.createElement("li", {}, "Green")
      )
    ),

    React.createElement(
      "li",
      {},
      "Favorite Music",
      React.createElement(
        "ul",
        {},
        React.createElement("li", {}, "Red"),
        React.createElement("li", {}, "Blue"),
        React.createElement("li", {}, "Green")
      )
    ),

    React.createElement(
      "li",
      {},
      "Favorite Food",
      React.createElement(
        "ul",
        {},
        React.createElement("li", {}, "Red"),
        React.createElement("li", {}, "Blue"),
        React.createElement("li", {}, "Green")
      )
    ),

    React.createElement(
      "li",
      {},
      "Favorite Websites",
      React.createElement(
        "ul",
        {},
        React.createElement(
          "li",
          {},
          React.createElement(
            "a",
            { href: "https://www.google.com" },
            "www.google.com"
          )
        ),
        React.createElement("li", {}, "Blue"),
        React.createElement("li", {}, "Green")
      )
    )
  ),
  document.getElementById("root")
);
