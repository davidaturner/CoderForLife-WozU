import React, { Component } from 'react';
import './App.css';
import Values from './Components/Values';

class App extends Component {
    render() {
        return (
        <div className="App">
            <h1 className="App-title">Welcome to React</h1>
            <Values />
        </div>
        );
    }
}

export default App;
