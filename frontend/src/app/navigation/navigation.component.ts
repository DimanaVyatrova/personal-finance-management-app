import { Component } from '@angular/core';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {
  budgetsClicked = false;
  goalsClicked = false;
  accountClicked = true;

  onClick($event) {
    console.log($event);
    if ($event.tab.textLabel === 'Budgets') {
      this.budgetsClicked = true;
      this.goalsClicked = false;
      this.accountClicked = false;
      console.log('budgets ' + this.budgetsClicked + ',goals ' + this.goalsClicked);
    }
    if ($event.tab.textLabel === 'Goals') {
      this.budgetsClicked = false;
      this.goalsClicked = true;
      this.accountClicked = false;
      console.log('budgets ' + this.budgetsClicked + ',goals ' + this.goalsClicked);
    }
    if ($event.tab.textLabel === 'Accounts') {
      this.budgetsClicked = false;
      this.goalsClicked = false;
      this.accountClicked = true;
      console.log('budgets ' + this.budgetsClicked + ',goals ' + this.goalsClicked);
    }
    console.log('on goals click');
  }
}
