"use strict";
var fred = {};
fred.age = 57;
fred.name = 'Fred Wilkenson';
console.log("Name: " + fred.name + ", " + fred.age);
// type assertion
var personName = 'Fred Wilkenson';
var fredName = personName;
console.log(fredName);
