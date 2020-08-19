// Deconstruction
const objname = {
  firstname: "April",
  lastname: "Ludgate",
};

//const firstname = objname.firstname;
//const lastname = objname.lastname;
//console.log(firstname);
//console.log(lastname);

const objnamev2 = {
  firstname: "John",
  lastname: "Brocker",
};
const { firstname, lastname } = objnamev2;
//console.log(firstname);
//console.log(lastname);

// Best way. Use variables when you deconstruct.
// You can re-use the object properties.
const objnamev3 = {
  firstname: "Thomas",
  lastname: "Cropper",
};
const { firstname: f, lastname: l } = objnamev3;
//console.log(f);
//console.log(l);

// Arrays
const array = ["Bilbo", "Baggins"];
const [x, y] = array;
console.log(x);
console.log(y);
