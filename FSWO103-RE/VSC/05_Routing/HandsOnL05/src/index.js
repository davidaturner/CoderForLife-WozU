import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import Home from "./screens/Home";
import About from "./screens/About";
import FavoriteThings from "./screens/FavoriteThings";

const App = () => {
  return (
    <Router>
      <div>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/about">About</Link>
          </li>
          <li>
            <Link to="/favorite">Favorite Things</Link>
          </li>
        </ul>
        <Route exact path="/" component={Home}></Route>
        <Route path="/about" component={About}></Route>
        <Route path="/favorite" component={FavoriteThings}></Route>
      </div>
    </Router>
  );
};

ReactDOM.render(<App></App>, document.getElementById("root"));
