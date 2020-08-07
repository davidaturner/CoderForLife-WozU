import React from "react";
import ReactDOM from "react-dom";

const App = (props) => {
  return <Text></Text>;
};

class Text extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      text: "Hello, World!",
    };
  }
  update(event) {
    this.setState({
      text: "Hello, " + event.target.value,
    });
  }
  render() {
    return (
      <div>
        <input type="text" onChange={this.update.bind(this)}></input>
        <h1>{this.state.text}</h1>
      </div>
    );
  }
}

ReactDOM.render(<App></App>, document.getElementById("root"));
