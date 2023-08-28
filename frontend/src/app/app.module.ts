import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BudgetComponent } from './budget/budget.component';
import {MaterialModule} from "./material-ui/material-ui.module";
import { NavigationComponent } from './navigation/navigation.component';
import { SideNavigatorComponent } from './side-navigator/side-navigator.component';
import {MatButton} from "@angular/material/button";
import { BudgetFormComponent } from './budget-form/budget-form.component';
import { SideNavItemComponent } from './side-nav-item/side-nav-item.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {CommonModule} from "@angular/common";

@NgModule({
  declarations: [
    AppComponent,
    BudgetComponent,
    NavigationComponent,
    SideNavigatorComponent,
    BudgetFormComponent,
    SideNavItemComponent,
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    MaterialModule,
    BrowserModule,
    BrowserAnimationsModule,
    CommonModule
  ],
  exports: [AppRoutingModule, BudgetComponent, BudgetFormComponent, SideNavigatorComponent],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
