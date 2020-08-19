const arr = ["Bill", "Joe", "Emily", "Andrea"];
const newStudents = ["Andrew", "Tasha", "Carol", "George"];

// Old solution
// function addNewStudent(array, newArray) {
//   for (let i = 0; i < newArray.length; i++) {
//     array.push(newArray[i]);
//   }
// }

function addNewStudent(array, newArray) {
  array.push(...array, ...newStudents);
}

console.log(arr);
console.log(newStudents);
addNewStudent(arr, newStudents);
console.log(arr);
