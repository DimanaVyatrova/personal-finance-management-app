import {Component, Input} from '@angular/core';
import {ACCOUNTS} from "../mock-accounts";
import {Account} from "../account";

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent {
  @Input() maxHeight: number = 300; // Default max height, can be overridden
  accounts = ACCOUNTS;
  selectedAccount?: Account;

  onSelect(account: Account): void {
    this.selectedAccount = account;
    console.log(this.selectedAccount.name);
  }
}
