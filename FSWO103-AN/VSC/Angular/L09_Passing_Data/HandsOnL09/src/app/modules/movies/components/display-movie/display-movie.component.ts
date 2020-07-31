import { Component, OnInit, Input, Output, EventEmitter } from "@angular/core";

import { Movie } from "../../../../shared/models/movie";

@Component({
  selector: "app-display-movie",
  templateUrl: "./display-movie.component.html",
  styleUrls: ["./display-movie.component.css"],
})
export class DisplayMovieComponent implements OnInit {
  @Input() movie: Movie;
  @Output() movieDeleted: EventEmitter<number> = new EventEmitter();
  @Output() viewPoster: EventEmitter<string> = new EventEmitter();

  constructor() {}

  ngOnInit() {}

  onClickDeleteMovie() {
    this.movieDeleted.emit(this.movie.id);
  }
  onClickViewPoster() {
    this.viewPoster.emit(this.movie.image_url);
  }
}
