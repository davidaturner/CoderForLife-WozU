const initialState = {
    repos: [],
    searchInputted: ''
};

// action refers to the creators in another js file.
// clearly, one has to know thee action members associated
// with the type. JS allows for such sloppiness, uh,
// flexibility I mean.
// still, i suppose one can tighten these actions up.
const reducer = (state = initialState, action) => {
    switch(action.type) {
        case 'SEARCH_TEXT_CHANGED':
            return {
                // es6 spread operator
                ...state,
                searchInputted: action.text
            }
        case 'REPO_SEARCH_COMPLETED':
            return {
                // es6 spread operator
                ...state,
                repos: action.repos
            }
        default:
            return state;
    }
};

export default reducer;