import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
private _url="../assets/data.json"
  constructor( private http:HttpClient) { }
  getEmployees():Observable<any[]>
  {
    
    return this.http.get<any[]>(this._url);
     /* {
        "EmpId":101,"Name":"Mark","Gender":"Male","Salary":"5000"},
        {"EmpId":102,"Name":"Paul","Gender":"Male","Salary":"6000"

      }
    ]*/
  }
}
