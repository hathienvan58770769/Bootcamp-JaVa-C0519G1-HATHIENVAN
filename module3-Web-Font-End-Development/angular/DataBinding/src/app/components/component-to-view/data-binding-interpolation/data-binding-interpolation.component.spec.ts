import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DataBindingInterpolationComponent } from './data-binding-interpolation.component';

describe('DataBindingInterpolationComponent', () => {
  let component: DataBindingInterpolationComponent;
  let fixture: ComponentFixture<DataBindingInterpolationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataBindingInterpolationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataBindingInterpolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
