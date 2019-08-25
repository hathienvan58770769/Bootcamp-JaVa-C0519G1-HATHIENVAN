import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeAwesomeComponent } from './home-awesome.component';

describe('HomeAwesomeComponent', () => {
  let component: HomeAwesomeComponent;
  let fixture: ComponentFixture<HomeAwesomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeAwesomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeAwesomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
