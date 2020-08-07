import React from "react";
import ReactDOM from "react-dom";

var App = (props) => {
  return (
    <div>
      <BankAccount></BankAccount>
    </div>
  );
};

class BankAccount extends React.Component {
  constructor(props) {
    super(props);

    // this.state = {
    //     accountBalance = 25.0
    // }
    this.state = {
      checking: {
        accountBalance: 530.64,
      },
      savings: {
        accountBalance: 1125.0,
      },
    };
  }

  render() {
    return (
      <div>
        <h2>Checking Account Balance: ${this.state.checking.accountBalance}</h2>
        <h3>Savings Account Balance: ${this.state.savings.accountBalance}</h3>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById("root"));
