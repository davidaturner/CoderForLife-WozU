import React from 'react';
import { connect } from 'react-redux';

class Counter extends React.Component {
  increment = () => {
    this.props.dispatch({
      type: 'INCREMENT'
    });
  };

  decrement = () => {
    this.props.dispatch({
      type: 'DECREMENT'
    });
  };

  reset = () => {
    this.props.dispatch({
      type: 'RESET'
    });
  };

  render() {
    return (
      <div>
        <h2>Counter</h2>
        <div>
          <button onClick={this.decrement}>-</button>
          <span>{this.props.count}</span>
          <button onClick={this.increment}>+</button>
          <br />
          <button onClick={this.reset}>Reset</button>
        </div>
      </div>
    );
  }
}

function mapStateToProps(state) {
  return {
    count: state.count
  };
}

// As you can see, the export default connect(mapStateToProps)(Counter); 
// line looks a little weird. The reason for this is because connect is what 
// you would call a Higher-Order Function. Higher-Order Functions are functions 
// that return another function when called.

// In total, what connect is doing in your example is hooking into Redux, pulling 
// out the entire state object from the store and passing it to the mapStateToProps 
// function. Then the mapStateToProps function returns just the values the Counter 
// component will need as props. Finally connect sends those values returned by 
// mapStateToProps to the Counter component.
export default connect(mapStateToProps)(Counter);