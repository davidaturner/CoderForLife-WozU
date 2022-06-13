import React from 'react';
import ReactDOM from 'react-dom';

const App = props => {
  return (
    <div>
      <Text />
    </div>
  );
};

class Text extends React.Component {
  constructor() {
    super();
    this.state = {
      text: 'Hello World!!'
    };
  }

  update(event) {
    this.setState({ text: event.target.value });
  }

  render() {
    return (
      <div>
        <input type="text" onChange={this.update.bind(this)} />
        <h1>{this.state.text}</h1>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));