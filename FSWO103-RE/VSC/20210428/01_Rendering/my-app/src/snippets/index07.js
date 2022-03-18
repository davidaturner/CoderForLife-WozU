import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

ReactDOM.render(
  React.createElement(
    'ul',
    {},
    React.createElement('li', {}, 'Apples'),
    React.createElement('li', {}, 'Oranges'),
    React.createElement('li', {}, 'Mangos')
  ),
  document.getElementById('root')
);

