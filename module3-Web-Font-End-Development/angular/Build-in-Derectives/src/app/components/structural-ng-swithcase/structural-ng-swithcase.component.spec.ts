import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StructuralNgSwithcaseComponent } from './structural-ng-swithcase.component';

describe('StructuralNgSwithcaseComponent', () => {
  let component: StructuralNgSwithcaseComponent;
  let fixture: ComponentFixture<StructuralNgSwithcaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StructuralNgSwithcaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StructuralNgSwithcaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
