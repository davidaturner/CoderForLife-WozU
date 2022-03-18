import { Component, OnInit } from '@angular/core';
import { Skill } from '../models/skill';

import { SkillsService } from '../services/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skills : Skill[] = [];
  // best practice. DI dataservice.
  dataService : SkillsService;

//  skills = ['Java/Spring', 'C#/.NET', "Html/Css", 'Javascript', 'Angular', 'React'];
// move to skills services
/* skills: Skill[] = [
    {
      id: 0,
      name: 'Java/Spring',
      level: Level.Expert
    },
    {
      id: 1,
      name: 'C#/.NET',
      level: Level.Advanced
    },
    {
      id: 2,
      name: "Html/Css",
      level: Level.Expert
    },
        {
      id: 3,
      name: 'Javascript',
      level: Level.Expert
    },
    {
      id: 4,
      name: 'Angular',
      level: Level.Advanced
    },
    {
      id: 5,
      name: 'React',
      level: Level.Expert
    }
  ];
*/
//  constructor() { }
  constructor(dataService: SkillsService) {
  //   this.skills = skillsService.skills;
  // best practice DI dataService
    this.dataService = dataService;
  }

  ngOnInit(): void {
     this.skills = this.dataService.skills;
  }

}
