import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Product } from '../product';
import { Observable,map } from 'rxjs';
import { ProductCategory } from '../product-category';
import { Cart } from '../cart';

@Injectable({
  providedIn: 'root'
})
export class EcommerceAppService {
  
  produrl= "http://localhost:8080/api/prod"
  prodcaturl= "http://localhost:8080/api/prodcat"
  carturl= "http://localhost:8080/api/cart"

  isUserLoggedIn = false

  constructor(private httpclient:HttpClient) { }


getLoggedStatus(){

  return this.isUserLoggedIn

}

  setUserLoggedIn(){
    this.isUserLoggedIn =true
  }

  setUserLoggedOut(){
    this.isUserLoggedIn = false
  }


 

  getAllProducts():Observable<Product[]>{
    return this.httpclient
    .get<getProductResponse>(this.produrl)
    .pipe(map(response => response._embedded.products))
  }

  getProductById(id:number):Observable<Product>{
    const prodURL= this.produrl + "/" +  id
    return this.httpclient
    .get<Product>(prodURL)
  }


  getAllProductsCategory():Observable<ProductCategory[]>{
    return this.httpclient
    .get<getProductCategoryResponse>(this.prodcaturl)
    .pipe(map(response => response._embedded.productCategories))
  }

  saveProduct(products:Product):Observable<Product>{

    console.log(products)

    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
 return this.httpclient.post<Product>(this.produrl,products,httpOptions)

  }



  saveToCart(carts:Cart):Observable<Cart>{

    console.log(carts)

    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
   return this.httpclient.post<Cart>(this.carturl,carts,httpOptions)

 }


  getAllCartProduct():Observable<Cart[]>{
    return this.httpclient.get<getCartResponse>(this.carturl).pipe(map(response => response._embedded.carts))
  }

  updateEmployee(product:Product):Observable<Product>{
    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
  
  return this.httpclient.put<Product>(this.produrl+`/${product.id}`,product,httpOptions)
  
  }


  deleteProductById(id:number):Observable<Product>{
    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
  return  this.httpclient.delete<Product>(this.produrl+`/${id}`,httpOptions)
  }

  deleteCartProductById(id:number):Observable<Cart>{
    const httpOptions = {
      headers: new HttpHeaders({
      'Content-Type' :'application/json',
      'Authorization':'auth-token',
      'Access-Control-Allow-Origin':'*'
    })
  }
  return this.httpclient.delete<Cart>(this.carturl + `/${id}`,httpOptions)
  }
  
 

  getProductByName(name:String):Observable<Product[]>{

    const prodByNameUrl = "http://localhost:8080/api/prod/search/findByNameContainsIgnoreCase?name=" + name

    return this.httpclient.get<getProductResponse>(prodByNameUrl).pipe(map(response => response._embedded.products))

  }

}

interface getProductResponse{
  _embedded:{
    products : Product[]
  }
}
interface getProductCategoryResponse{
  _embedded:{
    productCategories : ProductCategory[]
  }
}

interface getCartResponse{
  _embedded:{
    carts : Cart[]
  }
}

