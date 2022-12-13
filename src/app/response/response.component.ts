import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { responsedata } from '../response';
import { ResponseService } from '../response.service';
@Component({
  selector: 'app-response',
  templateUrl: './response.component.html',
  styleUrls: ['./response.component.css']
})
export class ResponseComponent implements OnInit {
  constructor(private myrouter:Router,private rs:ResponseService) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  details:responsedata=new responsedata();
  
  submit(response:any){
    this.details=response.value;
    console.log(response.value);
    console.log(this.details);
    alert("response submitted");
    this.rs.addresponse(this.details).subscribe(
      (data)=>{
        console.log(data);
        console.log("Persisted");
      },
      (error)=>{
         console.log(error)
      }
      )
   }
  }

