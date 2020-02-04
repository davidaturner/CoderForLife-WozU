import React from "react";
import ReactDOM from "react-dom";

// Create as a function to be run.
function groceryList(item1, item2, item3) {
  var root = document.getElementById("root");

  ReactDOM.render(
    <div>
      <ul>
        <li>{item1}</li>
        <li>{item2}</li>
        <li>{item3}</li>
      </ul>
    </div>,
    root
  );
}
// groceryList("Apples", "Oranges", "Mangos");

// Create as a function returning html - example 1.
function returngroceryList(item1, item2, item3) {
  return (
    <div>
      <ul>
        <li>{item1}</li>
        <li>{item2}</li>
        <li>{item3}</li>
      </ul>
    </div>
  );
}
//ReactDOM.render(returngroceryList("Apples", "Pears", "Mangos"), root);

// Create as a function returning html - example 2.
function returnh1(message) {
  return <h1>{message}</h1>;
}
//ReactDOM.render(returnh1("Hello, World"), root);

// Create as a function returning html - example 3.
var messageArray = ["Apples", "Oranges", "Peaches"];
const fullList = (item1, item2, item3) => {
  return (
    <ul>
      <li>{item1}</li>
      <li>{item2}</li>
      <li>{item3}</li>
    </ul>
  );
};
ReactDOM.render(
  fullList(messageArray[0], messageArray[1], messageArray[2]),
  root
);
