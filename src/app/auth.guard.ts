import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { EcommerceAppService } from './services/ecommerce-app.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

constructor(private ecomservice:EcommerceAppService,private route:Router){

}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      // return this.ecomservice.getLoggedStatus()

      if(sessionStorage.getItem('loggedIn') == 'true'){
        return true
      }else{
        
        return false
      }
  }
  
}
