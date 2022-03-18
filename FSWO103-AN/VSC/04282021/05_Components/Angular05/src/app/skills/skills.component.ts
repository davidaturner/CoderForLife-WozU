/*
Within this app, your service is using static, mock data (the skills array). 
Because of this, the callback will only be triggered one time. In most 
applications, databases are used that can potentially be continually updated. 
Even though your app will only trigger the callback once, it is now structured 
where if you did have a database, your service could pull in the changing data 
and the callback would repeatedly be called with each change.
*/
import { Component, OnInit } from '@angular/core';
import { Skill } from '../models/skill';

import { SkillsService } from '../services/skills.service';

@Component({
    selector: 'app-skills',
    templateUrl: './skills.component.html',
    styleUrls: ['./skills.component.css']
})

export class SkillsComponent implements OnInit { 
    skills: Skill[] = [];
    dataService: SkillsService;

    constructor(private skillsService: SkillsService) {
        this.dataService = this.skillsService;
    }

    ngOnInit(): void {
        this.dataService.getSkills().subscribe(skills => this.skills = skills);
    }
}