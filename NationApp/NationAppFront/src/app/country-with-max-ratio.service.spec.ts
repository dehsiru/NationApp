import { TestBed } from '@angular/core/testing';

import { CountryWithMaxRatioService } from './country-with-max-ratio.service';

describe('CountryWithMaxRatioService', () => {
  let service: CountryWithMaxRatioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CountryWithMaxRatioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
