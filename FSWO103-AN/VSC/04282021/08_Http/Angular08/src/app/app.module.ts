import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';

import { SharedModule } from './shared/shared.module';

import { SkillsModule } from './modules/skills/skills.module';
import { AppRoutingModule } from './/app-routing.module';
import { MoviesModule } from './modules/movies/movies.module';

import { SkillsService } from './modules/skills/services/skills.service';

@NgModule({
    declarations: [AppComponent],
    imports: [BrowserModule, FormsModule, SkillsModule, SharedModule, AppRoutingModule, MoviesModule],
    providers: [SkillsService],
    bootstrap: [AppComponent]
})
export class AppModule {}