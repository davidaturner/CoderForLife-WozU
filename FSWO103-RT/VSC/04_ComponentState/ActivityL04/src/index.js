import React from "react";
import ReactDOM from "react-dom";

const App = (props) => {
  return <BankAccount></BankAccount>;
};

class BankAccount extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      accountBalance: 2222.22,
      addAmount: 0,
    };
  }

  increment() {
    this.setState({
      /*
      accountBalance: this.state.accountBalance + 1,
      */
      accountBalance:
        this.state.accountBalance + parseInt(this.state.addAmount),
    });
  }

  render() {
    return (
      <div>
        <h3>Account Balance: ${this.state.accountBalance}</h3>
        <input
          type="number"
          onChange={(event) =>
            this.setState({
              addAmount: event.target.value,
            })
          }
          value={this.state.addAmount}
        ></input>
        <button onClick={this.increment.bind(this)}>Increment Amount</button>
      </div>
    );
  }
}

ReactDOM.render(<App></App>, document.getElementById("root"));
