import React from "react";
import ReactDOM from "react-dom";

const API = "https://api.github.com/users";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: "davidaturner",
      name: "",
      avatar: "",
      location: "",
      repos: "",
      followers: "",
      following: "",
      homeURL: "",
      notFound: "",
    };
  }
  fetchProfile(username) {
    let url = `${API}/${username}`;
    fetch(url)
      .then((res) => res.json())
      .then((data) => {
        this.setState({
          username: data.login,
          name: data.name,
          avatar: data.avatar_url,
          location: data.location,
          repos: data.public_repos,
          followers: data.followers,
          following: data.following,
          homeURL: data.html_url,
          notFound: data.message,
        });
      })
      .catch((error) => console.log("Oops! There is a problem."));
  }
  componentDidMount() {
    this.fetchProfile(this.state.username);
  }
  render() {
    return (
      <div>
        <section id="card">
          <Profile data={this.state}></Profile>
        </section>
      </div>
    );
  }
}

class Profile extends React.Component {
  render() {
    let data = this.props.data;
    let followers = `${data.homeUrl}/followers`;
    let reposities = `${data.homeUrl}?tabs=repositories`;
    let following = `${data.homeUrl}/following;`;
    return (
      <section className="github--profile">
        <div className="github--profile__info">
          <a
            href={data.homeUrl}
            target="_blank"
            title={data.name || data.username}
          >
            <img src={data.avatar} alt={data.username} />
          </a>
          <h2>
            <a href={data.homeUrl} title={data.username} target="_blank">
              {data.name || data.username}
            </a>
          </h2>
        </div>
        <div className="github--profile__state">
          <ul>
            <li>
              <a href={followers} target="_blank" title="NumberOfFollowers">
                <i>{data.followers} </i>
                <span>Followers</span>
              </a>
            </li>
            <li>
              <a href={reposities} target="_blank" title="NumberOfReposities">
                <i>{data.repos} </i>
                <span>Repositories</span>
              </a>
            </li>
            <li>
              <a href={following} target="_blank" title="NumberOfFollowings">
                <i>{data.following} </i>
                <span>Following</span>
              </a>
            </li>
          </ul>
        </div>
      </section>
    );
  }
}

ReactDOM.render(<App></App>, document.getElementById("root"));
