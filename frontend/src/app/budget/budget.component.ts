import { Component } from '@angular/core';

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html',
  styleUrls: ['./budget.component.css']
})
export class BudgetComponent {
  limitAmount = 200
  remainingAmount = 120
  budgetType = 'monthly'
  endDate = '2023-07-07'
  categories = ['grocery', 'fast food', 'eating out']
}
