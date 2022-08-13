import {Product} from './product'


export class Cart {

    constructor(

      // public id : number,
      // public name : String,
      // public description : String,
      // public unitprice : number,
      // public quantity : number,
      // public imageurl : String,
      // public productid : number,
      public cartitems:CartItem[]


    ){}
}


export class CartItem {

  constructor(

    public product : Product,
    
    public quantity : number,
    


  ){}
}
