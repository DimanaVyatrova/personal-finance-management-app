import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BudgetComponent } from './budget/budget.component';
import {MaterialModule} from "./material-ui/material-ui.module";
import { NavigationComponent } from './navigation/navigation.component';
import { SideNavigatorComponent } from './side-navigator/side-navigator.component';
import { BudgetFormComponent } from './budget-form/budget-form.component';
import { SideNavItemComponent } from './side-nav-item/side-nav-item.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {CommonModule} from "@angular/common";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { GoalComponent } from './goal/goal.component';
import { SideNavGoalComponent } from './side-nav-goal/side-nav-goal.component';
import { GoalFormComponent } from './goal-form/goal-form.component';
import {NgApexchartsModule} from "ng-apexcharts";

@NgModule({
  declarations: [
    AppComponent,
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
