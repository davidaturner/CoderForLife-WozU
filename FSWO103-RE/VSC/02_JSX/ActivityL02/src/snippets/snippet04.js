import React from "react";
import ReactDOM from "react-dom";

// Render
ReactDOM.render(
  <div>
    <h1>My Favorite Things</h1>
    <ul>
      <li className="favcolors">Favorite Colors</li>
      <ol>
        <li>Green</li>
        <li>Blue</li>
        <li>Red</li>
      </ol>
      <li className="favmusic">Favorite Music</li>
      <ol>
        <li>The Beatles</li>
        <li>David Bowie</li>
        <li>Public Enemy</li>
      </ol>
      <li className="favfood">Favorite Food</li>
      <ol>
        <li>Eggs</li>
        <li>Chicken</li>
        <li>Coffee</li>
      </ol>
      <li className="favwebsites">Favorite Websites</li>
      <ol>
        <li>
          <a href="https://www.google.com">www.google.com</a>
        </li>
        <li>
          <a href="https://www.linkedin.com">www.linkedin.com</a>
        </li>
        <li>
          <a href="https://www.youtube.com">www.youtube.com</a>
        </li>
      </ol>
    </ul>
  </div>,
  document.getElementById("root")
);
