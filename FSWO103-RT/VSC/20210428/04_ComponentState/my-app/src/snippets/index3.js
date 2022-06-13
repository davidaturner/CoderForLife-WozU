import React from 'react';
import ReactDOM from 'react-dom';

const App = props => {
  return (
    <div>
      <BankAccount />
    </div>
  );
};

class BankAccount extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      savings: {
        accountBalance: 1125.00
      },
      checking: {
        accountBalance: 530.64
      }
    };
  }

  render() {
    return (
      <div>
        <h3>Savings Account Balance: ${this.state.savings.accountBalance}</h3>
        <h3>Checking Account Balance: ${this.state.checking.accountBalance}</h3>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));