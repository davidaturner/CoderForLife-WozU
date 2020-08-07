import React from "react";
import ReactDOM from "react-dom";

const App = (props) => {
  const items = [
    { produce: "Bread", price: 2.19 },
    { produce: "Milk", price: 1.99 },
    { produce: "Cookies", price: 3.45 },
    { produce: "Eggs", price: 1.87 },
  ];
  return (
    <div>
      <ItemsComponent items={items} />
      <EmployeeComponent name="Beverly" age={32} position="Sales Manager" />
      <GroceryListComponent item1="Apples" item2="Oranges" item3="Mangos" />
    </div>
  );
};

const ItemsComponent = (props) => {
  const listItems = props.items.map((item, index) => (
    <li key={index}>
      {item.produce}:{item.price}
    </li>
  ));
  return <ul>{listItems}</ul>;
};

const EmployeeComponent = (props) => {
  return (
    <ul>
      <li>{props.name}</li>
      <li>{props.age}</li>
      <li>{props.position}</li>
    </ul>
  );
};

const GroceryListComponent = (props) => {
  return (
    <ul>
      <li>{props.item1}</li>
      <li>{props.item2}</li>
      <li>{props.item3}</li>
    </ul>
  );
};

ReactDOM.render(<App />, document.getElementById("root"));
