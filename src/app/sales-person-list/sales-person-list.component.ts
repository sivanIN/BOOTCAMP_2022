import { Component, OnInit } from '@angular/core';
import { SalesPerson } from '../sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {
 name:String = "sivan"

 s1: SalesPerson = new SalesPerson("Sivan","ayyan","sivan@gmail.com",2500,123)


 salePersonList:SalesPerson[]  =[this.s1,
                         new SalesPerson("Ram","Jay","ram@gmail.com",3500,789),
                         new SalesPerson("Ravi","Roy","ravi@gmail.com",4500,234),
                         new SalesPerson("Rahul","r","rahul@gmail.com",7500,7678),
]

salesPersonModel:SalesPerson = new SalesPerson(" "," "," ", 0,0 )

  constructor() { }

  ngOnInit(): void {

    

  }

  onSubmit(){
    this.salePersonList.push(this.salesPersonModel)
  }

}
