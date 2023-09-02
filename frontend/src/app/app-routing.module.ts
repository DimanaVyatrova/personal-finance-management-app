import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {BudgetComponent} from "./budget/budget.component";
import {AppComponent} from "./app.component";
import {BudgetFormComponent} from "./budget-form/budget-form.component";

const routes: Routes = [
  { path: 'budget', component: BudgetComponent },
  { path: 'budget-form', component: BudgetFormComponent },
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
