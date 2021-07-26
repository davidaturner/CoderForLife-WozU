"use strict";
var AppointmentDateFormatter = /** @class */ (function () {
    function AppointmentDateFormatter(day, month, year) {
        (month >= 0 && month < 12) ? --month : month;
        this.currentTime = new Date(year, month, day);
    }
    AppointmentDateFormatter.prototype.printDate = function () {
        console.log(this.currentTime.toDateString());
    };
    return AppointmentDateFormatter;
}());
var testDate = new AppointmentDateFormatter(12, 4, 2018);
testDate.printDate();
