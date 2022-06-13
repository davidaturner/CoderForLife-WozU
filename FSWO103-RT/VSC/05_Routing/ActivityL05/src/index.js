import React from "react";
import ReactDOM from "react-dom";
import Home from "./screens/Home";
import About from "./screens/About";
import Topics from "./screens/Topics";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

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
            <Link to="/topics">Topics</Link>
          </li>
        </ul>

        <hr></hr>

        <Route exact path="/" component={Home}></Route>
        <Route path="/about" component={About}></Route>
        <Route path="/topics" component={Topics}></Route>
      </div>
    </Router>
  );
};

ReactDOM.render(<App></App>, document.getElementById("root"));
