import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BudgetFormComponent } from './budget-form.component';

describe('BudgetFormComponent', () => {
  let component: BudgetFormComponent;
  let fixture: ComponentFixture<BudgetFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BudgetFormComponent]
    });
    fixture = TestBed.createComponent(BudgetFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
