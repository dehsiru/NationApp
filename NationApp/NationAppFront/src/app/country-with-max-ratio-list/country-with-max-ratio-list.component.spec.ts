import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryWithMaxRatioListComponent } from './country-with-max-ratio-list.component';

describe('CountryWithMaxRatioListComponent', () => {
  let component: CountryWithMaxRatioListComponent;
  let fixture: ComponentFixture<CountryWithMaxRatioListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountryWithMaxRatioListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CountryWithMaxRatioListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
