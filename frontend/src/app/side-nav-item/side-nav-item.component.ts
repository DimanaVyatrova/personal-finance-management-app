import { Component } from '@angular/core';
import {Budget} from "../models/budget";

@Component({
  selector: 'app-side-nav-item',
  templateUrl: './side-nav-item.component.html',
  styleUrls: ['./side-nav-item.component.css']
})
export class SideNavItemComponent {
  addBudgetClicked = false

  budgets : Budget[] = []

  onBudgetClick() {
    this.addBudgetClicked = true
    console.log(this.addBudgetClicked)
  }
}
