import React from 'react';
import { render } from 'react-dom';
import { createStore } from 'redux';
import { Provider } from 'react-redux';
import App from './components/App';
import reducer from './reducers/search';

/*
In React, the state is handled by the component. This means if you need 
to pass data between components, you would have to wrap them in an outer 
component that would then handle the passing of the data by passing it to 
its children. While this is feasible, as an application grows, it becomes 
harder to manage as you nest components within each other endlessly. This is 
where the idea of a Single Application State in React becomes of importance. 
The best way to handle the state as an application grows is to use Redux.
*/
const store = createStore(
  reducer,
  undefined,
  window.devToolsExtension ? window.devToolsExtension() : f => f
);

render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);