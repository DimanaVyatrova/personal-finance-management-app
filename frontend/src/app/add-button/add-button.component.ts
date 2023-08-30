import {Component, Input} from '@angular/core';
import {MatIconModule} from '@angular/material/icon';

@Component({
  selector: 'app-add-button',
  templateUrl: './add-button.component.html',
  styleUrls: ['./add-button.component.css'],
  standalone: true,
  imports: [MatIconModule],
})
export class AddButtonComponent {
  @Input() name: string = 'account';
}
