var app = angular.module('myapp', []);

app.controller('departmentsController', function ($scope) {

    $scope.helloWorld = "Hello from Departments Controller";
    $scope.myResponseData =
        [{ "Did": 1003, "DName": "PDG", "HOD": "MarkLong", "Gender": "M" },
            { "Did": 1004, "DName": "Testing", "HOD": "MorrisD", "Gender": "M" },
            { "Did": 1005, "DName": "Admin", "HOD": "Lillian", "Gender": "F" },
            { "Did": 1022, "DName": "Production", "HOD": "Ziggy", "Gender": "M" },
            { "Did": 3071, "DName": "PDG1", "HOD": "MarshaLong", "Gender": "F" }];
    $scope.myDepartments = "";
    $scope.getDepartments = function () {
        // Make an ajax call.
        $scope.myDepartments = $scope.myResponseData;
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