import React from "react";
import { render } from "react-dom";
import { createStore } from "redux";
import { Provider } from "react-redux";
import reducer from "./reducers/counter";
import App from "./components/App";

const store = createStore(
  reducer,
  undefined,
  window.devToolsExtension ? window.devToolsExtension() : (f) => f
);

render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById("root")
);
