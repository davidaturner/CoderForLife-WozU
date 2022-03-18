"use strict";
var AppointmentDateFormatter = /** @class */ (function () {
    function AppointmentDateFormatter(day, month, year) {
        this.currentTime = new Date(year, month, day);
    }
    AppointmentDateFormatter.prototype.printDate = function () {
        console.log(this.currentTime.toDateString());
    };
    return AppointmentDateFormatter;
}());
var dateOfAppointment = new AppointmentDateFormatter(12, 4, 2018);
dateOfAppointment.printDate();
