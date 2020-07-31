import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";

import { AboutComponent } from "./shared/about/about.component";
import { AlbumsComponent } from "./modules/albums/components/albums/albums.component";
import { HomeComponent } from "./shared/home/home.component";

var routes: Routes = [
  {
    path: "albums",
    component: AlbumsComponent,
  },
  {
    path: "about",
    component: AboutComponent,
  },
  {
    path: "home",
    component: HomeComponent,
  },
  {
    path: "",
    redirectTo: "/home",
    pathMatch: "full",
  },
];
@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
