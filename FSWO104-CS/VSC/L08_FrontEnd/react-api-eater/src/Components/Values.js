import React from 'react';

class Values extends React.Component {

    state = {
        values: []
    };

    callValues = () => {
        fetch('http://localhost:5000/api/values')
            .then(response => response.json())
            .then(data => {
                console.log('callValues: ', data);
                this.setState(() => {
                    return {
                        values: data
                    };
                });
                console.log('after setState: ', this.state.values);
            });
    };

    componentDidMount() {
        this.callValues();
        console.log('componentDidMount: ', this.state.values);
    }

    render() {
        return <div>{this.state.values}</div>
    }
}

export default Values;