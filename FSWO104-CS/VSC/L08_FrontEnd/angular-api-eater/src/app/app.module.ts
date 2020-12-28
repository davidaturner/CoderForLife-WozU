import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
// GetRequestComponent should auto import
import { GetRequestComponent } from './fetch.component';

@NgModule({
  declarations: [AppComponent, GetRequestComponent],
  imports: [BrowserModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
