import { Component } from '@angular/core';
import {Budget} from "../models/budget";
import {BudgetService} from "../services/budget.service";

@Component({
  selector: 'app-side-navigator',
  templateUrl: './side-navigator.component.html',
  styleUrls: ['./side-navigator.component.css']
})
export class SideNavigatorComponent {
  items: any[] =  ['Food', 'Entertainment', 'Education']
  addBudgetClicked = false

  budgets : Budget[] = []

  constructor(private budgetService : BudgetService) {
  }

  ngOnInit() {
    this.budgetService.getBugets().subscribe((result) => {
      console.log(result);
      this.budgets = result;
    })
  }

  onBudgetClick() {
    this.addBudgetClicked = !this.addBudgetClicked
    console.log(this.addBudgetClicked)
  }
}
