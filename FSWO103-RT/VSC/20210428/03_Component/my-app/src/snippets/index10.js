import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// You can extend this even further by mapping over an array of objects. 
// Now, instead of only having the name of each of the items within the 
// array, you have an object for each item that includes the name and 
// the price. 

const App = props => {
  const items = [
    { name: 'Bread', price: 2.35 },
    { name: 'Milk', price: 2.0 },
    { name: 'Eggs', price: 3.15 },
    { name: 'Tea', price: 4.0 }
  ];

  return <List items={items} />;
};

const List = props => {
  const listItems = props.items.map((item, index) => (
    <li key={index}>
      {item.name}: {item.price}
    </li>
  ));

  return <ul>{listItems}</ul>;
};

ReactDOM.render(<App />, document.getElementById('root'));

