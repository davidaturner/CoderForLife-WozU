export const repoSearchChanged = (repos) => ({
  type: "REPO_SEARCH_COMPLETED",
  repos,
});

export const searchTextChanged = (text) => ({
  type: "SEARCH_TEXT_CHANGED",
  text,
});

// Not a action, should it be here?
export const searchGithub = (item) => {
  return (
    fetch(`https://api.github.com/search/repositories?q=${item}`)
      .then((response) => response.json())
      // Typescript doesn't work here?? Json is being confused for Types
      // .then((response) =>
      //   response.items.map((repo) => {
      //     return (id: repo._id), (name: repo.name), (url: repo.html_url);
      //   })
      // );
      .then((response) =>
        response.items.map((repo) => ({
          id: repo.id,
          name: repo.name,
          url: repo.html_url,
        }))
      )
  );
};
