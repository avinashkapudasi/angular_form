import { Injectable } from '@angular/core';
import { responsedata } from './response';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ResponseService {

  constructor(private myhttp:HttpClient) { }
  restUrl:string="http://localhost:8989";
  
  addresponse(add:responsedata){
    return this.myhttp.post(this.restUrl+"/register",add)
  }
}
