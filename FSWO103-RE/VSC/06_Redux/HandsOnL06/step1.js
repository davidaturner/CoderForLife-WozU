const arr = [
  { name: "chevy", count: 2 },
  { name: "ford", count: 5 },
  { name: "acura", count: 3 },
  { name: "honda", count: 16 },
];

const newArr = [];

// Old solution
// for (let i = 0; i < arr.length; i++) {
//   if (arr[i].name === "ford") {
//     newArr.push(arr[i]);
//   }
// }
const getford = (arrobj) => {
  return arrobj.name == "ford";
};
newArr.push(...arr.filter(getford));

console.log("Filter results:", newArr);
