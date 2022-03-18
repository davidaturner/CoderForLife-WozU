/*
A generic is a component that can work over a variety of types rather than a single 
one, which allows users to consume these components and use their types. Since 
TypeScript is compiled, generics are used.
*/
/* example 1 */
/*
While the any type is technically generic, you will lose the information about the 
type when the value is returned from the function. For example, if you pass in a 
string, the function will have no way of knowing it was a string, only that it could 
be any type.
*/
function identity_ex1(argument: any): any {
    return argument;
}
console.log(identity_ex1("Ex1: Starbuck"));

/* 
With generics, you have a way of capturing the type of the argument and the return 
value. To do this, you can use a type variable, and this allows you to capture the 
type of the value passed into the function, as well as the type of the return value.
*/
/* Example 2 */
function identity_ex2<T>(argument: T): T {
    console.log("Ex2: " + argument);
    return argument;
}
identity_ex2("Kara");

/* Example 3 */
function identify_ex3<T>(argument: T): string {
    let argType: string = '';

    switch (typeof argument) {
        case 'number':
            argType = 'number';
            break;
        case 'string':
            argType = 'string';
            break;
        default:
            argType = 'neither a number nor a string';
    }

    return 'You passed in a ' + argType + ', whose value is ' + argument;
}
console.log("Ex3: " + identify_ex3(42));

/* Example 4 */
/* Cannot use .length unless variable is a type that has length. */
function identityCheck1<T>(argument: T[]): T[] {
    console.log("Ex4: " + argument.length);
    return argument;
}
let groceryList1: string[] = ['bread', 'milk', 'butter', 'cookies'];
let groceryList2: Array<string> = ['bread', 'milk', 'butter', 'cookies'];
identityCheck1(groceryList1);
identityCheck1(groceryList2);

/* Example 5 */
/* Can use interface to establish .length property */
interface lengthProperty {
    length: number;
}

function identityCheck2<T extends lengthProperty>(argument: T): T {
    console.log("EX5: " + argument.length);
    return argument;
}
let groceryList3: string[] = ['soup', 'cream', 'peanuts'];
identityCheck2(groceryList3);