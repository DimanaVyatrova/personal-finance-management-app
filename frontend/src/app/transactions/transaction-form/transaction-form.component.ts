import { Component } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {GOALS} from "../../mock-models-data/mock-goals";
import {ACCOUNTS} from "../../mock-models-data/mock-accounts";
import {CATEGORIES} from "../../mock-models-data/mock-categories";
import {PERIODS} from "../../mock-models-data/mock-periods";
import {Category} from "../../models/category";
import {Period} from "../../models/period";
import {Account} from "../../models/account";

@Component({
  selector: 'app-transaction-form',
  templateUrl: './transaction-form.component.html',
  styleUrls: ['./transaction-form.component.css', '../../accounts/forms/form.css']
})
export class TransactionFormComponent {

  transactionForm = new FormGroup({
    amount: new FormControl<Number | null>(null),
    notes: new FormControl(''),
    transactionParty: new FormControl(''),
    category: new FormControl<Category | null>(null),
    recurringPeriod: new FormControl<Period | null>(null),
    account: new FormControl<Account | null>(null),
    isIncome: new FormControl<Boolean>(false)
  });

  categories = CATEGORIES;
  periods = PERIODS;
  accounts = ACCOUNTS;

  onSubmit() {
    console.log("this.transactionForm.value");
  }
}
