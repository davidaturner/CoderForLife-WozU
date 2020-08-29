import React from "react";
import { render } from "react-dom";

const styles = {
  fontFamily: "sans-serif",
  textAlign: "center",
};
let APIUrl = "https://jsonplaceholder.typicode.com/photos";
class App extends React.Component {
  state = {
    albums: [],
    errors: null,
  };

  componentDidMount() {
    fetch(APIUrl)
      .then((retrieved) => retrieved.json())
      .then((albums) => {
        let first50 = albums.filter((i, index) => index < 50);
        console.log(first50);
        this.setState({ albums: first50 });
      })
      .catch((err) => this.setState({ error: err }));
  }

  render() {
    return (
      <div style={styles}>
        {this.state.albums.map((album) => (
          <img key={album.id} src={album.thumbnailUrl} alt={album.title} />
        ))}
      </div>
    );
  }
}
render(<App />, document.getElementById("root"));
