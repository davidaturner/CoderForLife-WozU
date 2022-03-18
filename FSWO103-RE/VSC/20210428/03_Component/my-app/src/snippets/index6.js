import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Add props validation.
import PropTypes from 'prop-types';

// As you begin to add prop validations, you may find situations where if 
// a value doesn't exist for a field within the prop object, you will need a 
// default value. This is very helpful in cases where, if you don't have that 
// value, an error will be produced. This can be done very similarly to .propTypes 
// by adding a .defaultProps onto your component.

const App = props => {
  return (
    <Employee name="Elizabeth" age={27}/>
  )
}

const Employee = props => (
  <ul>
    <li>{props.name}</li>
    <li>{props.age}</li>
    <li>{props.position}</li>
  </ul>
);

Employee.propTypes = {
  name: PropTypes.string.isRequired,
  age: PropTypes.number.isRequired,
  position: PropTypes.string
}

Employee.defaultProps = {
  position: "employee"
}

ReactDOM.render(<App />, document.getElementById('root'));