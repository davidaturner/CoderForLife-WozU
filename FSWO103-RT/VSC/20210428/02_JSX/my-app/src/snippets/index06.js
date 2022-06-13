import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

const item1 = 'Apples';
const item2 = 'Oranges';
const item3 = 'Mangos';

ReactDOM.render(
  <ul>
    <li>{item1}</li>
    <li>{item2}</li>
    <li>{item3}</li>
  </ul>,
  document.getElementById('root')
);
