import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewToComponentToViewComponent } from './view-to-component-to-view.component';

describe('ViewToComponentToViewComponent', () => {
  let component: ViewToComponentToViewComponent;
  let fixture: ComponentFixture<ViewToComponentToViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewToComponentToViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewToComponentToViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
