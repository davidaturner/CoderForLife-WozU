import React from "react";
import ReactDOM from "react-dom";

const colorA = React.createElement("li", { className: "highlighted" }, "Blue");
const colorB = React.createElement("li", {}, "Green");
const colorC = React.createElement("li", {}, "Purple");
const myColorList = React.createElement("ol", {}, colorA, colorB, colorC);

const musicA = React.createElement("li", {}, "Fleetwood Mac");
const musicB = React.createElement(
  "li",
  { className: "highlighted" },
  "The Beatles"
);
const musicC = React.createElement("li", {}, "Depeche Mode");
const myMusicList = React.createElement("ol", {}, musicA, musicB, musicC);

const foodA = React.createElement("li", { className: "highlighted" }, "Eggs");
const foodB = React.createElement("li", {}, "Salad");
const foodC = React.createElement("li", {}, "Bacon");
const myFoodList = React.createElement("ol", {}, foodA, foodB, foodC);

const websiteA = React.createElement(
  "li",
  {},
  React.createElement(
    "a",
    { href: "https://www.google.com", target: "_blank" },
    "www.google.com"
  )
);
const websiteB = React.createElement(
  "li",
  {},
  React.createElement(
    "a",
    { href: "https://www.twitter.com", target: "_blank" },
    "www.twitter.com"
  )
);
const websiteC = React.createElement(
  "li",
  { className: "highlighted" },
  React.createElement(
    "a",
    { href: "https://www.linkedin.com", target: "_blank" },
    "www.linkedin.com"
  )
);
const myWebsiteList = React.createElement(
  "ol",
  {},
  websiteA,
  websiteB,
  websiteC
);

ReactDOM.render(
  React.createElement(
    "div",
    { className: "sourcesanspro" },
    React.createElement("h2", {}, "My Favorite Things"),
    React.createElement(
      "ul",
      {},
      React.createElement("li", {}, "Favorite Colors", myColorList),
      React.createElement("br", {}),
      React.createElement("li", {}, "Favorite Music", myMusicList),
      React.createElement("br", {}),
      React.createElement("li", {}, "Favorite Food", myFoodList),
      React.createElement("br", {}),
      React.createElement("li", {}, "Favorite Websites", myWebsiteList)
    )
  ),
  document.getElementById("root")
);
