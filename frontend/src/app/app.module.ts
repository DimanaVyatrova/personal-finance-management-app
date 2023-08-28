import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BudgetComponent } from './budget/budget.component';
import {MaterialModule} from "./material-ui/material-ui.module";
import { NavigationComponent } from './navigation/navigation.component';
import { SideNavigatorComponent } from './side-navigator/side-navigator.component';

@NgModule({
  declarations: [
    AppComponent,
    BudgetComponent,
    NavigationComponent,
    SideNavigatorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
