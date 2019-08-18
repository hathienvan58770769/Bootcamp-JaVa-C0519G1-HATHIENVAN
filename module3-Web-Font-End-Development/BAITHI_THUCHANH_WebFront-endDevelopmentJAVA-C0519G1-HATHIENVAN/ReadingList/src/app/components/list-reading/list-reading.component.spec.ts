import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListReadingComponent } from './list-reading.component';

describe('ListReadingComponent', () => {
  let component: ListReadingComponent;
  let fixture: ComponentFixture<ListReadingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListReadingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListReadingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
