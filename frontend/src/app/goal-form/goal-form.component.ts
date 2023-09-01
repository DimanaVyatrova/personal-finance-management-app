import { Component } from '@angular/core';
import {FormControl} from "@angular/forms";
import {GoalService} from "../services/goal.service";

@Component({
  selector: 'app-goal-form',
  templateUrl: './goal-form.component.html',
  styleUrls: ['./goal-form.component.css']
})
export class GoalFormComponent {
  htmlstring : string = '';
  type = new FormControl('');

  constructor(private goalService : GoalService) { }

  onSubmit(data : any) {
    console.log(data);

    this.goalService.addGoal(this.type.value, 0, data.goalAmount, data.name,
      data.payee, 1, data.savingsAccountName);
  }
}
