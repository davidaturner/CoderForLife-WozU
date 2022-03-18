import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GreetingComponent } from './greeting/greeting.component';
import { MessageFormComponent } from './message-form/message-form.component';



@NgModule({
  declarations: [
    GreetingComponent,
    MessageFormComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ComponentsModule { }
