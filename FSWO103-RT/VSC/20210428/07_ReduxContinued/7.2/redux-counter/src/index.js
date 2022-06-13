import React from 'react';
import { render } from 'react-dom';
import Counter from './Counter';
import { Provider } from 'react-redux';
import { createStore } from 'redux';

// You might have expected that since you created the store, there would be a 
// default value for the state within the store, like an empty object. That is not 
// the case. Redux makes zero assumptions on the shape of your state. Because of 
// this, you must provide a function that returns the state. This function is a reducer.
//
// Simple example
//function reducer() {
//  return {
//    count: 4
//  };
//}

// The action is an object that includes a required type property. You are going to 
// use the dispatch() function provided by the instance of the Redux store. Luckily, 
// when you import the connect function, it also injects the dispatch function as a 
// prop. This dispatch function will hold the action. First, you need to add a 
// switch/case statement within your reducer() function. This will decide what happens 
// to the state. You are going to create a new variable that handles the state called 
// initialState. 

// redux will not work unless initialState
// is defined FIRST.
const initialState = {
  count: 0
};

function reducer(state = initialState, action) {
  switch (action.type) {
    case 'INCREMENT':
      return {
        count: state.count + 1
      };
    case 'DECREMENT':
      return {
        count: state.count - 1
      };
    case 'RESET':
      return {
        count: (state.count = 0)
      };
    default:
      return state;
  }
}

// The next thing you want to do is add the Provider component from react-redux 
// to the App component. This way, every component will be able to use connect to 
// access the Redux store. The Provider component essentially provides a way to add 
// data to the entire component tree's context, so every child component has access to it.
const store = createStore(reducer);

const App = () => (
  <Provider store={store}>
    <Counter />
  </Provider>
);

render(<App />, document.getElementById('root'));