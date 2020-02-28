import React from "react";
import ReactDOM from "react-dom";
import PropTypes from "prop-types";

const App = props => {
  const user = {
    name: "George Bailey",
    address: "1122 Drafty House",
    city: "Bedford Falls",
    state: "New York",
    zip: 13148
  };
  return <User person={user} items="Boots, Tie, Socks" amount={100} />;
};

const User = props => (
  <ul>
    <li>Name: {props.person.name}</li>
    <ul>
      <li>Address: {props.person.address}</li>
      <li>City: {props.person.city}</li>
      <li>State: {props.person.state}</li>
      <li>Zip: {props.person.zip}</li>
    </ul>
    <li>Items: {props.items}</li>
    <li>Paid: {String(props.paid)}</li>
    <li>Amount: {props.amount}</li>
    <li>Shipped: {String(props.shipped)}</li>
  </ul>
);

User.propTypes = {
  person: PropTypes.shape({
    name: PropTypes.string.isRequired,
    address: PropTypes.string.isRequired,
    city: PropTypes.string.isRequired,
    state: PropTypes.string.isRequired,
    zip: PropTypes.number.isRequired
  }),
  items: PropTypes.string.isRequired,
  paid: PropTypes.bool,
  amount: PropTypes.number.isRequired,
  shipped: PropTypes.bool
};

User.defaultProps = {
  paid: false,
  shipped: false
};

ReactDOM.render(<App />, document.getElementById("root"));
// const root = document.getElementById("root");

// ReactDOM.render(
//   <div>
//     <h1 className="redb marker">Hello, World!</h1>
//   </div>,
//   root
// );
