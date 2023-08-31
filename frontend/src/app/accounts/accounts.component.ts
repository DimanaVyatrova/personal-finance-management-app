import {Component, inject, Input} from '@angular/core';
import {Account} from "../models/account";
import {ACCOUNTS} from "../mock-models-data/mock-accounts";

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent {
  @Input() maxHeight: number = 300; // Default max height, can be overridden
  accounts = ACCOUNTS;
  selectedAccount?: Account;

  constructor() {}

  onSelect(account: Account): void {
    this.selectedAccount = account;
    console.log(this.selectedAccount.name);
  }
}
