import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test-component',
  template: 
  //`<h2>{{parentData.firstName}}</h2>
  //<h2>{{parentData.lastName}}</h2>
  //<h2>{{parentData.email}}</h2>
`<button class="btn btn-danger" (click)="onButtonClicked()" >Click</button>`,
  
  styleUrls: ['./test-component.component.css']
})
export class TestComponentComponent implements OnInit {
//@Input()
//public parentData


@Output()
public childEvent=new EventEmitter()

onButtonClicked()
{
  this.childEvent.emit("Data From Child")
}
  constructor() { }

  ngOnInit(): void {
  }

}
