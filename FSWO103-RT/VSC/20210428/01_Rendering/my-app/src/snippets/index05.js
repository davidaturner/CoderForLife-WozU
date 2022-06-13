import React from 'react';
import ReactDOM from 'react-dom';

ReactDOM.render(
  React.createElement(
    'a',
    { href: 'https://www.google.com' },
    'Take me to Google.com!'
  ),
  document.getElementById('root')
);

