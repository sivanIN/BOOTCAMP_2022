import { Component, OnInit } from '@angular/core';
import { EcommerceAppService } from 'src/app/services/ecommerce-app.service';
import { Router } from '@angular/router';
import { Cart } from 'src/app/cart';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  carts:Cart[]
  items:number = 0
  Price:number = 0
  editable:boolean =false
  constructor(private ecomservice:EcommerceAppService,private route:Router) { }

  ngOnInit(): void {
    this.getAllcartproduct()
   
  }

  getAllcartproduct(){

    this.ecomservice.getAllCartProduct().subscribe(data=>{
      this.carts = data
      console.log(this.carts);
      this.items=0
      this.Price=0
      // for (let entry of  this.carts){
      //   this.items += entry.quantity
      //   this.Price += entry.unitprice*entry.quantity 
      // }

   
      
    })
    
   
  }

  
  
  
  

  deleteprod(id:number){

    this.editable =true

    if(confirm("Do you want to delete")){
      this.ecomservice.deleteCartProductById(id).subscribe(() => {console.log("delete")
      this. getAllcartproduct()
    })
    }

  }

}
