import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvestmentAccountComponent } from './investment-account.component';

describe('InvestmentAccountComponent', () => {
  let component: InvestmentAccountComponent;
  let fixture: ComponentFixture<InvestmentAccountComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InvestmentAccountComponent]
    });
    fixture = TestBed.createComponent(InvestmentAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
