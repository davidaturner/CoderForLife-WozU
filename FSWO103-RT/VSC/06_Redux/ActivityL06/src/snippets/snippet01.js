import React from "react";
import ReactDOM from "react-dom";

class App extends React.Component {
  constructor() {
    super();
    this.state = { comment: "Hi!" };
  }

  changeComment() {
    // Perserve state. Do NOT modify directly!
    // Component done this way will not update automatically!

    // this.state.comment = "Hello!";

    this.setState({ comment: "Hello!" });

    // When setState() is used, it returns a new instance of the
    // state's object rather than changing the previous object,
    // therefore allowing the state to remain unchanged.
  }

  render() {
    return (
      <div>
        <h2>{this.state.comment}</h2>
        <button onClick={this.changeComment.bind(this)}>Flip it!</button>
      </div>
    );
  }
}

ReactDOM.render(<App></App>, document.getElementById("root"));
