import { Component } from '@angular/core';
import {Budget} from "../models/budget";
import { AddButtonComponent } from '../add-button/add-button.component';

@Component({
  selector: 'app-side-nav-item',
  templateUrl: './side-nav-item.component.html',
  styleUrls: ['./side-nav-item.component.css']
})
export class SideNavItemComponent {
  addBudgetClicked = false;

  budgets : Budget[] = [];

  type : string = 'budget';

  clickedBudgetName : string = 'food';

  onBudgetClick() {
    this.addBudgetClicked = true;
    console.log(this.addBudgetClicked)
  }

  setClickedBudgetName(name : string) {
    this.clickedBudgetName = name;
    this.addBudgetClicked = false;
    console.log('clicked budget name ' + this.clickedBudgetName);
  }
}
