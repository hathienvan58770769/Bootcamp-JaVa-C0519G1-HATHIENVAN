import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAwesomesComponent } from './list-awesomes.component';

describe('ListAwesomesComponent', () => {
  let component: ListAwesomesComponent;
  let fixture: ComponentFixture<ListAwesomesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListAwesomesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListAwesomesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
