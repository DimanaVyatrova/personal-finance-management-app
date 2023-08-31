import { Component } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-checking-account-form',
  templateUrl: './checking-account-form.component.html',
  styleUrls: ['./checking-account-form.component.css', '../account-form.css']
})
export class CheckingAccountFormComponent {
  checkingAccountName: string | undefined | null;
  checkingAccountForm = new FormGroup({
    name: new FormControl(''),
  });

  onSubmit() {
    this.checkingAccountName = this.checkingAccountForm.value["name"];
  }
}
