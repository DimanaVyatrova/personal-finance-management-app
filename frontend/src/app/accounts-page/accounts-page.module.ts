import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountsPageRoutingModule } from './accounts-page-routing.module';
import {SidebarComponent} from "./sidebar/sidebar.component";
import {AccountsPageContentComponent} from "./accounts-page-content/accounts-page-content.component";
import {AccountsModule} from "../accounts/accounts.module";
import {AddButtonComponent} from "../add-button/add-button.component";
import {TransactionsModule} from "../transactions/transactions.module";


@NgModule({
  declarations: [
    SidebarComponent,
    AccountsPageContentComponent
  ],
  exports: [
    AccountsPageContentComponent
  ],
  imports: [
    CommonModule,
    AccountsPageRoutingModule,
    AccountsModule,
    AddButtonComponent,
    TransactionsModule
  ]
})
export class AccountsPageModule { }
