import React from "react";
import ReactDOM from "react-dom";

ReactDOM.render(
  <ul>
    <li>Favorite Color</li>
    <ol>
      <li>Blue</li>
      <li>Green</li>
      <li>Gold</li>
    </ol>
    <li>Favorite Music</li>
    <ol>
      <li>Fleetwood Mac</li>
      <li>The Beatles</li>
      <li>Depeche Mode</li>
    </ol>
    <li>Favorite Food</li>
    <ol>
      <li>Eggs</li>
      <li>Salad</li>
      <li>Bacon</li>
    </ol>
    <li>Favorite Websites</li>
    <ol>
      <li>
        <a href="http://google.com" target="_blank">
          www.google.com
        </a>
      </li>
      <li>
        <a href="http://twitter.com" target="_blank">
          www.twitter.com
        </a>
      </li>
      <li>
        <a href="http://linkedin.com" target="_blank">
          www.linkedin.com
        </a>
      </li>
    </ol>
  </ul>,
  document.getElementById("root")
);
