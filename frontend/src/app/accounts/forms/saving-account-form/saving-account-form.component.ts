import { Component } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {GOALS} from "../../../mock-models-data/mock-goals";

@Component({
  selector: 'app-saving-account-form',
  templateUrl: './saving-account-form.component.html',
  styleUrls: ['./saving-account-form.component.css', '../form.css']
})
export class SavingAccountFormComponent {
  savingAccountName: string | undefined | null;
  savingAccountId: string | undefined | null;

  savingAccountForm = new FormGroup({
    name: new FormControl(''),
    goal: new FormControl(''),
  });

  goals = GOALS;

  onSubmit() {
    this.savingAccountName = this.savingAccountForm.value["name"];
    this.savingAccountId = this.savingAccountForm.value["goal"];
    console.log(this.savingAccountName);
  }
}
