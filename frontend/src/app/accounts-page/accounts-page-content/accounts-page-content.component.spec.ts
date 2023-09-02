import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountsPageContentComponent } from './accounts-page-content.component';

describe('AccountsPageContentComponent', () => {
  let component: AccountsPageContentComponent;
  let fixture: ComponentFixture<AccountsPageContentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AccountsPageContentComponent]
    });
    fixture = TestBed.createComponent(AccountsPageContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
