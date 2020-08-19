// Spread operator exercises.
const params = [4, 8, 2, 1, 6];
const maxNoSpread = Math.max(
  params[0],
  params[1],
  params[2],
  params[3],
  params[4]
);
const getMax = Math.max(...params);
//console.log(getMax);

const getMax1 = Math.max(...params, 9, -2);
//console.log(getMax1);

const getMax2 = [...params];
//console.log(getMax2);

const getMax3 = [...params, 17];
const getMax4 = [17, ...params];
//console.log(getMax3);
//console.log(getMax4);

const personobj = {
  name: "Jess",
  age: 43,
};
const getPersonArr = { ...personobj };
const getPersonArr1 = { ...personobj, name: "Tyler" };
const getPersonArr2 = { ...personobj, age: 19 };
const getPersonArr3 = { ...personobj, name: "Tyler", age: 19 };
//console.log(getPersonArr);
//console.log(getPersonArr1);
//console.log(getPersonArr2);
//console.log(getPersonArr3);

//filter
const isEnough = (value: number) => {
  return value >= 10;
};
console.log(isEnough(13));
const filtered = [12, 5, 8, 130, 44].filter(isEnough);
console.log(filtered);
