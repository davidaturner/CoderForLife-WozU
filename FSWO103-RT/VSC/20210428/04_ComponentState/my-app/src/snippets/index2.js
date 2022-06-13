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
      accountBalance: 35.0
    };
  }

  render() {
    return (
      <div>
        <h3>Account Balance: ${this.state.accountBalance}</h3>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));