import { Component, OnInit } from '@angular/core';
import { EmpappserviceService } from 'src/app/services/empappservice.service';
import { Employee } from 'C:/Angular/employee-app/src/app/common/employee';
import { Router, ActivatedRoute } from '@angular/router';
import { Department } from 'src/app/common/department';

@Component({
  selector: 'app-employee-component',
  templateUrl: './employee-component.component.html',
  styleUrls: ['./employee-component.component.css']
})
export class EmployeeComponentComponent implements OnInit {

  searchName:String
  employees : Employee[]
  departments:Department[]
 
  constructor(private empService: EmpappserviceService,private route:Router,private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.getAllEmployees()
    this. getAllDepartments()
    this.activatedRoute.paramMap.subscribe(()=>this.getAllEmployees())
  }

  getAllEmployees(){

  const hasDeptId : boolean = this.activatedRoute.snapshot.paramMap.has("depId")

  if(hasDeptId){

    const depId = +this.activatedRoute.snapshot.paramMap.get("depId")

    this.empService.getEmployeeByDep(depId).subscribe(data => {this.employees =data})

  }else{

  this.empService.getallemployees().subscribe(data =>{ console.log(data)

    this.employees = data
  })
}
  }

  getAllDepartments(){
    this.empService.getalldepartment().subscribe(data =>{ console.log(data)
  
      this.departments = data
    })
    }



  newEmployee(){
  this.route.navigateByUrl("/newEmployee")
  }

  upadetEmp(emId:number){

    this.route.navigateByUrl("/editEmployee/" + emId)

  }

  deleteEmp(emId:number){
    if(confirm("Do you want to delete")){
      this.empService.deleteEmployeeById(emId).subscribe(() => {console.log("delete")
      this.getAllEmployees()
    })
    }
  }

  getEmployeeByName(){

    this.empService.getEmployeeByName(this.searchName).subscribe(data => {this.employees = data})
  }

}
