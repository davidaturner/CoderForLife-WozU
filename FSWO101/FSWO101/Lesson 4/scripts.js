let message = "Hello World from the JS";

console.log(message);

class Employee {
    constructor(name, salary, hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    // TODO null input checks.
    getName() {
        console.log(this.name.toUpperCase());
    }
    getSalary() {
        console.log(this.salary);
    }
    getHireDate() {
        console.log(this.hireDate);
    }
}

let jokey = new Employee("Hojo Jokey", 2000, new Date(1961, 11, 24));
jokey.getName();
jokey.getSalary();
jokey.getHireDate();

class Manager extends Employee {
    constructor(name, salary, hireDate, newEmpCode, degree, yrsExp) {
        super(name, salary, hireDate);
        this.employeeCode = newEmpCode;
        this.degreeCompleted = degree;
        this.yearsExperience = yrsExp;
    }
    // TODO null input checks.
    getEmployeeCode() {
        console.log(this.employeeCode);
    }
    getJobDescription() {
        let ec = this.employeeCode;
        if (ec === "") {
            console.log("Manager Code Missing!");
        }
        else if (ec === "M01") {
            console.log("Supervisor");
        }
        else if (ec === "M02") {
            console.log("Manager");
        }
        else {
            console.log("Manager Code Unknown!");
        }
    }
    getDegreeCompleted() {
        console.log(this.degreeCompleted);
    }
    getYearsExperience() {
        console.log(this.yearsExperience);
    }

}

let moku = new Manager("La Moku", 2000, new Date(1961, 3, 24), "M01", "MBA", 2);
moku.getName();
moku.getSalary();
moku.getHireDate();

moku.getEmployeeCode();
moku.getJobDescription();
moku.getDegreeCompleted();
moku.getYearsExperience();


class Designer extends Employee {
    constructor(name, salary, hireDate, newEmpCode, degree, yrsExp) {
        super(name, salary, hireDate);
        this.employeeCode = newEmpCode;
        this.degreeCompleted = degree;
        this.yearsExperience = yrsExp;
    }
    // TODO null input checks.
    getEmployeeCode() {
        console.log(this.employeeCode);
    }
    getJobDescription() {
        let ec = this.employeeCode;
        if (ec === "") {
            console.log("Designer Code Missing!");
        }
        else if (ec === "D01") {
            console.log("Associate Designer");
        }
        else if (ec === "D02") {
            console.log("Designer Level 1");
        }
        else if (ec === "D03") {
            console.log("Designer Level 2");
        }
        else if (ec === "D04") {
            console.log("Senior Designer");
        }
        else {
            console.log("Designer Code Unknown!");
        }
    }
    getDegreeCompleted() {
        console.log(this.degreeCompleted);
    }
    getYearsExperience() {
        console.log(this.yearsExperience);
    }
}

let lonnie = new Designer("Lonnie Starling", 1500, new Date(1953, 7, 16), "D04", "BS", 7);
lonnie.getName();
lonnie.getSalary();
lonnie.getHireDate();

lonnie.getEmployeeCode();
lonnie.getJobDescription();
lonnie.getDegreeCompleted();
lonnie.getYearsExperience();

class SalesAssociate extends Employee {
    constructor(name, salary, hireDate, yrsExp) {
        super(name, salary, hireDate);
        this.employeeCode = "S99";
        this.jobDescription = "Sales Associate";
        this.degreeCompleted = "Not Applicable";
        this.yearsExperience = yrsExp;
    }
    getEmployeeCode() {
        console.log(this.employeeCode);
    }
    getJobDescription() {
        console.log(this.jobDescription);
    }
    getDegreeCompleted() {
        console.log(this.degreeCompleted);
    }
    getYearsExperience() {
        console.log(this.yearsExperience);
    }

}

let molly = new SalesAssociate("Molly Ringwald", 2000, new Date(1981, 2, 2), 5);
molly.getName();
molly.getSalary();
molly.getHireDate();

molly.getEmployeeCode();
molly.getJobDescription();
molly.getDegreeCompleted();
molly.getYearsExperience();