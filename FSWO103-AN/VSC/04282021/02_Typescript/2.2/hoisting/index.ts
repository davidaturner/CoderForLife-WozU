/* When declaring a function, it generally gets hoisted, meaning you 
can use the function before it is declared in the code. When TypeScript 
compiles, the declarations move to the top, so the function is declared 
before being called. In the case of classes, the class needs to be defined 
before it is used.*/
console.log(multiplyValues(5, 6));

function multiplyValues(a : number, b : number) {
    return a * b;
}

/* This doesn't work. Will not compile.
var example = new mathExample();
console.log(example.multiplyValues(5, 6));

class mathExample {
    multiplyValues(a :number, b : number) {
        return a * b;
    }
}*/

/* This works
class mathExample {
    multiplyValues(a : number, b: number) {
        return a * b;
    }
}

var example = new mathExample();
console.log(example.multiplyValues(5, 6)); */