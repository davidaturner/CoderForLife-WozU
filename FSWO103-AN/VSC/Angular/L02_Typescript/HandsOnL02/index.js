var Entry = /** @class */ (function () {
    function Entry(firstname, lastname, birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }
    return Entry;
}());
var newPerson = new Entry("Albert", "Einstein", new Date("05/14/1879"));
console.log("First Name: " + newPerson.firstname + ", Last Name: " + newPerson.lastname + ", Birthday: " + newPerson.birthdate);
// Part two
var numbers = [
    "twelve",
    "one-hundred",
    "sixteen",
    "forty-four",
    "seventy-three",
    "three-million",
];
function sortArray(argument) {
    return argument.sort();
}
console.log("Array before sorting: " + numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + "," + numbers[4] + "," + numbers[5]);
var sorted = sortArray(numbers);
console.log("Array after sorting: " + sorted[0] + "," + sorted[1] + "," + sorted[2] + "," + sorted[3] + "," + sorted[4] + "," + sorted[5]);
