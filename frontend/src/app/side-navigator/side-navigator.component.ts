import {Component, Input} from '@angular/core';
import {Budget} from "../models/budget";
import {BudgetService} from "../services/budget.service";
import { Output, EventEmitter } from '@angular/core';
import {Goal} from "../models/goal";
import {GoalService} from "../services/goal.service";


@Component({
  selector: 'app-side-navigator',
  templateUrl: './side-navigator.component.html',
  styleUrls: ['./side-navigator.component.css']
})
export class SideNavigatorComponent {
  items: any[] =  ['Food', 'Entertainment', 'Education']
  addBudgetClicked = false

  budgets : Budget[] = [];
  goals : Goal[] = [];

  @Input() type : string = '';

  name : string = '';

  @Output() clickedBudgetNameEvent = new EventEmitter<string>();

  constructor(private budgetService : BudgetService, private goalService : GoalService) {
  }

  ngOnInit() {
    console.log(this.type);
    if (this.type === 'budget') {
      this.budgetService.getBugets().subscribe((result) => {
        console.log(result);
        this.budgets = result;
      });
    }
    if (this.type === 'goal') {
      this.goalService.getGoals().subscribe((result) => {
        console.log(result);
        this.goals = result;
      });
    }
  }

  onBudgetClick() {
    this.addBudgetClicked = !this.addBudgetClicked;
    console.log(this.addBudgetClicked)
  }

  getNameOfClickedBudget(name : string) {
    this.name = name;
    this.clickedBudgetNameEvent.emit(name);
    console.log(this.name);
  }
}
