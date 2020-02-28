"use strict";
var Entry = /** @class */ (function () {
    function Entry(firstName, lastName, birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }
    return Entry;
}());
var newPerson = new Entry("Albert", "Einstein", new Date("5/14/1879"));
console.log("First: " + newPerson.firstName + ", Last: " + newPerson.lastName + ", Birth: " + newPerson.birthdate);
// Step 2
var numbers = Array("twelve", "one-hundred", "sixteen", "forty-four", "seventy-three", "three-million");
function sortArray(argument) {
    return argument.sort();
}
function logArray(prompt, argument) {
    var i = 0;
    var stringbuffer = prompt + ": ";
    while (i < argument.length) {
        stringbuffer += argument[i];
        if (i < argument.length - 1) {
            stringbuffer += ", ";
        }
        i++;
    }
    console.log(stringbuffer);
}
logArray("Array before sorting", numbers);
var sorted = sortArray(numbers);
logArray("Array after sorting", sorted);
console.log();
