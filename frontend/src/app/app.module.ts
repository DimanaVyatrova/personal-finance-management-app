import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import {MatIconModule} from "@angular/material/icon";
import { AddButtonComponent } from './add-button/add-button.component';
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
import { BudgetComponent } from './budget/budget.component';
import {MaterialModule} from "./material-ui/material-ui.module";
import { NavigationComponent } from './navigation/navigation.component';
import { SideNavigatorComponent } from './side-navigator/side-navigator.component';
import { BudgetFormComponent } from './budget-form/budget-form.component';
import { SideNavItemComponent } from './side-nav-item/side-nav-item.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {CommonModule} from "@angular/common";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { GoalComponent } from './goal/goal.component';
import { SideNavGoalComponent } from './side-nav-goal/side-nav-goal.component';
import { GoalFormComponent } from './goal-form/goal-form.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BudgetComponent,
    NavigationComponent,
    SideNavigatorComponent,
    BudgetFormComponent,
    SideNavItemComponent,
    GoalComponent,
    SideNavGoalComponent,
    GoalFormComponent,
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    MaterialModule,
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
    AddButtonComponent,
    BrowserAnimationsModule,
    CommonModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  exports: [AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
