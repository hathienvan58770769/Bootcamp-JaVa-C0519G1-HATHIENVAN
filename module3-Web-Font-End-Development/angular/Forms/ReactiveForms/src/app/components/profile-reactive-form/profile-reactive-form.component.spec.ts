import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileReactiveFormComponent } from './profile-reactive-form.component';

describe('ProfileReactiveFormComponent', () => {
  let component: ProfileReactiveFormComponent;
  let fixture: ComponentFixture<ProfileReactiveFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfileReactiveFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfileReactiveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
