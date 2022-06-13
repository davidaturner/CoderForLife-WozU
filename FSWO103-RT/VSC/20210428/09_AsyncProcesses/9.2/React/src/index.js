
// Promises are objects that represent the eventual completion or failure of 
// an asynchronous operation. They give a way to build up a chain of steps without 
// the nesting you see above, which causes problems with callbacks.
const later = (delay) => new Promise((resolve) => setTimeout(resolve, delay));

later(1000)
  .then(() => {
    alert('After 1 second');
    return later(1000);
  })
  .then(() => {
    alert('After 2 second');
    return later(1000);
  })
  .then(() => {
    alert('After 3 second');
  })

// Callbacks are a useful way to handle asynchronous processes, but if you 
// want to start a new process in response during a callback you quickly start 
// to build the "pyramid of doom". Since you must define what to do next, each 
// "next" step must be nested inside one more layer. This can make reading and 
// debugging callback chains 
// very difficult.
// setTimeout(
//   () => {
//     alert('After 1 second');
//     setTimeout(
//       () => {
//         alert('After 2 seconds');
//         setTimeout(
//           () => {
//             alert('After 3 seconds');
//           },
//           1000
//         )
//       },
//       1000
//     )
//   },
//   1000
// );