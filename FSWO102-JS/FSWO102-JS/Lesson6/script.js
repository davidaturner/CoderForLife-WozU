/* Script to find GCD */

/* 
 * Assumption: a and b must be positive integers (> 0)
 * 
 */

// Improved. Iterative solution.
function GCDMkII(a, b) {

    let isDone = false;
    let a1 = 0;
    while (!isDone) {

        // console.log("MkII: The GCD of " + a + " and " + b + " is: ");
        if ( assumptionsMet(a, b)) {

            // console.log("Parameters checked: Ok!");

            if (imod(a, b) === 0) {
                // console.log("findGCD: GCD gt 1 found.");
                return imin(a, b);
            }

            if (a === 1 || b === 1) {
                isDone = true;
            }
            else {

                a1 = idiff(a, b);
                b = imin(a, b);
                a = a1;
            }

        }
        else {

            console.log("GCD: (" + a + ", " + b + ") Invalid parameters.");
            return -1;
        }
    }

    return 1;
}

console.log("MkII: The GCD of 'malloy' and 32 is: ");
console.log(GCDMkII('malloy', 32));
console.log("MkII: The GCD of 2 and 2 is : " + GCDMkII(2, 2));
console.log("MkII: The GCD of 2 and 4 is : " + GCDMkII(2, 4));
console.log("MkII: The GCD of 6 and 15 is : " + GCDMkII(6, 15));
console.log("MkII: The GCD of 81 and 98 is : " + GCDMkII(81, 98));
console.log("MkII: The GCD of 81 and 0 is: ");
console.log(GCDMkII(81, 0));
console.log("MkII: The GCD of 81 and 99 is : " + GCDMkII(81, 99));
console.log("MkII: The GCD of 8 and 172 is : " + GCDMkII(8, 172));
console.log("MkII: The GCD of 8.2 and 172 is: ");
console.log(GCDMkII(8.2, 172));
console.log("MkII: The GCD of 36 and 180 is : " + GCDMkII(36, 180));
console.log("MkII: The GCD of 136 and 18020 is : " + GCDMkII(136, 18020));

// Recursive solution.
function GCDMkI(a, b) {

//    console.log("MkI: The GCD of " + a + " and " + b + " is: ");

    if ( assumptionsMet(a, b)) {

 //       console.log("Parameters checked: Ok!");

        if (imod(a, b) === 0) {
 //           console.log("findGCD: GCD gt 1 found.");
            return imin(a, b);
        }

        return GCDMkI(idiff(a, b), imin(a, b));
    }

    console.log("GCD: (" + a + ", " + b + ") Invalid parameters.");
    return -1;
}
/*
console.log("MkI: The GCD of 'malloy' and 32 is: ");
console.log(GCDMkI('malloy', 32));
console.log("MkI: The GCD of 2 and 2 is : " + GCDMkI(2, 2));
console.log("MkI: The GCD of 2 and 4 is : " + GCDMkI(2, 4));
console.log("MkI: The GCD of 6 and 15 is : " + GCDMkI(6, 15));
console.log("MkI: The GCD of 81 and 98 is : " + GCDMkI(81, 98));
console.log("MkI: The GCD of 81 and 0 is: ");
console.log(GCDMkI(81, 0));
console.log("MkI: The GCD of 81 and 99 is : " + GCDMkI(81, 99));
console.log("MkI: The GCD of 8 and 172 is : " + GCDMkI(8, 172));
console.log("MkI: The GCD of 8.2 and 172 is: ");
console.log(GCDMkI(8.2, 172));
console.log("MkI: The GCD of 36 and 180 is : " + GCDMkI(36, 180));
*/
/* Input params tester */
function itester(a, b) {
    return typeof a === 'number' && Number.isInteger(a) &&
        typeof b === 'number' && Number.isInteger(b) &&
        a > 0 && b > 0 ? true : false;
}

