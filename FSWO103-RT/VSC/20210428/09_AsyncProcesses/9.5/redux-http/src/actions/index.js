// action creator, not a function
// repo is a response to user input.
export const repoSearchCompleted = (repos) => ({
  type: 'REPO_SEARCH_COMPLETED',
  repos
});

// action creator, not a function
// text is a response to a change in user input.
export const searchTextChanged = (text) => ({
  type: 'SEARCH_TEXT_CHANGED',
  text
});

// This is not an action, but a function used to generate the repo data 
// that is used by an action.
export  const searchGithub = (item) => {
  console.log('fetching...');
  return (
    fetch(`https://api.github.com/search/repositories?q=${item}`)
    // load response into response json.
    .then(response => response.json())
    // load response into response items.map
    // in the following format. parse repo into an object
    .then(response => response.items.map(repo => (
              {
              id: repo.id,
              name: repo.name,
              url: repo.html_url
              }
            )
          )
        )
  )
};