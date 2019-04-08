// alert('JS works!');
class Employee {
    constructor(name, salary, hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    getName() {
        console.log(this.name.toUpperCase());
    }
    getSalary() {
        console.log(this.salary);
    }
    getHireDate() {
        console.log(this.hireDate);
    }
    employeeDescription(additionalInformation) {
        (additionalInformation === undefined) ?
            console.log(this.name + " was hired on " + this.hireDate + " and makes " + this.salary +
                " dollars a year.") :
            console.log(this.name + " was hired on " + this.hireDate + " and makes " + this.salary +
                " dollars a year " + additionalInformation);
    }
}
let emp = new Employee("Bob Since", 20000, "11/01/2010");
emp.getName();
emp.getHireDate();
emp.getSalary();
emp.employeeDescription();


// Subclass:  Manager
class Manager extends Employee {
    constructor(name, salary, hireDate, descriptionOfJob) {
        super(name, salary, hireDate);
        this.descriptionOfJob = descriptionOfJob;
    }
    jobDescription() {
        this.employeeDescription("managing the " + this.descriptionOfJob + " staff.");
    }
}
emp = new Manager("Bob Since", 20000, "11/01/2010", "Sales");
emp.jobDescription();

// Subclass:  Designer
class Designer extends Employee {
    constructor(name, salary, hireDate, experience) {
        super(name, salary, hireDate);
        this.experience = experience;
    }
    yearsExperience() {
        this.employeeDescription("designing for the company " + this.experience + " years now.");
    }
}
emp = new Designer("Bob Since", 20000, "11/01/2010", 2);
emp.yearsExperience();

// Subclass:  Sales Associate
class SalesAssociate extends Employee {
    constructor(name, salary, hireDate, degrees) {
        super(name, salary, hireDate);
        this.degrees = degrees;
    }
    degreeCompleted() {
        this.employeeDescription("holding a " + this.degrees + " degree.");
    }
}
emp = new SalesAssociate("Bob Since", 20000, "11/01/2010", "BSEE");
emp.degreeCompleted();
