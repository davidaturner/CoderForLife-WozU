import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

ReactDOM.render(
  React.createElement('ul', {},
    React.createElement('li',{}, 'Apples',
      React.createElement('ul', {},
        React.createElement('li', {}, '$1.00 per lb')
      )
    ),
    React.createElement('li', {}, 'Oranges',
      React.createElement('ul', {},
        React.createElement('li', {}, '$.70 per lb')
      )
    ),
    React.createElement('li', {}, 'Mangos',
      React.createElement('ul', {}, 
        React.createElement('li', {}, '$2.00 per lb'))
    )
  ),
  document.getElementById('root')
);
