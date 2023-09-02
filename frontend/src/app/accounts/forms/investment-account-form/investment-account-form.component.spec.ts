import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvestmentAccountFormComponent } from './investment-account-form.component';

describe('InvestmentAccountFormComponent', () => {
  let component: InvestmentAccountFormComponent;
  let fixture: ComponentFixture<InvestmentAccountFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InvestmentAccountFormComponent]
    });
    fixture = TestBed.createComponent(InvestmentAccountFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
