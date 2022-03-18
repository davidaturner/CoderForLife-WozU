import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Equivalent of using map to fill listItems
// const listItems = [
//   React.createElement('li', {}, 'Bread'),
//   React.createElement('li', {}, 'Milk'),
//   React.createElement('li', {}, 'Eggs'),
//   React.createElement('li', {}, 'Tea')
// ];

const App = props => {
  const items = ['Bread', 'Milk', 'Eggs', 'Tea'];
  return <List items={items} />;
};

const List = props => {
  const listItems = props.items.map((item, index) => (
    <li key={index}>{item}</li>
  ));
  return <ul>{listItems}</ul>;
};

ReactDOM.render(<App />, document.getElementById('root'));

