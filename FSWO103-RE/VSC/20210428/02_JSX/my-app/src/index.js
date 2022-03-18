import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// As you can see, the React.createElement() method no longer used. 
// Instead,the HTML code for creating the same element is added directly 
// into the ReactDOM.render() method. This works because React takes the 
// HTML code and transpiles it so it is read as React.createElement().

// Think of JSX as a shorthand for calling React.createElement(). This 
// comes in handy when you explore larger blocks of HTML like lists and 
// tables. Continue on to look at more examples of JSX.

const groceryList = (
  item1,
  item1Price,
  item2,
  item2Price,
  item3,
  item3Price
) => {
  return (
    <ul>
      <li class="red">{item1}</li>
      <ul>
        <li>{item1Price}</li>
      </ul>
      <li>{item2}</li>
      <ul>
        <li>{item2Price}</li>
      </ul>
      <li id="blue">{item3}</li>
      <ul>
        <li>{item3Price}</li>
      </ul>
    </ul>
  );
};

ReactDOM.render(
  groceryList(
    'Apples',
    '$1.00 per lb',
    'Oranges',
    '$.70 per lb',
    'Mangos',
    '$2.00 per lb'
  ),
  document.getElementById('root')
);
