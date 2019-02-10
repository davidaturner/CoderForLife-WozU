function exampleDecorator(target, propertyKey, descriptor) {
    var oldValue = descriptor.value;
    descriptor.value = function () {
        console.log("Calling " + propertyKey + " with ", arguments);
        var value = oldValue.apply(null, [arguments[1], arguments[0]]);
        console.log("Function is executed");
        return value + '; Decorators are crazy!';
    };
    return descriptor;
}
var MyFunction = /** @class */ (function () {
    function MyFunction() {
    }
    //@exampleDecorator
    MyFunction.prototype.exampleFunction = function (arg1, arg2) {
        console.log("Arguments Received: " + arg1 + " and " + arg2);
        return arg1 + " " + arg2;
    };
    return MyFunction;
}());
var run = new MyFunction();
console.log(run.exampleFunction('Hello', 'World'));
//# sourceMappingURL=myapp.js.map