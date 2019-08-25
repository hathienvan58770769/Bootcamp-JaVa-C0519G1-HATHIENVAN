import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditAwesomeComponent } from './edit-awesome.component';

describe('EditAwesomeComponent', () => {
  let component: EditAwesomeComponent;
  let fixture: ComponentFixture<EditAwesomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditAwesomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditAwesomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
