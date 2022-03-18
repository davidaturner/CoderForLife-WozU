import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

const apples = React.createElement(
  'ul',
  {},
  React.createElement('li', {}, '$1.00 per lb')
);
const oranges = React.createElement(
  'ul',
  {},
  React.createElement('li', {}, '$.70 per lb')
);
const mangos = React.createElement(
  'ul',
  {},
  React.createElement('li', {}, '$2.00 per lb')
);

ReactDOM.render(
  React.createElement(
    'ul',
    {},
    React.createElement('li', {}, 'Apples', apples),
    React.createElement('li', { className: "red"}, 'Oranges', oranges),
    React.createElement('li', {}, 'Mangos', mangos)
  ),
  document.getElementById('root')
)
