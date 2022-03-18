import { Injectable } from '@angular/core';
import { Skill } from '../models/skill';
import { Level } from '../types/level';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {
  skills: Skill[] = [
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
  constructor() { }
}
