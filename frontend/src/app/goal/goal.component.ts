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


  @Input() clickedGoalName : string = 'Pay Off Car';

  constructor(private goalService : GoalService) { }

  ngOnInit() {
    console.log('goal comp ngonint ' + this.clickedGoalName);
    this.goalService.getGoal(1).subscribe((result) => {
      this.data = result;
    });
    console.log(this.data);
  }

  ngOnChanges() {
    this.goalService.getGoalByName(this.clickedGoalName).subscribe((result) => {
      this.data = result;
    });
  }

  onEditClick() {

  }

  onDeleteClick() {

  }
}
