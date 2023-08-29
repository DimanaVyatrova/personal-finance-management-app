import { Component } from '@angular/core';
import {FormGroup,  FormControl} from "@angular/forms";
import {Budget} from "../models/budget";
import {BudgetService} from "../services/budget.service";

@Component({
  selector: 'app-budget-form',
  templateUrl: './budget-form.component.html',
  styleUrls: ['./budget-form.component.css']
})
export class BudgetFormComponent {
  currentAmount: number = 0;
  limitAmount: number = 0;
  name: string = '';
  periodEnd: string = '';
  periodStart: string = '';
  reccuringPeriod: string = '';
  userId: number = 1;
  categories : string[] = ['cat1','cat2'];

  constructor(private budgetService : BudgetService) { }

  onSubmit(data : any) {
    console.log(data);
    this.name = data.name;
    this.userId = 1;
    this.limitAmount = data.limitAmount;
    this.currentAmount = data.limitAmount;
    this.reccuringPeriod = data.type;
    this.periodStart = data.periodStart;
    this.periodEnd = "2023-09-09"


    this.budgetService.addBudget(this.currentAmount, this.limitAmount, this.name, this.periodEnd,
      this.periodStart, this.reccuringPeriod, this.userId, this.categories);
  }
}
