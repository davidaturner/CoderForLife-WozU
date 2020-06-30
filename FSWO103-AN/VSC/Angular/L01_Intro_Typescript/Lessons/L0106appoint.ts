interface Lifespan {
  currentTime: Date;
  printDate(): void;
}

class AppointmentDateFormatter implements Lifespan {
  currentTime: Date;

  // notice this constructor does not have return type annotation
  constructor(day: number, month: number, year: number) {
    this.currentTime = new Date(year, month, day);
  }

  printDate(): void {
    console.log(this.currentTime.toDateString());
  }
}

const dateOfAppointment = new AppointmentDateFormatter(12, 4, 2018);
dateOfAppointment.printDate();
