import { Component } from '@angular/core';

@Component({
  selector: 'app-side-nav-item',
  templateUrl: './side-nav-item.component.html',
  styleUrls: ['./side-nav-item.component.css']
})
export class SideNavItemComponent {
  items: any[] =  ['Food', 'Entertainment', 'Education']
  addBudgetClicked = false

  onBudgetClick() {
    this.addBudgetClicked = true
    console.log(this.addBudgetClicked)
  }
}
