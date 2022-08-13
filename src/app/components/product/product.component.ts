import { Component, OnInit, ViewChild } from '@angular/core';
import { EcommerceAppService } from 'src/app/services/ecommerce-app.service';
import { Product } from 'src/app/product';
import { Router } from '@angular/router';
import { Cart, CartItem } from 'src/app/cart';



@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  searchName:String
  quantity : number


 
  product:Product
  products : Product[] 
  cartItemList: CartItem[] =[]

  carts:Cart = new Cart(this.cartItemList)
  singlecartitem:CartItem= new CartItem(new Product(0,"","","",0,"",0,0,new Date(),new Date(),0),0)

  constructor(private ecomservice:EcommerceAppService,private route:Router) { }


  ngOnInit(): void {
   
    this.getAllProduct()

  }

  getAllProduct(){
    this.ecomservice.getAllProducts().subscribe(data => {console.log(data)
    this.products = data
    })
  }

  // open(id:number){
  //   this.route.navigateByUrl("/modal/" + id)
  // }


  open(id:number){
     
     if(id > 0){
       this.ecomservice.getProductById(id).subscribe(data => {this.product = data
       
       console.log(data)
       })
     }
   }

  //  addCart(id:number){

  //   this.route.navigateByUrl("/cart/" + id )
   
  //  }

  // public id : number,
  //     public name : String,
  //     public description : String,
  //     public unitprice : number,
  //     public quantity : number,
  //     public imageurl : String,
  //     public productid : number,


  // public id : number,
  // public sku : String,
  // public name : String,
  // public description : String,
  // public unitprice : number,
  // public imageurl : String,

   productToCart(id:number){
     console.log(id)
     this.singlecartitem.product = this.product
     this.singlecartitem.quantity = this.quantity

     this.cartItemList.push(this.singlecartitem)
     
     console.log(this.product)
     console.log(this.singlecartitem)
     console.log(this.cartItemList)

     this.ecomservice.saveToCart(this.carts).subscribe(()=>{
      alert("add to cart ")
    })
    
   }


   getProductByName(){
     console.log(this.searchName)
    this.ecomservice.getProductByName(this.searchName).subscribe(data => {this.products = data})
   }


   logout(){
    alert("logedout")
    this.ecomservice.setUserLoggedOut()
    this.route.navigateByUrl("/")
  }


}
