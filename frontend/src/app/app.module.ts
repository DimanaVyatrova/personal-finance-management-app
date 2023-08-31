import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { ContentComponent } from './content/content.component';
import { AccountsComponent } from './accounts/accounts.component';
import {MatIconModule} from "@angular/material/icon";
import { AddButtonComponent } from './add-button/add-button.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from "@angular/material/table";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatInputModule} from "@angular/material/input";
import { TransactionsTableComponent } from './transactions-table/transactions-table.component';
import { TransactionsComponent } from './transactions/transactions.component';
import {MatCardModule} from "@angular/material/card";
import { VaultComponent } from './vault/vault.component';
import { CheckingAccountFormComponent } from './checking-account-form/checking-account-form.component';
import {ReactiveFormsModule} from "@angular/forms";
import { InvestmentAccountFormComponent } from './investment-account-form/investment-account-form.component';
import { SavingAccountFormComponent } from './saving-account-form/saving-account-form.component';
import {MatSelectModule} from "@angular/material/select";


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    ContentComponent,
    AccountsComponent,
    TransactionsComponent,
    VaultComponent,
    CheckingAccountFormComponent,
    InvestmentAccountFormComponent,
    SavingAccountFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatIconModule,
    AddButtonComponent,
    BrowserAnimationsModule,
    MatTableModule,
    MatFormFieldModule,
    MatPaginatorModule,
    MatInputModule,
    TransactionsTableComponent,
    MatCardModule,
    ReactiveFormsModule,
    MatSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
