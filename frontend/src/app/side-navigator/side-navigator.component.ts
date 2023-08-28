import { Component } from '@angular/core';

@Component({
  selector: 'app-side-navigator',
  templateUrl: './side-navigator.component.html',
  styleUrls: ['./side-navigator.component.css']
})
export class SideNavigatorComponent {
  items: any[] =  ['Food', 'Entertainment', 'Education']
  addBudgetClicked = false

  onBudgetClick() {
    this.addBudgetClicked = !this.addBudgetClicked
    console.log(this.addBudgetClicked)
  }
}
