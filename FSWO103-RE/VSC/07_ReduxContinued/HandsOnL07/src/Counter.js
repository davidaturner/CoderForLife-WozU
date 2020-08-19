import React from "react";
import { connect } from "react-redux";

class Counter extends React.Component {
  increment = () => {
    this.props.dispatch({
      type: "Increment",
    });
  };

  incrfive = () => {
    this.props.dispatch({
      type: "Incrfive",
    });
  };

  decrement = () => {
    this.props.dispatch({
      type: "Decrement",
    });
  };

  decreten = () => {
    this.props.dispatch({
      type: "Decreten",
    });
  };

  reset = () => {
    this.props.dispatch({
      type: "Reset",
    });
  };

  render() {
    return (
      <div>
        <h2>Counter</h2>
        <div className="value">
          <span>{this.props.count}</span>
        </div>
        <div>
          <button onClick={this.increment}>Increase By 1</button>
        </div>
        <div>
          <button onClick={this.incrfive}>Increase By 5</button>
        </div>
        <div>
          <button onClick={this.decrement}>Decrease By 1</button>
        </div>
        <div>
          <button onClick={this.decreten}>Decrease By 10</button>
        </div>
        <br />
        <div>
          <button onClick={this.reset}>Reset</button>
        </div>
      </div>
    );
  }
}

function mapStateToProps(state) {
  return {
    count: state.count,
  };
}

export default connect(mapStateToProps)(Counter);
