import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountsRoutingModule } from './accounts-routing.module';
import { AccountsListComponent } from './accounts-list/accounts-list.component';
import { SavingAccountComponent } from './saving-account/saving-account.component';
import {AppModule} from "../app.module";
import {AccountDetailsComponent} from "./account-details/account-details.component";
import {SidebarComponent} from "../accounts-page/sidebar/sidebar.component";
import {VaultComponent} from "./vault/vault.component";
import {CheckingAccountFormComponent} from "./forms/checking-account-form/checking-account-form.component";
import {InvestmentAccountFormComponent} from "./forms/investment-account-form/investment-account-form.component";
import {SavingAccountFormComponent} from "./forms/saving-account-form/saving-account-form.component";
import {InvestmentAccountComponent} from "./investment-account/investment-account.component";
import {TransactionFormComponent} from "../transactions/transaction-form/transaction-form.component";
import {CheckingAccountComponent} from "./checking-account/checking-account.component";
import {AccountsPageContentComponent} from "../accounts-page/accounts-page-content/accounts-page-content.component";
import {MatIconModule} from "@angular/material/icon";
import {AddButtonComponent} from "../add-button/add-button.component";
import {TransactionsTableComponent} from "../transactions/transactions-table/transactions-table.component";
import {MatCardModule} from "@angular/material/card";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


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
  ]
})
export class AccountsModule { }
