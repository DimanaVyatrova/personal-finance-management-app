import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-vault',
  templateUrl: './vault.component.html',
  styleUrls: ['./vault.component.css']
})
export class VaultComponent {
  @Input() heading: string = '';
}
