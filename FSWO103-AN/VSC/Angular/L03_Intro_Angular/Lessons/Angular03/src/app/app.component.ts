// tslint:disable-next-line: quotemark
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent {
  title = "Mr. Bigglesworth";
  city = "Pittsburgh";
  tagline = "Come! Let us reason together!";
  aboutme =
    "Suspendisse non laoreet nibh. Integer sed orci eget diam euismod pulvinar " +
    "non a purus. Ut eleifend nisl eu rutrum luctus. Donec magna tellus, bibendum " +
    "vel leo vel, maximus maximus orci. Donec commodo lacus pellentesque, tempus " +
    "lacus eget, faucibus dolor.";
}
