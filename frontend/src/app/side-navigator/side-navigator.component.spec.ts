import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SideNavigatorComponent } from './side-navigator.component';

describe('SideNavigatorComponent', () => {
  let component: SideNavigatorComponent;
  let fixture: ComponentFixture<SideNavigatorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SideNavigatorComponent]
    });
    fixture = TestBed.createComponent(SideNavigatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
