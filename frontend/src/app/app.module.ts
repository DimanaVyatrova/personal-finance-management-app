import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import {MatIconModule} from "@angular/material/icon";
import { AddButtonComponent } from './add-button/add-button.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from "@angular/material/table";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatInputModule} from "@angular/material/input";
import { TransactionsTableComponent } from './transactions/transactions-table/transactions-table.component';
import {MatCardModule} from "@angular/material/card";
import {MatSelectModule} from "@angular/material/select";
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import {MatChipsModule} from "@angular/material/chips";
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import {MatButtonModule} from "@angular/material/button";
import { AccountsModule } from './accounts/accounts.module';
import { TransactionsModule } from './transactions/transactions.module';
import { AccountsPageModule } from './accounts-page/accounts-page.module';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
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
