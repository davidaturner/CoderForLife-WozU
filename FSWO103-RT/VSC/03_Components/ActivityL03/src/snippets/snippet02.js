import React from "react";
import ReactDOM from "react-dom";

const AppComponent = (props) => {
  return (
    <div>
      <HelloComponent name="Patrick" />
      <HelloComponent name="Thomas" />
      <HelloComponent name="Porridge" />
    </div>
  );
};

const HelloComponent = (props) => {
  return (
    <div>
      <h1>Hello, {props.name}</h1>
    </div>
  );
};

ReactDOM.render(<AppComponent />, document.getElementById("root"));
