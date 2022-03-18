import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// The kind of component you have been working with is known as a 
// Stateless Component. Components always have a single parameter, which 
// is the props object, and returns a React element. A stateless component 
// is a function and can only display what's in the props object that's passed 
// in — there is no state that is maintained (like a class).

const GroceryList = props => {
  return (
    <ul>
      <li>{props.item1}</li>
      <li>{props.item2}</li>
      <li>{props.item3}</li>
    </ul>
  );
};

ReactDOM.render(
  <GroceryList item1="Apples" item2="Oranges" item3="Mangos" />,
  document.getElementById('root')
);