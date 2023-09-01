import { Component } from '@angular/core';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {
  budgetsClicked = true;
  goalsClicked = false;

  onBudgetsClick() {
    this.budgetsClicked = true;
    this.goalsClicked = false;

  }

  onGoalsClick($event) {
    console.log($event);
    if ($event.tab.textLabel === 'Budgets') {
      this.budgetsClicked = true;
      this.goalsClicked = false;
      console.log('budgets ' + this.budgetsClicked + ',goals ' + this.goalsClicked);
    }
    if ($event.tab.textLabel === 'Goals') {
      this.budgetsClicked = false;
      this.goalsClicked = true;
      console.log('budgets ' + this.budgetsClicked + ',goals ' + this.goalsClicked);
    }
    console.log('on goals click');
  }
}
