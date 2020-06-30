// Method decorator requires three parameters.
// target: the prototype/object of the class.
// propertyKey: the name/string of the method decorated.
// descriptor: a descriptor/propertydescriptor of given property if it
//      exists on the object, otherwise undefined.
function methodDecorator(
  target: Object,
  propertyKey: string,
  descriptor: PropertyDescriptor
): any {
  // store the original class method
  let oldValue = descriptor.value;

  // redefine class method
  descriptor.value = function () {
    // once called, log to console.
    console.log(`Calling ${propertyKey} with `, target);
    // call the original method, passing in the two arguments by caller.
    let newValue = oldValue.apply(null, [arguments[0], arguments[1]]);
    // Return the result with some additional text.
    console.log(`${propertyKey} executed.`);
    return newValue + "; Decorator added!";
  };

  return descriptor;
}

// Now, create calling program.
// Set experimentDecorators and allowJS in tsconfig.json.
// Or simply update npm start.
class myClass {
  @methodDecorator
  log(arg1: string, arg2: string) {
    console.log(`Arguments received: ${arg1} and ${arg2}`);
    return `${arg1} ${arg2}`;
  }
}

const myC = new myClass();
console.log(myC.log("Hello", "World"));
