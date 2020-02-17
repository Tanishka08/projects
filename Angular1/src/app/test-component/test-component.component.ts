import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-component',
  template://`<h1>This Is An Image</h1>
  //<img src="{{imagePath}}"/>`,
  //styleUrls: ['./test-component.component.css']





  //............................applying css............................



`<h1 class="text-special">Welcome</h1>
<h1 [class]="classSuccess">Tanishka</h1>
<h1 [class.text-success]="hasError">This Is Some Heading</h1>
<h1 [class.text-danger]="hasError">This Is Page</h1>
 <h1 style="color:red">This Colour Is Red</h1>
 <h1 [style.color]="'orange'">Some Other Heading</h1>
 <h1 [style.background]="markColor">Some Thing</h1>
 <h1 [ngStyle]="special">Text</h1>
 
 
 <div>
 <h1 ngIf="hasError">Hello From If</h1>
 <h1 ngIf="!hasError">Hello From Else</h1>
 </div>
 <h1 "ngIf="hasError; else:elseBlock;then: ifBlock"></h1>
 <ng-Template #elseBlock>
 <h1>Hello From Another Else</h1>
 </ng-template>
<ng-template #ifBlock>
<h1>Hello From Another If</h1>
</ng-template>`, 

//................................buttonTag........................................

  //<button (click)="onButtonClicked($event)">Click</button>`
   styles:[`
   .text-success
   {
     color:green;
   }
   .text-danger
   {
     color:red;
   }
   .text-underline
   {
     text-decoration:underline
   }
   .text-special
   {
     font-style: italic;
   }
   
   `]
})
export class TestComponentComponent implements OnInit {
//imagePath='../assets/Images/image.png'

//................................ButtonTag...................................

//onButtonClicked(event){
 // console.log(event.type)
//}

classSuccess="text-success"
hasLine=true
hasError=true
markColor="orange"

message={
  "text-success":this.hasError,
  "text-danger":this.hasError,
  "text-underline":this.hasLine
}
special=
{
color:'red',
fontStyle:'italic',
fontSize:"32px"
}
  constructor() { }

  ngOnInit(): void {
  }

}
