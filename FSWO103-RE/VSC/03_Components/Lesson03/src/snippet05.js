import React from "react";
import ReactDOM from "react-dom";
// import PropTypes from "prop-types";

// const App0 = props => {
//   const planets = ["Earth", "Mars", "Venus"];
//   const planetList = planets.map(planet => <div>{planet}</div>);
//   return <div>{planetList}</div>;
// };

// ReactDOM.render(<App0 />, document.getElementById("root"));

// const App0 = props => {
//   const planets = ["Earth", "Mars", "Venus"];
//   const planetList = planets.map(planet => <div>{planet}</div>);
//   //   return <div>{planetList}</div>;
//   return (
//     <div>
//       <div>{planetList[0]}</div>
//       <div>{planetList[1]}</div>
//       <div>{planetList[2]}</div>
//     </div>
//   );
// };

// ReactDOM.render(<App0 />, document.getElementById("root"));

const observatory = "Lowell";

const App = props => {
  const planets = [{ name: "Earth" }, { name: "Mars" }, { name: "Venus" }];
  return (
    <div>
      <h1>{props.page}</h1>
      <div>{observatory}</div>
      <List items={planets} />
    </div>
  );
};

const List = props => {
  const listItems = props.items.map((item, index) => (
    <li key={index}>{item.name}</li>
  ));
  return <ul>{listItems}</ul>;
};

ReactDOM.render(
  <App page="Home" className="marker" />,
  document.getElementById("root")
);

// ReactDOM.render(
//   <div>
//     <h1 className="redb marker">Hello, World!</h1>
//   </div>,
//   root
// );
