import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountsRoutingModule } from './accounts-routing.module';
import { AccountsListComponent } from './accounts-list/accounts-list.component';
import { SavingAccountComponent } from './saving-account/saving-account.component';
import {AccountDetailsComponent} from "./account-details/account-details.component";
import {VaultComponent} from "./vault/vault.component";
import {CheckingAccountFormComponent} from "./forms/checking-account-form/checking-account-form.component";
import {InvestmentAccountFormComponent} from "./forms/investment-account-form/investment-account-form.component";
import {SavingAccountFormComponent} from "./forms/saving-account-form/saving-account-form.component";
import {InvestmentAccountComponent} from "./investment-account/investment-account.component";
import {CheckingAccountComponent} from "./checking-account/checking-account.component";
import {MatIconModule} from "@angular/material/icon";
import {AddButtonComponent} from "../add-button/add-button.component";
import {TransactionsTableComponent} from "../transactions/transactions-table/transactions-table.component";
import {MatCardModule} from "@angular/material/card";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatInputModule} from "@angular/material/input";


@NgModule({
    declarations: [
      AccountsListComponent,
      AccountDetailsComponent,
      VaultComponent,
      CheckingAccountFormComponent,
      InvestmentAccountFormComponent,
      SavingAccountFormComponent,
      InvestmentAccountComponent,
      CheckingAccountComponent,
      InvestmentAccountComponent,
      SavingAccountComponent
    ],
  exports: [
    AccountsListComponent,
    SavingAccountComponent,
    CheckingAccountComponent,
    InvestmentAccountComponent,
    SavingAccountFormComponent,
    InvestmentAccountFormComponent,
    CheckingAccountFormComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AccountsRoutingModule,
    MatIconModule,
    AddButtonComponent,
    TransactionsTableComponent,
    MatCardModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule,
  ]
})
export class AccountsModule { }
