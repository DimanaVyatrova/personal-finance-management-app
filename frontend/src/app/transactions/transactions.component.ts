import { Component } from '@angular/core';
import {Account} from "../account";

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css']
})
export class TransactionsComponent {
  account: Account;

}
