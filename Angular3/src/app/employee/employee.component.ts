import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service'
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
 
})
export class EmployeeComponent implements OnInit {
public employee=[];
  constructor(private dataService:DataServiceService)
   { }

  ngOnInit(): void {
    this.dataService.getEmployees().subscribe(
      data=>this.employee=data);
    
  }

}
