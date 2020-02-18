import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html',
  
  
  
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular3';
  //identity={
    //firstName:"Tani",
    //lastName:"Vijayvergiya",
    //email:"luv2Code@gmail.com"
    name="Mark"
    person={
      "firstName":"Tani","lastName":"Vijay","Email":"Love2Code@gmail.com"
    }
    public employees=[
      {"EmpId":101, "Name":"Mark","Gender":"Male","Salary":5000},
      {"EmpId":102,"Name":"Paul","Gender":"Male","Salary":6000
      }
    ]
  }

