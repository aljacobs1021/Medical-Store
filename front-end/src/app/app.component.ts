import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Medical Store';
  showFiller = false;
  navClass= 'navbar navbar-expand-lg navbar-dark bg-primary';
}
