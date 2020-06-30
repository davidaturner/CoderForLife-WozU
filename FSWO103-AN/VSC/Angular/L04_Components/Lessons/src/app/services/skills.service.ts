import { Injectable } from "@angular/core";
import { Skill } from "../models/skill";
import { Level } from "../types/level.enum";

@Injectable({
  providedIn: "root",
})
export class SkillsService {
  skills: Skill[] = [
    { id: 0, name: "Electrical Engineering", level: Level.ADVANCED },
    { id: 1, name: "Java Full Stack", level: Level.EXPERT },
    { id: 2, name: "Healthcare", level: Level.INTERMEDIATE },
  ];
  constructor() {}
}
