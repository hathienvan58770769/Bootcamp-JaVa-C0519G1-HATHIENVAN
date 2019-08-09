import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StructuralNgforComponent } from './structural-ngfor.component';

describe('StructuralNgforComponent', () => {
  let component: StructuralNgforComponent;
  let fixture: ComponentFixture<StructuralNgforComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StructuralNgforComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StructuralNgforComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
