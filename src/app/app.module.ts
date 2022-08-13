import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { EmployeeComponentComponent } from './components/employee-component/employee-component.component';
import { DepartmentComponent } from './components/department/department.component';
import { NewemployeeComponent } from './components/newemployee/newemployee.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { NewDepartmentComponent } from './components/new-department/new-department.component';
import {FormsModule} from  '@angular/forms'

const route:Routes=[
  
  {path :"",component:WelcomeComponent},
  {path :"employee",component:EmployeeComponentComponent},
  {path :"department",component:DepartmentComponent},
  {path:"newEmployee",component:NewemployeeComponent},
  {path:"editEmployee/:id",component:NewemployeeComponent},
  {path:"newDepartment",component:NewDepartmentComponent},
  {path:"search/:searchName",component:EmployeeComponentComponent},
  {path:"employees/:depId",component:EmployeeComponentComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponentComponent,
    DepartmentComponent,
    NewemployeeComponent,
    WelcomeComponent,
    NewDepartmentComponent
  ],
 
  imports: [
    BrowserModule,
    RouterModule.forRoot(route),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
