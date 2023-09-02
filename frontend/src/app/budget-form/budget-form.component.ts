import {Component, inject} from '@angular/core';
import {FormGroup,  FormControl} from "@angular/forms";
import {Budget} from "../models/budget";
import {BudgetService} from "../services/budget.service";
import {CategoryService} from "../services/category.service";
import {LiveAnnouncer} from "@angular/cdk/a11y";
import {MatChipEditedEvent, MatChipInputEvent} from "@angular/material/chips";
import {COMMA, ENTER} from "@angular/cdk/keycodes";

export interface Category {
  name: string;
}

@Component({
  selector: 'app-budget-form',
  templateUrl: './budget-form.component.html',
  styleUrls: ['./budget-form.component.css']
})
export class BudgetFormComponent {
  currentAmount: number = 0;
  limitAmount: number = 0;
  name: string = '';
  periodEnd: string = '';
  periodStart: string = '';
  reccuringPeriod: string = '';
  userId: number = 1;
  categories : string[] = [];
  allCategories : string[] = [];
  errorMsg : string = 'The following categories already exist, you cant use them: ';
  errorExists : boolean = false;
  success : boolean = false;

  constructor(private budgetService : BudgetService, private categoryService : CategoryService) { }

  ngOnInit() {
    this.success = false;
  }

  calculatePeriodEnd() {
    let date = new Date(this.periodStart);
    if (this.reccuringPeriod == 'ANNUALLY') {
      date.setFullYear(date.getFullYear() + 1);
    }

    if (this.reccuringPeriod == 'MONTHLY') {
      date.setMonth(date.getMonth() + 1);
    }

    if (this.reccuringPeriod == 'WEEKLY') {
      date.setDate(date.getDate() + 7);
    }

    if (this.reccuringPeriod == 'QUARTERLY') {
      date.setMonth(date.getMonth() + 3);
    }

    return date.toISOString().split('T')[0];
  }

  onSubmit(data : any) {
    console.log(data);
    this.errorExists = false;
    this.errorMsg= 'The following categories already exist, you cant use them: ';
    this.name = data.name;
    this.userId = 1;
    this.limitAmount = data.limitAmount;
    this.currentAmount = data.limitAmount;
    this.reccuringPeriod = data.type;
    this.periodStart = data.startDate;

    //calculate end date
    this.periodEnd = this.calculatePeriodEnd();
    console.log('date '+ this.periodEnd);

    this.inputCategories.forEach((elem) => this.categories.push(elem.name))
    console.log('Categories ' + this.categories);

    this.categoryService.getAllCategoryNames().subscribe((res) => {
      res.forEach((cat) => {
        if (this.categories.includes(cat)) {
          this.errorMsg += '[' + cat + ']' +' ';
          this.errorExists = true;
        }
      });
      console.log('errorExists in lambda ' + this.errorExists);
      if (!this.errorExists) {
        this.budgetService.addBudget(this.currentAmount, this.limitAmount, this.name, this.periodEnd,
          this.periodStart, this.reccuringPeriod, this.userId, this.categories);
        this.success = true;
        console.log('SEND POST');
      } else {
        console.log('in else');
        this.categories = [];
        this.inputCategories = [];
      }
    });


  }

  //Categories Chips Input Field
  addOnBlur = true;
  readonly separatorKeysCodes = [ENTER, COMMA] as const;
  inputCategories: Category[] = [];

  announcer = inject(LiveAnnouncer);

  add(event: MatChipInputEvent): void {
    const value = (event.value || '').trim();

    // Add our fruit
    if (value) {
      this.inputCategories.push({name: value});
    }

    // Clear the input value
    event.chipInput!.clear();
  }

  remove(fruit: Category): void {
    const index = this.inputCategories.indexOf(fruit);

    if (index >= 0) {
      this.inputCategories.splice(index, 1);

      this.announcer.announce(`Removed ${fruit}`);
    }
  }

  edit(fruit: Category, event: MatChipEditedEvent) {
    const value = event.value.trim();

    // Remove fruit if it no longer has a name
    if (!value) {
      this.remove(fruit);
      return;
    }

    // Edit existing fruit
    const index = this.inputCategories.indexOf(fruit);
    if (index >= 0) {
      this.inputCategories[index].name = value;
    }
  }
}
