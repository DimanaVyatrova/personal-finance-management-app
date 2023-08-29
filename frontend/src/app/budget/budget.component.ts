import {Component, Inject} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BudgetService} from "../services/budget.service";
import {Budget} from "../models/budget";

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html',
  styleUrls: ['./budget.component.css']
})
export class BudgetComponent {
  /*limitAmount = 200
  remainingAmount = 120
  budgetType = 'monthly'
  endDate = '2023-07-07'
  categories = ['grocery', 'fast food', 'eating out']*/
  public data : Budget = {} as Budget;

  constructor(private budgetService : BudgetService) { }

  ngOnInit() {
    this.budgetService.getBudget(1).subscribe((result) => {
      this.data = result;
    });
    console.log(this.data);
  }
}
