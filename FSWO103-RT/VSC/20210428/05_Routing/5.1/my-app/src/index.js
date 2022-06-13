import React from 'react';
import ReactDOM from 'react-dom';
import About from './About';
import Topics from './Topics';
import Home from './Home';

const Index = ({ pathname }) => {
  switch (pathname) {
    case '/about':
      return <About />;
    case '/topics':
      return <Topics />;
    default:
      return <Home />;
  }
};

let pathname = window.location.pathname;

ReactDOM.render(<Index pathname={pathname} />, document.getElementById('root'));

window.addEventListener('popstate', () => {
  pathname = window.location.pathname;
});

// old exercise.. using App
// import React from 'react';
// import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';

// ReactDOM.render(
//   <App />,
//   document.getElementById('root')
// );

