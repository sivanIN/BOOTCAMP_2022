import { Component, OnInit } from '@angular/core';
import { EmpappserviceService } from 'src/app/services/empappservice.service';
import { Department } from 'src/app/common/department';
import { Employee } from 'src/app/common/employee';
import { Route, Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-newemployee',
  templateUrl: './newemployee.component.html',
  styleUrls: ['./newemployee.component.css']
})
export class NewemployeeComponent implements OnInit {
  editable:boolean = false
  departments:Department[]
  employees :Employee = new Employee (0," "," ",new Date(),0,0,0,0)
  constructor(private empService: EmpappserviceService ,private route:Router,private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.getAllDepartments()
    this.activatedRoute.paramMap.subscribe(()=>{this.getEmployeeById()})
    
  }

  getEmployeeById(){
    const empId = + this.activatedRoute.snapshot.paramMap.get("id")

    if(empId > 0){
      this.editable = true
      this.empService.getEmployeeById(empId).subscribe(data => {this.employees = data})
    }

  }

  getAllDepartments(){
    this.empService.getalldepartment().subscribe(data =>{ console.log(data)
  
      this.departments = data
    })
    }

  newEmployee(){
    
    if(this.editable){
      this.empService.updateEmployee(this.employees).subscribe(()=>{
      this.route.navigateByUrl("/employee")
    })
   console.log( this.employees)
  }
  else{
    this.empService.saveEMployee(this.employees).subscribe(()=>{
      this.route.navigateByUrl("/employee")
    })
   console.log( this.employees)
  }
}






}
