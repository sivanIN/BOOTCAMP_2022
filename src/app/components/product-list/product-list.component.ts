import { Component, OnInit } from '@angular/core';
import { EcommerceAppService } from 'src/app/services/ecommerce-app.service';
import { Router } from '@angular/router';
import { Product } from 'src/app/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products : Product[] 

  constructor(private ecomservice:EcommerceAppService,private route:Router) { }

  ngOnInit(): void {
    this. getAllProduct()
  }


  getAllProduct(){
    this.ecomservice.getAllProducts().subscribe(data => {console.log(data)
    this.products = data
    })
  }


  getProductByName(){

  }

  upadetprod(id:number){

    this.route.navigateByUrl("/editproduct/" + id)

  }

  deleteprod(prodId:number){
    if(confirm("Do you want to delete")){
      this.ecomservice.deleteProductById(prodId).subscribe(() => {console.log("delete")
      this. getAllProduct()
    })
    }
  }

}
