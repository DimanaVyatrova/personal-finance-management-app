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

  @Input() clickedBudgetName : string ='';

  budgetCategories : string[] = [];
  budgetExpenses : number = 0;
  percentage : number = 0;

  constructor(private budgetService : BudgetService) { }

  ngOnInit() {
    this.budgetService.getBugets().subscribe((result) => {
      this.data = result[0];
    });
    console.log(this.data);
  }

  ngOnChanges() {
    this.budgetService.getBudgetByName(this.clickedBudgetName).subscribe((result) => {
      this.data = result;
    });
    this.budgetService.getBudgetCategories(this.clickedBudgetName).subscribe((result) =>{
      this.budgetCategories = result;
    });
    this.budgetService.getBudgetExpenses(this.clickedBudgetName).subscribe((result) => {
      this.budgetExpenses = result;
      this.data.currentAmount = this.data.limitAmount - this.budgetExpenses;
      if (this.data.currentAmount < 0) {
        this.data.currentAmount = 0;
      }
      this.percentage = (this.budgetExpenses / this.data.limitAmount) * 100;
      console.log(this.percentage);
    })
  }

  onDeleteClick() {
    this.budgetService.deleteBudgetByName(this.data.name).subscribe((res) => {
      console.log(res);
      this.ngOnInit();
    });
  }

  onEditClick() {

  }
}
