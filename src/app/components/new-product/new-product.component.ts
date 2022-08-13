import { Component, OnInit } from '@angular/core';
import { EcommerceAppService } from 'src/app/services/ecommerce-app.service';
import { ProductCategory } from 'src/app/product-category';
import { Product } from 'src/app/product';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-new-product',
  templateUrl: './new-product.component.html',
  styleUrls: ['./new-product.component.css']
})
export class NewProductComponent implements OnInit {
  
  editable:boolean= false
  productcat:ProductCategory[]

  products:Product = new Product(0," "," "," ",0," ",0,0,new Date(),new Date(),0)

  constructor(private ecomservice:EcommerceAppService,private route:Router,private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.getAllProductsCategory()
    this.activatedRoute.paramMap.subscribe(()=>{this.getProductById()})
    }

  getAllProductsCategory(){

    this.ecomservice.getAllProductsCategory().subscribe(data => {console.log(data)
    this.productcat = data
    })

  }

  getProductById(){
    const proId = + this.activatedRoute.snapshot.paramMap.get("id")

    if(proId > 0){
      
      this.editable = true
      this.ecomservice.getProductById(proId).subscribe(data => {this.products = data})
    }

  }

  newProduct(){

    if(this.editable){
      this.ecomservice.updateEmployee(this.products).subscribe(()=>{
      this.route.navigateByUrl("/admin")
    })
   console.log( this.products)
  }
else{
    this.ecomservice.saveProduct(this.products).subscribe(()=>{
      this.route.navigateByUrl("/admin")
    })
    console.log(this.products)
  }
}

  
 

}
