var app = angular.module('myapp', []);

app.controller('departmentsController', function ($scope) {

    $scope.helloWorld = "Hello from Departments Controller";
    $scope.mydResponseData =
        [{ "Did": 1003, "DName": "PDG", "HOD": "MarkLong", "Gender": "M" },
            { "Did": 1004, "DName": "Testing", "HOD": "MorrisD", "Gender": "M" },
            { "Did": 1005, "DName": "Admin", "HOD": "Lillian", "Gender": "F" },
            { "Did": 1022, "DName": "Production", "HOD": "Ziggy", "Gender": "M" },
            { "Did": 3071, "DName": "PDG1", "HOD": "MarshaLong", "Gender": "F" }];
    $scope.myDepartments = "";
    $scope.getDepartments = function () {
        // Make an ajax call.
        $scope.myDepartments = $scope.mydResponseData;
    };

});

app.controller('employeesController', function ($scope) {

    $scope.helloWorld = "Hello from Departments Controller";
    $scope.myeResponseData =
        [{ "Eid": 1, "EName": "Ravi", "Salary": 8000, "Gender": "M", "Did": 1003 },
        { "Eid": 2, "EName": "Mary", "Salary": 9000, "Gender": "F", "Did": 1003 },
        { "Eid": 3, "EName": "Adam", "Salary": 5000, "Gender": "M", "Did": 1003 },
        { "Eid": 4, "EName": "Danel", "Salary": 6000, "Gender": "F", "Did": 1004 },
            { "Eid": 5, "EName": "Ester", "Salary": 8000, "Gender": "F", "Did": 1005 }];
    $scope.myeResponseData2 =
        [{ "Eid": 1, "EName": "Ravi", "Salary": 8000, "Gender": "M", "Did": 1003 },
        { "Eid": 2, "EName": "Mary", "Salary": 9000, "Gender": "F", "Did": 1003 },
        { "Eid": 3, "EName": "Adam", "Salary": 5000, "Gender": "M", "Did": 1003 }];
    $scope.myEmployees = "";
    $scope.myDid = "";
    $scope.getEmployees = function () {
        // Make an ajax call.
        $scope.myEmployees = $scope.myeResponseData;
    };
    $scope.getEmployeesById = function (id) {
        //Make an ajax call.
        $scope.myDid = id;
        $scope.myEmployees = "";
        if (id === 1003) {
            $scope.myEmployees = $scope.myeResponseData2;
        }
    };

});
app.controller('myController', function ($scope) {

    $scope.helloWorld = "Hello Mr.World from app controller!";
    $scope.myValue = "MyValue";

    $scope.myFun = function () {
        alert("Welcome to My Fun!");
    };
    $scope.myFun2 = function () {
        alert("Welcome to " + $scope.myValue);
    };
    $scope.myFun3 = function (val) {
        alert("Welcome to My Fun: " + val);
        $scope.myValue = val;
    };

});