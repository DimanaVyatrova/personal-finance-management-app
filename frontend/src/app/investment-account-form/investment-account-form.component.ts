import { Component } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-investment-account-form',
  templateUrl: './investment-account-form.component.html',
  styleUrls: ['./investment-account-form.component.css', '../account-form.css']
})
export class InvestmentAccountFormComponent {
  investmentAccountName: string | undefined | null;
  investmentAccountForm = new FormGroup({
    name: new FormControl(''),
  });

  onSubmit() {
    this.investmentAccountName = this.investmentAccountForm.value["name"];
  }
}
