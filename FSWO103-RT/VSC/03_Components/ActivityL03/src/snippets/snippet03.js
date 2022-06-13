import React from "react";
import ReactDOM from "react-dom";
import PropTypes from "prop-types";

const AppComponent = (props) => {
  //  return <EmployeeComponent name="" age="Mister" position="Sales Manager" />;
  return <EmployeeComponent name="" age="Mister" />;
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

EmployeeComponent.propTypes = {
  name: PropTypes.string.isRequired,
  age: PropTypes.number.isRequired,
  position: PropTypes.string,
};

EmployeeComponent.defaultProps = {
  position: "Employee",
};

ReactDOM.render(<AppComponent />, document.getElementById("root"));
