import React from "react";

const Search = ({ repos, onSearchTextChanged, onSearch, searchText }) => {
  const repoLinks = (
    //= repos.map((repo) => <p key={repo.id}>{repo.name}</p>);
    <ul>
      {repos.map((repo) => (
        <li key={repo.id}>{<a href={repo.url}>{repo.name}</a>}</li>
      ))}
    </ul>
  );

  return (
    <div>
      <p>Enter a repo name to find all repos: </p>
      <hr />
      <input
        onChange={(event) => onSearchTextChanged(event.target.value)}
      ></input>
      <button onClick={(searchText) => onSearch(searchText)}>
        Search Github
      </button>
      <hr />
      <br />
      <div>{repoLinks}</div>
    </div>
  );
};

export default Search;
