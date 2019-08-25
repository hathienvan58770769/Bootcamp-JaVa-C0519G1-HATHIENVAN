import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAwesomeComponent } from './add-awesome.component';

describe('AddAwesomeComponent', () => {
  let component: AddAwesomeComponent;
  let fixture: ComponentFixture<AddAwesomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddAwesomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddAwesomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
