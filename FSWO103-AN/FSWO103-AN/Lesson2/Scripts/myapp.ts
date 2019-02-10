function exampleDecorator(target: Object, propertyKey: string, descriptor: PropertyDescriptor): any {
    let oldValue = descriptor.value;

    descriptor.value = function () {
        console.log(`Calling ${propertyKey} with `, arguments);
        let value = oldValue.apply(null, [arguments[1], arguments[0]]);

        console.log(`Function is executed`);
        return value + '; Decorators are crazy!';
    };

    return descriptor;
}

class MyFunction {
    //@exampleDecorator
    exampleFunction(arg1, arg2) {
        console.log(`Arguments Received: ${arg1} and ${arg2}`);
        return `${arg1} ${arg2}`;
    }
}

const run = new MyFunction();
console.log(run.exampleFunction('Hello', 'World'));
