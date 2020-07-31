import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { DisplayTasksComponent } from "./components/display-tasks/display-tasks.component";

@NgModule({
  declarations: [DisplayTasksComponent],
  imports: [CommonModule],
  exports: [DisplayTasksComponent],
})
export class TaskmanagerModule {}
