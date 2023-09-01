import {Component, Input} from '@angular/core';
import {ACCOUNTS} from "../../mock-models-data/mock-accounts";
import {Account} from "../../models/account";

@Component({
  selector: 'app-accounts-list',
  templateUrl: './accounts-list.component.html',
  styleUrls: ['./accounts-list.component.css']
})
export class AccountsListComponent {
  @Input() maxHeight: number = 300; // Default max height, can be overridden
  accounts = ACCOUNTS;
  selectedAccount?: Account;

  constructor() {}

  onSelect(account: Account): void {
    this.selectedAccount = account;
    console.log(this.selectedAccount.name);
  }
}
