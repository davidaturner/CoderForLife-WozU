import React from 'react';
import ReactDOM from 'react-dom';
import { pureFinalPropsSelectorFactory } from 'react-redux/lib/connect/selectorFactory';

// pure function
// reproducible output without changing input values
// no side effects
function fullnamepure(props) {
  return props.firstname + " " + props.lastname;
}


// impure function
// updating input values in mid-function.
// warning: side effects
// do not use in React.
function fullnameinpure(props) {
  props.name = props.firstname + " " + props.lastname;
  return props.firstname + props.lastname;
}

// NOTE: if props.distance is state.distance
// the program WILL NOT run.
var myprops = {
  firstname: "Joe",
  lastname: "Santos",
  name: "NoNameCalculated"
}
let myfirstname = "Frank"
let mylastname = "Sinatra";
let myname = "";

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

function AlsoWelcome(props) {
  let name = fullnamepure(props);
  return <h1>Hello, {name}</h1>
}

function NotWelcomed(props) {
  fullnameinpure(props);
  return <h1>Name: {props.name}</h1>
}

// If the comment property of the state is set to Hello directly, 
// then the component will not update. But when you use the 
// setState() method and pass a new state object to the method, 
// the component will update with the new value.
class App extends React.Component {
    constructor() {
        super();
        this.state = { 
          comment: "Hi"
        }
      }

    changeComment() {
      // Incorrect, state might update but it is discouraged.
      // this.state.comment = "Hello, World";
      // Incorrect, state will NOT update
      // this.state({ comment: 'Hello, World'});
        // Correct, state WILL update. to update use setState
        this.setState({ comment: 'Hello' });
    }

    render() {
        return (
            <div>
              <Welcome name="Joe Santos"></Welcome>
              <AlsoWelcome firstname={myfirstname} lastname={mylastname}></AlsoWelcome>
              <Welcome name={myprops.name} />
              {/* <NotWelcomed firstname={myprops.firstname}
                            lastname={myprops.lastname}
                            name={myprops.name}
                            /> */}
                <h2>{this.state.comment}</h2>
                <button onClick={this.changeComment.bind(this)}>Change To Hello</button>
            </div>
        );
    }
}

ReactDOM.render(<App />, document.getElementById('root'));