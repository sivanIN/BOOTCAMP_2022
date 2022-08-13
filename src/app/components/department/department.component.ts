import { Component, OnInit } from '@angular/core';

import { Department } from 'src/app/common/department';
import { EmpappserviceService } from 'src/app/services/empappservice.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  departments:Department[]

  constructor(private empService: EmpappserviceService) { }

  ngOnInit(): void {
    this.getAllDepartments()
  }

  getAllDepartments(){
    this.empService.getalldepartment().subscribe(data =>{ console.log(data)
  
      this.departments = data
    })
    }

}
