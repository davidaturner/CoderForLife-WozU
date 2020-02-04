import React from "react";
import ReactDOM from "react-dom";

ReactDOM.render(
  <div>
    <h1 className="iAmClassName">Hello, World!</h1>
    <div>
      <h1 id="iBeAnId">Hello, World!</h1>
    </div>
  </div>,
  document.getElementById("root")
);
