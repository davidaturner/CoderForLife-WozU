import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

const item1 = 'Apples';
const item1Price = '$1.00 per lb';
const item2 = 'Oranges';
const item2Price = '$.70 per lb';
const item3 = 'Mangos';
const item3Price = '$2.00 per lb';

ReactDOM.render(
  <ul>
    <li>{item1}</li>
    <ul>
      <li>{item1Price}</li>
    </ul>
    <li>{item2}</li>
    <ul>
      <li>{item2Price}</li>
    </ul>
    <li>{item3}</li>
    <ul>
      <li>{item3Price}</li>
    </ul>
  </ul>,
  document.getElementById('root')
);
