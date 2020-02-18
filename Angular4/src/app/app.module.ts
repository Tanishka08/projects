import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {TablePipe} from './table.Pipe'
import { AppComponent } from './app.component';
import { TestComponentComponent } from './test-component/test-component.component';
import { HeaderComponent } from './header/header.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { DataServiceService } from './data-service.service';
import {HttpClientModule} from '@angular/common/http'
@NgModule({
  declarations: [
    AppComponent,
    TestComponentComponent,
    HeaderComponent,
    NavBarComponent,
    TablePipe,
    EmployeeComponent,
    EmployeeListComponent
  ],
  imports: [
    BrowserModule,
HttpClientModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
