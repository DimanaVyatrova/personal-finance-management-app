import { Component } from '@angular/core';
import {Budget} from "../models/budget";
import {Goal} from "../models/goal";

@Component({
  selector: 'app-side-nav-goal',
  templateUrl: './side-nav-goal.component.html',
  styleUrls: ['./side-nav-goal.component.css']
})
export class SideNavGoalComponent {
  addGoalClicked = false

  goals : Goal[] = []

  type : string = 'goal';

  clickedGoalName : string = '';

  onGoalClick() {
    this.addGoalClicked = true;
    console.log(this.addGoalClicked)
  }

  setClickedGoalName(name : string) {
    this.clickedGoalName = name;
    this.addGoalClicked = false;
    console.log('clicked budget name ' + this.clickedGoalName);
  }
}
