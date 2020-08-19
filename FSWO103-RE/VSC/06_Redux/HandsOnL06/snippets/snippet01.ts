// Step 1
const arrs1 = [
  { name: "chevy", count: 2 },
  { name: "ford", count: 5 },
  { name: "acura", count: 3 },
  { name: "honda", count: 16 },
];

const newArr: object[] = [];

// Original filter
// for (let i = 0; i < arrs1.length; i++) {
//   if (arrs1[i].name === "ford") {
//     newArr.push(arrs1[i]);
//   }
// }

// New filter: 1
const filter1 = () => {
  for (let i = 0; i < arrs1.length; i++) {
    let { name: n, count: c } = arrs1[i];
    if (n == "ford") {
      newArr.push(arrs1[i]);
    }
  }
};

// New filter: 2
class arrsobj {
  name: string;
  count: number;
  constructor(name: string, count: number) {
    this.name = name;
    this.count = count;
  }
}

function getFord(obj: arrsobj) {
  let { name: n, count: c } = obj;
  return n == "ford";
}

const filter2 = () => newArr.push(...arrs1.filter(getFord));

//filter1();
//filter2();
//console.log("Filter results:", newArr);

// Step 2
const arrs2 = ["Bill", "Joe", "Emily", "Andrea"];
const newStudents = ["Andrew", "Tasha", "Carol", "George"];

// Old solution
// function addNewStudent(array: string[], newArray: string[]) {
//   for (let i = 0; i < newArray.length; i++) {
//     array.push(newArray[i]);
//   }
// }

const addNewStudent = (array: string[], newArray: string[]) => {
  array.push(...newArray);
};
console.log(arrs2);
console.log(newStudents);
addNewStudent(arrs2, newStudents);
console.log(arrs2);
