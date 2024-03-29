import React from 'react';
import ReactDOM from 'react-dom';
import * as ReactRedux from 'react-redux'
import * as Redux from 'redux';
const { Provider } = ReactRedux;

/*
When the below code is run, you see that clicking the button instantly 
switches the state to 'started'. This is just like the kinds of dispatches 
you've done so far. But the status changes to 'completed' after 2 seconds, 
once the setTimeout in waitTwoSecondsThenDispatch completes.
*/

// The application state is just a string that is either 'not started',
// 'started', or 'completed'
const reducer = (state = 'not started', action) => {
    switch(action.type) {
      case 'STARTED':
        return 'started';
      case 'COMPLETED':
        return 'completed';
    }
    return state;
}

const store = Redux.createStore(reducer);

// This component displays the current status and provides a button to
// start an async process that will dispatch back to Redux
let StatusDisplay = (props) => {
    return (
      <div>
        <p>{props.status}</p>
        <button onClick={waitTwoSecondsThenDispatch}>Start dispatch</button>
      </div>
    );
};

// This is your asynchronous process that dispatches immediately,
// and then again when complete
const waitTwoSecondsThenDispatch = () => {
  store.dispatch({ type: 'STARTED' });
  setTimeout(() => store.dispatch({ type: 'COMPLETED' }), 2000);
}

const mapStateToProps = state => ({ status: state });

StatusDisplay = ReactRedux.connect(mapStateToProps)(StatusDisplay);

ReactDOM.render(
  <Provider store={store}>
    <StatusDisplay />
  </Provider>,
  document.getElementById('root')
);