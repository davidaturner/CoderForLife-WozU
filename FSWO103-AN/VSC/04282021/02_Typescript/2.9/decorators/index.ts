/*
Decorators provide a way to add functionality to parts of an application or program 
and are used extensively in Angular. Decorators, denoted by the @ sign, are functions 
(including necessary parameters, explained further on) that are evaluated by another 
function at runtime with information about the declaration.

In Angular there are four decorator types: (Class | Property | Method | Parameter)
*/

/* Method decorator */
/*
A method decorator has the three following parameters:

target: The prototype (Object) of the class.
propertyKey: The name (string) of the method being decorated.
descriptor: A descriptor (PropertyDescriptor) of the given property if it exists on 
the object, otherwise undefined.
*/

/* Example 1 */
/*
function methodDecorator(target: Object, propertyKey: string, descriptor: PropertyDescriptor): any {
    let oldValue = descriptor.value;

    descriptor.value = function() {
        console.log(`Calling ${propertyKey} with `, target);
        let value = oldValue.apply(null, [arguments[1], arguments[0]]);

        console.log(`Function is executed`);
        return value + '; Decorators are crazy!';
    };

    return descriptor;
}
*/
/* Example 2 */
function methodDecorator(target: Object, propertyKey: string, descriptor: PropertyDescriptor): any {
    // store the original class method in `oldValue`
    let oldValue = descriptor.value;

    // re-define the class method
    descriptor.value = function() {
        // when the class method is called, log the fact to the console
        console.log(`Calling ${propertyKey} with `, target);

        // call the original class method passing in the caller's two arguments
        // -- this point is where the console logging in the class
        // method will occur
        let value = oldValue.apply(null, [arguments[1], arguments[0]]);

        // log that the function was executed and return the result with some added text
        console.log(`Function is executed`);
        return value + '; Decorators are crazy!';
    };

    return descriptor;
}

class MyClass {
    //add the below decorator expression
    @methodDecorator
    exampleFunction(arg1: string, arg2: string) {       // set experimentalDecorator
        // log the arguments and return their concatenation
        console.log(`Arguments Received: ${arg1} and ${arg2}`);
        return `${arg1} ${arg2}`;
    }
}
const run = new MyClass();
console.log(run.exampleFunction('Hello', 'World'));