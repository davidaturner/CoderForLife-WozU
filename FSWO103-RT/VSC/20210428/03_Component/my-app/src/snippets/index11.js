import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Converting to Components.

// Notice how all the components are located within one <div> element 
// in the App's return() statement? This is needed because only one root 
// HTML can be returned. 

const App = props => {
  const items = [
    { name: 'Bread', price: 2.35 },
    { name: 'Milk', price: 2.0 },
    { name: 'Eggs', price: 3.15 },
    { name: 'Tea', price: 4.0 }
  ];

  return (
    // There can be only one root.
    <div>
      <List items={items} />
      <Employee name="Elizabeth" age={27} position="Sales Manager" />
      <GroceryList item1="Apples" item2="Oranges" item3="Mangos" />
    </div>
  );
};

const List = props => {
  const listItems = props.items.map((item, index) => (
    <li key={index}>
      {item.name}: {item.price}
    </li>
  ));

  return <ul>{listItems}</ul>;
};

const Employee = props => (
  <ul>
    <li>{props.name}</li>
    <li>{props.age}</li>
    <li>{props.position}</li>
  </ul>
);

const GroceryList = props => (
  <ul>
    <li>{props.item1}</li>
    <li>{props.item2}</li>
    <li>{props.item3}</li>
  </ul>
);

ReactDOM.render(<App />, document.getElementById('root'));

