import React from 'react';
import ReactDOM from 'react-dom';

// pure function
// reproducible output without changing input values
// no side effects
function ReducePure(props) {
  let result = props.distance - props.atSpeed;
  if (result < 0) {
    result = 0;
  }
  return <h2>Calculated New Destination is: {result}</h2>
}

// impure function
// updating input values in mid-function.
// warning: side effects
// NOTE: if props.distance is state.distance
// the program WILL NOT run.
var myprops = {
  distance: 14.4,
  atSpeed : 5.6
}
var mydistance = 18.8;
var myatSpeed = 3.2;

function ReduceImpure(mydistance) {
  mydistance -= myatSpeed;
  return <h2>Calculated New Destination is: {mydistance}</h2>

  // props.distance -= props.atSpeed;
  // if (props.distance < 0) {
  //   props.distance = 0;
  // }
  // return <h2>Calculated New Destination is: {props.distance}</h2>
}

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// If the comment property of the state is set to Hello directly, 
// then the component will not update. But when you use the 
// setState() method and pass a new state object to the method, 
// the component will update with the new value.
class App extends React.Component {
    constructor() {
        super();
        this.state = { 
          comment: "Hi",
          distance: 15.3,
          speed: 4.5 };
    }

    changeComment() {
      // Incorrect, state will NOT update
      // this.state({ comment: 'Hello, World'});
        // Correct, state WILL update
        this.setState({ comment: 'Hello' });
    }

    // inpure function
    //
    degradePosition() {
      var closer = reduce(this.state.distance, this.state.speed);
      this.setState({ distance: closer})
    }

    render() {
        return (
            <div>
                <Welcome name="Cara" />
                <Welcome name="Edite" /> 
                <h2>My State Distance: {this.state.distance}</h2>
                <ReducePure distance = {this.state.distance} atSpeed = {this.state.speed} />
                <h2>AfterPure Distance: {this.state.distance}</h2>
                {/* <ReduceImpure distance = {myprops.distance} 
                              atSpeed = {myprops.atSpeed} /> */}
                <ReduceImpure distance = {mydistance} atSpeed = {myatSpeed} />
                <h2>AfterInpure mydistance: {mydistance}</h2> 
                {/* <h2>{this.state.distance}</h2>
                <button onClick={this.degradePosition.bind(this)}>Degrade position</button> */}

                <h2>{this.state.comment}</h2>
                <button onClick={this.changeComment.bind(this)}>Change To Hello</button>
            </div>
        );
    }
}

ReactDOM.render(<App />, document.getElementById('root'));