import { TestBed, inject } from '@angular/core/testing';

import { Services\skillsService } from './services\skills.service';

describe('Services\skillsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [Services\skillsService]
    });
  });

  it('should be created', inject([Services\skillsService], (service: Services\skillsService) => {
    expect(service).toBeTruthy();
  }));
});
