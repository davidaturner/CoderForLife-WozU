import React from "react";
import ReactDOM from "react-dom";

class BankAccount extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      balance: 2222.22,
      addAmount: 0,
    };
  }
  // Do not re-render until either balance or amount
  // changes.
  shouldComponentUpdate(nextState, props) {
    return (
      this.state.addAmount !== nextState.addAmount ||
      this.state.balance !== nextState.balance
    );
  }
  componentWillMount() {
    console.log("componentWillMount");
  }
  componentDidMount() {
    console.log("componentDidMount");
  }
  componentDidUpdate() {
    console.log("componentDidUpdate");
  }
  increment() {
    this.setState({
      balance: this.state.balance + parseInt(this.state.addAmount),
    });
  }

  render() {
    console.log("Rendered!");
    return (
      <div>
        <h3>Account Balance: ${this.state.balance}</h3>
        <input
          type="number"
          onChange={(event) =>
            this.setState({
              addAmount: event.target.value,
            })
          }
          value={this.state.addAmount}
        ></input>
        <button onClick={this.increment.bind(this)}>Increase Amount</button>
      </div>
    );
  }
}

const App = (props) => {
  return <BankAccount></BankAccount>;
};
ReactDOM.render(<App></App>, document.getElementById("root"));
