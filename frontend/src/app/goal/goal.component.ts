import {Component, Input} from '@angular/core';
import {Budget} from "../models/budget";
import {Goal} from "../models/goal";
import {BudgetService} from "../services/budget.service";
import {GoalService} from "../services/goal.service";

@Component({
  selector: 'app-goal',
  templateUrl: './goal.component.html',
  styleUrls: ['./goal.component.css']
})
export class GoalComponent {
  public data : Goal = {} as Goal;
  percentage : number = 0;

  @Input() clickedGoalName : string = '';

  constructor(private goalService : GoalService) { }

  ngOnInit() {
    console.log('goal comp ngonint ' + this.clickedGoalName);
    this.goalService.getGoals().subscribe((result) => {
      this.data = result[0];
    });
    console.log(this.data);
  }

  ngOnChanges() {
    this.goalService.getGoalByName(this.clickedGoalName).subscribe((result) => {
      this.data = result;
      this.percentage = this.data.goalAmount /this.data.currentAmount;
      if (this.data.currentAmount >= this.data.goalAmount) {
        this.percentage = 100;
      }
    });
  }

  onEditClick() {

  }

  onDeleteClick() {
    this.goalService.deleteGoalByName(this.data.name).subscribe((res) => {
      console.log(res);
      this.ngOnInit();
    });;
  }
}
