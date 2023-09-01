import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckingAccountFormComponent } from './checking-account-form.component';

describe('CheckingAccountFormComponent', () => {
  let component: CheckingAccountFormComponent;
  let fixture: ComponentFixture<CheckingAccountFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CheckingAccountFormComponent]
    });
    fixture = TestBed.createComponent(CheckingAccountFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
