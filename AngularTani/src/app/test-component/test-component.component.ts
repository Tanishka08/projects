import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-component',
  template: /*`<div [ngSwitch]="Number">
  
  <h1 *ngSwitchCase="'One'">1</h1>
  <h1 *ngSwitchCase="'Two'">2</h1>
  <h1 *ngSwitchCase="'Three'">3</h1>
  </div>
  
  <div [ngSwitch]="Number2">
  
  <h1 *ngSwitchCase="'One'">1</h1>
  <h1 *ngSwitchCase="'Two'"></h1>
  <h1 * ngSwitchCase="'Three'"></h1>
  <h1 *defaultCase="'Not Found'"></h1>
  </div>`*/
  
  `<p>Template Reference Variable</p>
  <input type="text" #myInput/>
  <h1>{{Name}}</h1>
  <button (click)="onButtonClick(myInput.value)">Button</button>
  
  <p>Through Two Way Data Binding</p>
  <h1>{{name}}</h1>
  <input type="text" [(ngModel)]="name"/>`,
  styleUrls: [

  ]})
export class TestComponentComponent implements OnInit {
//Number="Two"
//Number2="Two"
/*names=["Tani","Priya","Princy","Geetika"]
employee=[
  {"emp1":"1","empName":"Tani","age":21},
  {"emp1":"2","empName":"Priya","age":23}
]*/
Name="Priyanka"
name="Tanishka"

onButtonClick(value)
{
  console.log(value);
}

  constructor() { }

  ngOnInit(): void {
  }

}
