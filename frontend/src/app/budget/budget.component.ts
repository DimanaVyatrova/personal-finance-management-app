import {Component, Inject} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BudgetService} from "../services/budget.service";
import {Budget} from "../models/budget";
import { Input } from '@angular/core';

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html',
  styleUrls: ['./budget.component.css']
})
export class BudgetComponent {
  public data : Budget = {} as Budget;

  @Input() clickedBudgetName : string = 'food';

  constructor(private budgetService : BudgetService) { }

  ngOnInit() {
    console.log('budget comp ngonint ' + this.clickedBudgetName);
    this.budgetService.getBudget(1).subscribe((result) => {
      this.data = result;
    });
    console.log(this.data);
  }

  ngOnChanges() {
    this.budgetService.getBudgetByName(this.clickedBudgetName).subscribe((result) => {
      this.data = result;
    });
  }

  onDeleteClick() {

  }

  onEditClick() {

  }
}
