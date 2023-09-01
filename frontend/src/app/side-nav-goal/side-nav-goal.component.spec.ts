import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SideNavGoalComponent } from './side-nav-goal.component';

describe('SideNavGoalComponent', () => {
  let component: SideNavGoalComponent;
  let fixture: ComponentFixture<SideNavGoalComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SideNavGoalComponent]
    });
    fixture = TestBed.createComponent(SideNavGoalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
