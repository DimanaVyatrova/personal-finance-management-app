import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './accounts-page/sidebar/sidebar.component';
import {MatIconModule} from "@angular/material/icon";
import { AddButtonComponent } from './add-button/add-button.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from "@angular/material/table";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatInputModule} from "@angular/material/input";
import { TransactionsTableComponent } from './transactions/transactions-table/transactions-table.component';
import {MatCardModule} from "@angular/material/card";
import { VaultComponent } from './accounts/vault/vault.component';
import { CheckingAccountFormComponent } from './accounts/forms/checking-account-form/checking-account-form.component';
import {ReactiveFormsModule} from "@angular/forms";
import { InvestmentAccountFormComponent } from './accounts/forms/investment-account-form/investment-account-form.component';
import { SavingAccountFormComponent } from './accounts/forms/saving-account-form/saving-account-form.component';
import {MatSelectModule} from "@angular/material/select";
import { InvestmentAccountComponent } from './accounts/investment-account/investment-account.component';
import { TransactionFormComponent } from './transactions/transaction-form/transaction-form.component';
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import {MatChipsModule} from "@angular/material/chips";
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import {MatButtonModule} from "@angular/material/button";
import { CheckingAccountComponent } from './accounts/checking-account/checking-account.component';
import { AccountsModule } from './accounts/accounts.module';
import { TransactionsModule } from './transactions/transactions.module';
import { AccountsPageContentComponent } from './accounts-page/accounts-page-content/accounts-page-content.component';
import { AccountsPageModule } from './accounts-page/accounts-page.module';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    // SidebarComponent,
    // VaultComponent,
    // CheckingAccountFormComponent,
    // InvestmentAccountFormComponent,
    // SavingAccountFormComponent,
    // InvestmentAccountComponent,
    // TransactionFormComponent,
    // CheckingAccountComponent,
    // AccountsPageContentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatIconModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatFormFieldModule,
    MatPaginatorModule,
    MatInputModule,
    TransactionsTableComponent,
    MatCardModule,
    // ReactiveFormsModule,
    MatSelectModule,
    MatSlideToggleModule,
    MatChipsModule,
    MatButtonToggleModule,
    MatButtonModule,
    AccountsModule,
    TransactionsModule,
    AccountsPageModule,
    AddButtonComponent
  ],
  providers: [],
  exports: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
