import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckingAccountComponent } from './checking-account.component';

describe('CheckingAccountComponent', () => {
  let component: CheckingAccountComponent;
  let fixture: ComponentFixture<CheckingAccountComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CheckingAccountComponent]
    });
    fixture = TestBed.createComponent(CheckingAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
