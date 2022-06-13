Promise.resolve("This is a good value")
  .then(message => message + "!")
  .then(betterMessage => Promise.reject("Intentionally failing"))
  .then(finalMessage => console.log(finalMessage)) // doesn't matter we'll never get here because of reject in previous then
  .catch(err => console.log(err)); // this will log the message put in the reject

// fetch('https://jsonplaceholder.typicode.com/todos/1')
//   .then(response => response.json())
//   .then(json => console.log(json))
//
// fetch("https://jsonplaceholder.typicode.com/todos/1")
//   .then(response => response.json())
//   .then(json => console.log(json.items))
// // this only runs if the Promise rejected at some earlier point
//   .catch(err => console.log("Error fetching query")); 
//
// this works. catch err is here just for the sake of completeness.
// fetch("https://api.github.com/search/repositories?q=react")
//   .then(response => response.json())
//   .then(json => console.log(json.items))
// // this only runs if the Promise rejected at some earlier point
//   .catch(err => console.log("Error fetching query")); 