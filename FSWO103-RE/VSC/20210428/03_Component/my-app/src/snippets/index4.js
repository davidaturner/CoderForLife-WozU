import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// Create a main component that contains the data and returns every 
// component within your file. This way, you can render that one, main 
// component and since it returns every other component, you will end up 
// rendering every component you have created.

// First, create your main component that you will call App, which is a 
// standard name for the main component. App will just be a component that 
// takes in props and returns any components created later on in the file. 

const App = props => {
  return (
    <div>

      {/* Note: cannot style/className here */}

      <Hello name="Nikki" />
      <Hello name="Michael" />
      <Hello name="Andrew" />
    </div>
  );
};

const Hello = props => (
  <div>
    <h1><span className="lager">Hello,</span> 
    <span className="ale">{props.name}</span>!</h1>
  </div>
);

ReactDOM.render(<App />, document.getElementById('root'));