/* MinMax */
function imin(a, b) {
    return iminmax(a, b, false);
}
function iminmax(a, b, minMax) {

    if (itester(a, b) && typeof minMax === 'boolean') {

        if (minMax) {

            return (a > b) ? a : b;
        }
        else if (!minMax) {

            return (a > b) ? b : a;
        }
    }

    console.log("iminmax: (" + a + ", " + b + ") Invalid parameters.");
    return -1;
}
/*
console.log("(2, 4, false): " + intMinMax(2, 4, false));
console.log("(2, 4, true): " + intMinMax(2, 4, true));
console.log("(-2, 4, false): " + intMinMax(-2, 4, false));
console.log("(2, 4, 'mallory'): " + intMinMax(2, 4, 'mallory'));
*/

/* Integer Difference */
function idiff(a, b) {

    if (itester(a, b)) {

        return a > b ? a - b : b - a;
    }

    console.log("idiff: (" + a + ", " + b + ") Invalid parameters.");
    return -1;
}
/*
console.log(idiff(15, 6));
console.log(idiff(6, 15));
console.log(idiff(15, -15));
console.log(idiff("molloy", 15));
*/
/* Integer Divide */
function imod(a, b) {
    return idivide(a, b, true);
}
function idivide(a, b, modOnly) {

    if (itester(a,b) && typeof modOnly === 'boolean')
    {
        if (a === b) {
            return modOnly ? 0 : 1;
        }

        if (a > b) {
            return modOnly? a % b : parseInt(a / b);
        }

        if (a < b) {
            return modOnly? b % a : parseInt(b / a);
        }
   }

    console.log("idivide: (" + a + ", " + b + ") Invalid parameters.");
    return -1;
}

/*
console.log("Test A => " + intDivisor(4, 2, false));
console.log("Test B => " + intDivisor(4, 2, true));
console.log("Test C => " + intDivisor(6, 15, false));
console.log("Test D => " + intDivisor(6, 15, true));
console.log("Test A => " + intDivisor(81, 99, true));
console.log("Test B => " + intDivisor(81, -99, true));
console.log("Test C => " + intDivisor("holly", 2, false));
console.log("Test D => " + intDivisor(0, 2, false));
*/

/* Assumption checks */
function assumptionsMet(a, b) {

    // Assumption Check #1
    if (typeof a !== 'number') {
        console.log("Parameters check: Fail! a is not a 'number'");
        return false;
    }

    // Assumption Check #2
    else if (typeof b !== 'number') {
        console.log("Parameters check: Fail! b is not a 'number'");
        return false;
    }

    // Assumption Check #3
    else if (Number.isInteger(a) !== true) {
        console.log("Parameters check: Fail! a is not a 'integer'");
        return false;
    }

    // Assumption Check #4
    else if (Number.isInteger(b) !== true) {
        console.log("Parameters check: Fail! b is not a 'integer'");
        return false;
    }

    // Assumption Check #5
    else if (a <= 0) {
        console.log("Parameters check: Fail! a cannot be le 0");
        return false;
    }

    // Assumption Check #6
    else if (b <= 0) {
        console.log("Parameters check: Fail! b cannot b le 0");
        return false;
    }

    // Assumption Check #7
    /* Remove!
    else if (a === b) {
        console.log("Parameters check: Fail! a cannot be eq to b");
        return false;
    }
    */

    // Assumption Check #8
    /* Remove!
    else if (iminmax(a, b, false) === 1) {
        console.log("Parameters check: Fail! GCD is 1");
        return false;
    }
    */

    return true;
}

/*
console.log("Test A =>" + assumptionsMet(1, 2));
console.log("Test B =>" + assumptionsMet(1.1, 2));
console.log("Test C =>" + assumptionsMet(1, "molloy"));
console.log("Test D =>" + assumptionsMet(12, 12));
console.log("Test E =>" + assumptionsMet(-101, 2));
console.log("Test F =>" + assumptionsMet(16,5));
*/
