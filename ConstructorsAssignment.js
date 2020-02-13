"use strict";
exports.__esModule = true;
var ConstructorsAssignment = /** @class */ (function () {
    //private firstName: String;
    //private lastName :String;
    //private age :Number;
    //private salary: Number;
    //private gender String;
    //private email String;}
    function ConstructorsAssignment(firstName, lastName, age, salary, gender, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.email = email;
    }
    ConstructorsAssignment.prototype.getFullName = function () {
        console.log(this.firstName + "" + this.lastName);
    };
    return ConstructorsAssignment;
}());
exports.ConstructorsAssignment = ConstructorsAssignment;
var emp = new ConstructorsAssignment("John", "Doe", 37, 20000, "Male", "love2code@gmail.com");
emp.getFullName();
