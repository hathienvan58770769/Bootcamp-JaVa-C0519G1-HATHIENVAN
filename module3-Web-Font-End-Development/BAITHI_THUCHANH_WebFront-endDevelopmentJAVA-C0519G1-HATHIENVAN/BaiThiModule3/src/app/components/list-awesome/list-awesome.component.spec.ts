import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAwesomeComponent } from './list-awesome.component';

describe('ListAwesomeComponent', () => {
  let component: ListAwesomeComponent;
  let fixture: ComponentFixture<ListAwesomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListAwesomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListAwesomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
