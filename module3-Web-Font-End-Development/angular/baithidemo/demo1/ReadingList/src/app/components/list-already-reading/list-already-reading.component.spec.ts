import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAlreadyReadingComponent } from './list-already-reading.component';

describe('ListAlreadyReadingComponent', () => {
  let component: ListAlreadyReadingComponent;
  let fixture: ComponentFixture<ListAlreadyReadingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListAlreadyReadingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListAlreadyReadingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
