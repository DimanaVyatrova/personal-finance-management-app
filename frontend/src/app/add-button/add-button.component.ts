import {Component, Input} from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MaterialModule} from "../material-ui/material-ui.module";


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
