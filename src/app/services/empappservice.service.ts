import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpHeaders } from '@angular/common/http';
import { Employee } from '../common/employee';
import { Observable,map } from 'rxjs';
import { Department } from '../common/department';

@Injectable({
  providedIn: 'root'
})

export class EmpappserviceService {
 
  empurl= "http://localhost:8080/api/emp"
  depurl= "http://localhost:8080/api/dep"

  constructor( private httpclient:HttpClient) { }



  getallemployees():Observable<Employee[]>{
    return this.httpclient.get<getEmployeeResponse>(this.empurl).pipe(map(response =>response._embedded.employees))
  }

  getEmployeeById(empId : number):Observable<Employee>{
   const empURL = this.empurl + "/" + empId
  return  this.httpclient.get<Employee>(empURL)
  }

  getalldepartment():Observable<Department[]>{
    return this.httpclient.get<getDepartmentResponse>(this.depurl).pipe(map(response =>response._embedded.departments))
  }

  saveEMployee(employee:Employee):Observable<Employee>{
    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
  return this.httpclient.post<Employee>(this.empurl,employee,httpOptions)
}
 
updateEmployee(employee:Employee):Observable<Employee>{
  const httpOptions = {
    headers: new HttpHeaders({
    'Content-Type' :'application/json',
    'Authorization':'auth-token',
    'Access-Control-Allow-Origin':'*'
  })
}

return this.httpclient.put<Employee>(this.empurl+`/${employee.empno}`,employee,httpOptions)

}

deleteEmployeeById(empId:number):Observable<Employee>{
  const httpOptions = {
    headers: new HttpHeaders({
    'Content-Type' :'application/json',
    'Authorization':'auth-token',
    'Access-Control-Allow-Origin':'*'
  })
}
return  this.httpclient.delete<Employee>(this.empurl+`/${empId}`,httpOptions)
}

getEmployeeByName(ename:String):Observable<Employee[]>{
  const empByNameUrl = "http://localhost:8080/api/emp/search/findByEnameContainsIgnoreCase?ename=" + ename

  
}


getEmployeeByDep(depId:number):Observable<Employee[]>{
 const empBydepurl ="http://localhost:8080/api/emp/search/findBydeptNo?id=" + depId
 return this.httpclient.get<getEmployeeResponse>(empBydepurl).pipe(map(response => response._embedded.employees))

}

}

interface getEmployeeResponse{
  _embedded:{
    employees : Employee[]
  }
}

interface getDepartmentResponse{
  _embedded:{
    departments : Department[]
  }
}
