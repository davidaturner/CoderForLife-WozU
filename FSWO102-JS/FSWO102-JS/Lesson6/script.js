function findGCDCore(a, b) {

    console.log("Finding the GCD of " + a + " and " + b);

    let result = -1;
    if ( assumptionsMet(a, b)) {

        console.log("Calculating GCD...");
    }

    console.log("GCD => " + result);
    return result;
}

findGCDCore(1,8);

/* MinMax */
function intMinMax(a, b, minMax) {

    if (intTester(a, b) && typeof minMax === 'boolean') {

        if (minMax) {

            return (a > b) ? a : b;
        }
        else if (!minMax) {

            return (a > b) ? b : a;
        }
    }

    return -1;
}
/*
console.log("(2, 4, false): " + intMinMax(2, 4, false));
console.log("(2, 4, true): " + intMinMax(2, 4, true));
console.log("(-2, 4, false): " + intMinMax(-2, 4, false));
console.log("(2, 4, 'mallory'): " + intMinMax(2, 4, 'mallory'));
*/
function intTester(a, b) {
    return typeof a === 'number' && Number.isInteger(a) &&
        typeof b === 'number' && Number.isInteger(b) &&
        a > 0 && b > 0 ? true : false;
}

/* intDivisor */
function intDivisor(a, b, modOnly) {

    if (intTester(a,b) && typeof modOnly === 'boolean')
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

    console.log("(" + a + ", " + b + ", " + modOnly + ")" +
        ": Invalid inputs. Positive Integer values only. ModOnly is a boolean.");
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

    console.log("Testing a: " + a + " b: " + b);

    // Assumption Check #1
    if (typeof a !== 'number') {
        console.log("Assumption check: a is not a 'number'");
        return false;
    }

    // Assumption Check #2
    else if (typeof b !== 'number') {
        console.log("Assumption check: b is not a 'number'");
        return false;
    }

    // Assumption Check #3
    else if (Number.isInteger(a) !== true) {
        console.log("Assumption check: a is not a 'integer'");
        return false;
    }

    // Assumption Check #4
    else if (Number.isInteger(b) !== true) {
        console.log("Assumption check: b is not a 'integer'");
        return false;
    }

    // Assumption Check #5
    else if (a <= 0) {
        console.log("Assumption check: a cannot be le 0");
        return false;
    }

    // Assumption Check #6
    else if (b <= 0) {
        console.log("Assumption check: b cannot b le 0");
        return false;
    }

    // Assumption Check #7
    else if (a === b) {
        console.log("Assumption check: a cannot be eq to b");
        return false;
    }

    // Assumption Check #8
    else if (intMinMax(a, b, false) === 1) {
        console.log("Assumption check: GCD is 1");
        return false;
    }

    console.log("Assumptions met!");
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
