import React from 'react';
import ReactDOM from 'react-dom';

class App extends React.Component {
    constructor() {
        super();
        this.state = { comment: "Hi" };
    }

    changeComment() {
       // Wrong
        this.state.comment = 'Hello';

        // Correct
        this.setState({ comment: 'Hello' });
    }

    render() {
        return (
            <div>
                <h2>{this.state.comment}</h2>
                <button onClick={this.changeComment.bind(this)}>Change To Hello</button>
            </div>
        );
    }
}

ReactDOM.render(<App />, document.getElementById('root'));