var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __spreadArrays = (this && this.__spreadArrays) || function () {
    for (var s = 0, i = 0, il = arguments.length; i < il; i++) s += arguments[i].length;
    for (var r = Array(s), k = 0, i = 0; i < il; i++)
        for (var a = arguments[i], j = 0, jl = a.length; j < jl; j++, k++)
            r[k] = a[j];
    return r;
};
// Spread operator exercises.
var params = [4, 8, 2, 1, 6];
var maxNoSpread = Math.max(params[0], params[1], params[2], params[3], params[4]);
var getMax = Math.max.apply(Math, params);
//console.log(getMax);
var getMax1 = Math.max.apply(Math, __spreadArrays(params, [9, -2]));
//console.log(getMax1);
var getMax2 = __spreadArrays(params);
//console.log(getMax2);
var getMax3 = __spreadArrays(params, [17]);
var getMax4 = __spreadArrays([17], params);
//console.log(getMax3);
//console.log(getMax4);
var personobj = {
    name: "Jess",
    age: 43
};
var getPersonArr = __assign({}, personobj);
var getPersonArr1 = __assign(__assign({}, personobj), { name: "Tyler" });
var getPersonArr2 = __assign(__assign({}, personobj), { age: 19 });
var getPersonArr3 = __assign(__assign({}, personobj), { name: "Tyler", age: 19 });
//console.log(getPersonArr);
//console.log(getPersonArr1);
//console.log(getPersonArr2);
//console.log(getPersonArr3);
//filter
var isEnough = function (value) {
    return value >= 10;
};
console.log(isEnough(13));
var filtered = [12, 5, 8, 130, 44].filter(isEnough);
console.log(filtered);
