import { TestBed } from '@angular/core/testing';

import { EmpappserviceService } from './empappservice.service';

describe('EmpappserviceService', () => {
  let service: EmpappserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmpappserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
