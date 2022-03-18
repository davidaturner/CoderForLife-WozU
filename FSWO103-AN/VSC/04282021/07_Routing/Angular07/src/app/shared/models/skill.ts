import { Level } from '../types/level.enum';

export class Skill {
  id: number;
  name: string;
  level: Level;

  constructor() {
    this.id = 0;
    this.name = "";
    this.level = Level.Beginner;
  }
}