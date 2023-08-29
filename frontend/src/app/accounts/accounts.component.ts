import { Component } from '@angular/core';
import {ACCOUNTS} from "../mock-accounts";
import {Account} from "../account";

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent {
  accounts = ACCOUNTS;
  selectedAccount?: Account;

  onSelect(account: Account): void {
    this.selectedAccount = account;
    console.log(this.selectedAccount.name);
  }
}
