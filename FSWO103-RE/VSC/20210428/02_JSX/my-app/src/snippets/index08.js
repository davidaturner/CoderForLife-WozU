import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

const groceryList = (
    <ul>
      <li>Apples</li>
        <ul>
          <li>$1.00 per lb</li>
        </ul>
      <li>Oranges</li>
        <ul>
          <li>$.70 per lb</li>
        </ul>
      <li>Mangos</li>
        <ul>
          <li>$2.00 per lb</li>
        </ul>
    </ul>
);

ReactDOM.render(
  groceryList,
  document.getElementById('root')
);
