interface lifespan {
    currentTime : Date;
    printDate(): void;
}

class AppointmentDateFormatter implements lifespan {
    currentTime : Date;
    constructor(day : number, month : number, year : number) {
        (month >= 0 && month < 12)?--month: month;
        this.currentTime = new Date(year, month, day);
    }

    printDate() : void {
        console.log(this.currentTime.toDateString());
    }
}

const testDate = new AppointmentDateFormatter(12, 4, 2018);
testDate.printDate();