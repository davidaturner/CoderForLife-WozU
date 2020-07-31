import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { GreetingComponent } from "./shared/components/greeting/greeting.component";
import { SkillsModule } from "./modules/skills/skills.module";
import { MessageFormModule } from "./modules/message-form/message-form.module";

@NgModule({
  declarations: [AppComponent, GreetingComponent],
  imports: [BrowserModule, FormsModule, MessageFormModule, SkillsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
