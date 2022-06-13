import React from "react";
import Thing from "./Thing";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

const FavoriteThings = ({ match }) => {
  return (
    <div>
      <hr />
      <h2>FavoriteThings</h2>
      <ul>
        <li>
          <Link to={`${match.url}/subaru-forester`}>Favorite Car</Link>
        </li>
        <li>
          <Link to={`${match.url}/medium-over-eggs`}>Favorite Food</Link>
        </li>
        <li>
          <Link to={`${match.url}/the-professional`}>Favorite Movie</Link>
        </li>
      </ul>
      <Route path={`${match.url}/:thingId`} component={Thing}></Route>
      <Route
        exact
        path={match.url}
        render={() => <h3>Please select a topic.</h3>}
      />
    </div>
  );
};

export default FavoriteThings;
