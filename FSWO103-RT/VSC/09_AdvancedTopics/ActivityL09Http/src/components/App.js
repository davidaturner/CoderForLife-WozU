import React from "react";
import Search from "./Search";
import { connect } from "react-redux";
import {
  searchTextChanged,
  repoSearchChanged,
  searchGithub,
} from "../actions/index";

// Example: Search for 'zeit-ui'
class App extends React.Component {
  render() {
    return (
      <div>
        <h3>Search Repos:</h3>
        <Search
          repos={this.props.repos}
          onSearchTextChanged={this.props.onSearchTextChanged}
          onSearch={this.props.onSearch}
          searchText={this.props.searchText}
        />
      </div>
    );
  }
}

function mapDispatchToProps(dispatch, state) {
  return {
    onSearchTextChanged: (text) => dispatch(searchTextChanged(text)),
    onSearch: (text) =>
      searchGithub(text).then((repos) => dispatch(repoSearchChanged(repos))),
  };
}

function mapStateToProps(state) {
  return {
    repos: state.repos,
    searchText: state.searchInputted,
  };
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
