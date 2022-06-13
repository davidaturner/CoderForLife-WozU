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
      accountBalance: 2222.22
    };
  }

  increment() {
    this.setState({ accountBalance: this.state.accountBalance + 1 });
  }

  render() {
    return (
      <div>
        <h3>Account Balance: ${this.state.accountBalance}</h3>
        <button onClick={this.increment.bind(this)}>Increase Amount</button>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));