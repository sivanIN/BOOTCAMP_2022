import { Component, OnInit } from '@angular/core';
import { EcommerceAppService } from 'src/app/services/ecommerce-app.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  // loggedIn:boolean=false
 

  constructor(private ecomservice:EcommerceAppService,private route:Router) { }

  ngOnInit(): void {
  }


  loginSubmit2(loginForm:any){
    if(loginForm.email == "HR" && loginForm.password == "HR" ){
      // this.ecomservice.setUserLoggedIn()
      
      sessionStorage.setItem('loggedIn','true')
      // console.log(sessionStorage.getItem('loggedIn'))
     
      this.route.navigate(["/"])

    }else{
      alert("Password is wrong")
    }


  }

}
