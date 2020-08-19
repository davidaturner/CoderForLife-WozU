// Step 1
var arrs1 = [
    { name: "chevy", count: 2 },
    { name: "ford", count: 5 },
    { name: "acura", count: 3 },
    { name: "honda", count: 16 },
];
var newArr = [];
// Original filter
// for (let i = 0; i < arrs1.length; i++) {
//   if (arrs1[i].name === "ford") {
//     newArr.push(arrs1[i]);
//   }
// }
// New filter: 1
var filter1 = function () {
    for (var i = 0; i < arrs1.length; i++) {
        var _a = arrs1[i], n = _a.name, c = _a.count;
        if (n == "ford") {
            newArr.push(arrs1[i]);
        }
    }
};
// New filter: 2
var arrsobj = /** @class */ (function () {
    function arrsobj(name, count) {
        this.name = name;
        this.count = count;
    }
    return arrsobj;
}());
function getFord(obj) {
    var n = obj.name, c = obj.count;
    return n == "ford";
}
var filter2 = function () { return newArr.push.apply(newArr, arrs1.filter(getFord)); };
//filter1();
//filter2();
//console.log("Filter results:", newArr);
// Step 2
var arrs2 = ["Bill", "Joe", "Emily", "Andrea"];
var newStudents = ["Andrew", "Tasha", "Carol", "George"];
// Old solution
// function addNewStudent(array: string[], newArray: string[]) {
//   for (let i = 0; i < newArray.length; i++) {
//     array.push(newArray[i]);
//   }
// }
var addNewStudent = function (array, newArray) {
    array.push.apply(array, newArray);
};
console.log(arrs2);
console.log(newStudents);
addNewStudent(arrs2, newStudents);
console.log(arrs2);
