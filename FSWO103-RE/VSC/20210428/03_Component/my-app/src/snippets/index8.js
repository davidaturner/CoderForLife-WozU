import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Say you have an array you would like to display, how would you go 
// about it? The easiest and most straight-forward answer is to type it 
// into HTML or JSX and call it a day. While this is possible, it is not the 
// most efficient way to accomplish the task at hand.

// Notice that the <li> element has a key attribute. 

const App = props => {
  return <List items={listItems} />;
};

const items = ['Bread', 'Milk', 'Eggs', 'Tea'];

const listItems = [];

for (let i = 0; i < items.length; i++) {
  listItems.push(<li key={i}>{items[i]}</li>);
}

const List = props => <ul>{props.items}</ul>;

ReactDOM.render(<App />, document.getElementById('root'));