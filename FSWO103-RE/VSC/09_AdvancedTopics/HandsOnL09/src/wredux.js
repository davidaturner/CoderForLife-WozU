import React from "react";
import ReactDOM from "react-dom";
import * as ReactRedux from "react-redux";
import * as Redux from "redux";
const { Provider } = ReactRedux;

// const NOT_STARTED = "not started";
// const STARTED = "stated";
// const COMPLETED = "completed";

const ACTION_STARTED = "STARTED";
const ACTION_COMPLETED = "COMPLETED";

const ALBUMS_REQUESTED = 50;

// All changes of states has to be done in the reducer.
const reducer = (state = [], action) => {
  switch (action.type) {
    case ACTION_STARTED:
      return albumsRequested(ALBUMS_REQUESTED);
    case ACTION_COMPLETED:
      return albumsReceived(); // Change state here.
  }
  return state;
};

const albums = [];

const componentDidMount = () => {
  console.log("componentDidMount");
};

const albumsRequested = (anumber) => {
  console.log("Started!");
  fetch("https://jsonplaceholder.typicode.com/photos")
    .then((response) => response.json())
    .then((response) => {
      for (var i = 0; i < anumber; i++) {
        albums.push(response[i]);
      }
    });
};

function albumsReceived() {
  componentDidMount();
  console.log("Fetch completed!");
  console.log("Albums found: " + albums.length);
  return albums;
}

const store = Redux.createStore(reducer);

// This component displays the current status and provides a button to
// start an async process that will dispatch back to Redux
let AlbumRetriever = (props) => {
  return (
    <div>
      {props.retrieved != null && props.retrieved.length > 0 ? (
        <p>
          {props.retrieved.map((retrieved) => (
            <span key={retrieved.id}>
              <img src={retrieved.thumbnailUrl} />
            </span>
          ))}
        </p>
      ) : (
        <p>Not Ready!</p>
      )}
      <button onClick={fetchWaitTwoSecondsThenDispatch}>Retrieve Albums</button>
    </div>
  );
};

const fetchWaitTwoSecondsThenDispatch = () => {
  store.dispatch({ type: ACTION_STARTED });
  setTimeout(() => store.dispatch({ type: ACTION_COMPLETED }), 2000);
};

const mapStateToProps = (state) => ({ retrieved: state });

AlbumRetriever = ReactRedux.connect(mapStateToProps)(AlbumRetriever);

ReactDOM.render(
  <Provider store={store}>
    <AlbumRetriever></AlbumRetriever>
  </Provider>,
  document.getElementById("root")
);
