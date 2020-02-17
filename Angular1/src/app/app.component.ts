import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <app-test-component></app-test-component>
  <h1>Hello</h1>
  <p>This Is My Page</p>
  <h1>Tanishka</h1>
  <h1>{{name}}</h1>
  <h1>{{getMessage()}}</h1>`
  ,

  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'BoothStrapPage';

name ="Mark Smith";
 getMessage()
 {
   return "Page";
 }
}
