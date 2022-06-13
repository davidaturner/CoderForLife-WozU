import React from "react";
import ReactDOM from "react-dom";

const colors = React.createElement(
  "ol",
  {},
  React.createElement("li", {}, "Green"),
  React.createElement("li", {}, "Blue"),
  React.createElement("li", {}, "Red")
);
const music = React.createElement(
  "ol",
  {},
  React.createElement("li", {}, "The Beatles"),
  React.createElement("li", {}, "David Bowie"),
  React.createElement("li", {}, "Public Enemy")
);
const food = React.createElement(
  "ol",
  {},
  React.createElement("li", {}, "Eggs"),
  React.createElement("li", {}, "Chicken"),
  React.createElement("li", {}, "Coffee")
);
const websites = React.createElement(
  "ol",
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
  React.createElement(
    "li",
    {},
    React.createElement(
      "a",
      { href: "https://www.linkedin.com" },
      "www.linkedin.com"
    )
  ),
  React.createElement(
    "li",
    {},
    React.createElement(
      "a",
      { href: "https://www.youtube.com" },
      "www.youtube.com"
    )
  )
);

// Render
ReactDOM.render(
  React.createElement(
    "div",
    {},
    React.createElement("h1", {}, "My Favorite Things"),
    React.createElement(
      "ul",
      {},
      React.createElement(
        "li",
        { className: "favcolors" },
        "Favorite Colors",
        colors
      ),
      React.createElement(
        "li",
        { className: "favmusic" },
        "Favorite Music",
        music
      ),
      React.createElement(
        "li",
        { className: "favfood" },
        "Favorite Food",
        food
      ),
      React.createElement(
        "li",
        { className: "favwebsites" },
        "Favorite Websites",
        websites
      )
    )
  ),
  document.getElementById("root")
);
