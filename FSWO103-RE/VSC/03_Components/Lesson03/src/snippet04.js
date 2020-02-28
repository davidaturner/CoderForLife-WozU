import React from "react";
import ReactDOM from "react-dom";
// import PropTypes from "prop-types";

// const App = props => {
//   return <List items={listItems} />;
// };

// const items = ["Bread", "Eggs", "Milk", "Tea"];
// const listItems = [];

// for (let i = 0; i < items.length; i++) {
//   listItems.push(<li key={i}>{items[i]}</li>);
// }

// const List = props => <ul>{props.items}</ul>;

// ReactDOM.render(<App />, document.getElementById("root"));

// ReactDOM.render(
//   React.createElement(
//     "ul",
//     {},
//     React.createElement("li", { className: "marker" }, "Bread"),
//     React.createElement("li", {}, "Eggs"),
//     React.createElement("li", {}, "Bacon"),
//     React.createElement("li", {}, "Whole Milk")
//   ),
//   document.getElementById("root")
// );

const App = props => {
  const items = ["Bread", "Eggs", "Bacon", "Tea"];
  return <List items={items}></List>;
};

const List = props => {
  const itemsList = props.items.map((item, index) => (
    <li key={index} className="marker">
      {item}
    </li>
  ));
  return <ul>{itemsList}</ul>;
};

ReactDOM.render(<App></App>, document.getElementById("root"));

// ReactDOM.render(
//   <div>
//     <h1 className="redb marker">Hello, World!</h1>
//   </div>,
//   root
// );
