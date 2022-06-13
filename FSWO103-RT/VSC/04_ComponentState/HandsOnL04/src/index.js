import React from "react";
import ReactDOM from "react-dom";

var App = (props) => {
  return <NumberOfStudents></NumberOfStudents>;
};

class NumberOfStudents extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      enrolledStudents: 0,
      waitlistedStudents: 0,
      addEnrAmount: 1,
      addWaitAmount: 1,
    };
  }

  incrementEnrolled() {
    this.setState({
      enrolledStudents: this.state.enrolledStudents + 1,
    });
  }
  increaseEnrolled() {
    this.setState({
      enrolledStudents:
        this.state.enrolledStudents + parseInt(this.state.addEnrAmount),
    });
  }
  incrementWaitlisted() {
    this.setState({
      waitlistedStudents: this.state.waitlistedStudents + 1,
    });
  }
  increaseWaitlisted() {
    this.setState({
      waitlistedStudents:
        this.state.waitlistedStudents + parseInt(this.state.addWaitAmount),
    });
  }

  render() {
    return (
      <div>
        <h1>Enrolled Students: {this.state.enrolledStudents}</h1>
        <button onClick={this.incrementEnrolled.bind(this)}>
          Add 1 Enrolled Student
        </button>
        <h3>Add Multiple Enrolled Students:</h3>
        <input
          type="number"
          onChange={(event) =>
            this.setState({
              addEnrAmount: event.target.value,
            })
          }
          value={this.state.addEnrAmount}
        ></input>
        <button onClick={this.increaseEnrolled.bind(this)}>
          Increase Students
        </button>
        <br />
        <h1>Waitlisted Students: {this.state.waitlistedStudents}</h1>
        <button onClick={this.incrementWaitlisted.bind(this)}>
          Add 1 Waitlisted Student
        </button>
        <h3>Add Multiple Waitlisted Students:</h3>
        <input
          type="number"
          onChange={(event) =>
            this.setState({
              addWaitAmount: event.target.value,
            })
          }
          value={this.state.addWaitAmount}
        ></input>
        <button onClick={this.increaseWaitlisted.bind(this)}>
          Increase Students
        </button>
      </div>
    );
  }
}

ReactDOM.render(<App></App>, document.getElementById("root"));
