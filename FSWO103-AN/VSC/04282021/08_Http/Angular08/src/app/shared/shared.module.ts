import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { GreetingComponent } from './components/greeting/greeting.component';
import { MessageFormComponent } from './components/message-form/message-form.component';



@NgModule({
  declarations: [
    GreetingComponent,
    MessageFormComponent
  ],
  imports: [
    CommonModule, FormsModule
  ]
})
export class SharedModule { }
