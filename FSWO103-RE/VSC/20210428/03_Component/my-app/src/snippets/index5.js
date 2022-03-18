import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Add props validation.
import PropTypes from 'prop-types';

// Say you want the name to be a string, the age to be a number 
// and the position also to be a string. You would need to create an 
// object that defines the types of each of the fields. To specify the 
// types of your props simply define that you are using .propTypes on the 
// component.

const App = props => {
  return (
    <Employee name="Elizabeth" age={27} position="Sales Manager"/>
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
  name: PropTypes.string,
  age: PropTypes.number,
  position: PropTypes.string
}

ReactDOM.render(<App />, document.getElementById('root'));

ReactDOM.render(<App />, document.getElementById('root'));