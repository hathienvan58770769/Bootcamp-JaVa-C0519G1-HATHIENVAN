import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';

export class User{
  username : string;
  password : string;
  fullname : string;
  email : string;
  phonenumber : number;

}
@Component({
  selector: 'app-template-forms',
  templateUrl: './template-forms.component.html',
  styleUrls: ['./template-forms.component.css']
})
export class TemplateFormsComponent implements OnInit {
  user : User = new User();

  onSubmitForm(formUser : NgForm){
    if (formUser.valid) {
       console.log(this.user);
    }
  }

  onResetForm(formUser : NgForm){
    formUser.reset();
  }
  constructor() { }

  ngOnInit() {
  }

}
