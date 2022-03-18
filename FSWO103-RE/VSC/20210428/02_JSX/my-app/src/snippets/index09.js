import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function groceryList(item1, item2, item3) {
  return (
    <ul>
      <li>{item1}</li>
      <li>{item2}</li>
      <li>{item3}</li>
    </ul>
  );
}

ReactDOM.render(
  groceryList('Apples', 'Oranges', 'Mangos'),
  document.getElementById('root')
);
