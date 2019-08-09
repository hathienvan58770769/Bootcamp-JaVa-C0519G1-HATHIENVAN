import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms';

@Component({
  selector: 'app-profile-reactive-form',
  templateUrl: './profile-reactive-form.component.html',
  styleUrls: ['./profile-reactive-form.component.css']
})
export class ProfileReactiveFormComponent implements OnInit {

  profileForm : FormGroup;

  constructor() { }

  ngOnInit() {
    this.profileForm = new FormGroup({
      email: new FormControl('', [ Validators.required, Validators.email]),
      username : new FormControl('', [Validators.required, Validators.minLength(6), this.forbiddenUsername]),
      passwordGroup : new FormGroup({
        password : new FormControl('',[Validators.required,Validators.minLength(6)]),
        confirmPassword : new FormControl('')
      },[ this.comparePassword]),
      check : new FormControl(''),
    });

  }
  get email(): AbstractControl{
    return this.profileForm.controls.email;//or this.profileForm.get('username');
  }

  get username(): AbstractControl{
    return this.profileForm.controls.username;
  }

  get passwordGroup(): AbstractControl{
    return this.profileForm.controls.passwordGroup;
  }
  get password():AbstractControl{
    return this.profileForm.controls.password;
  }
  
  get check(): AbstractControl{
    return this.profileForm.controls.check;
  }

  comparePassword(control : AbstractControl) : any {
    const passwordValue = control.value.password;
    const confirmPasswordValue = control.value.confirmPassword;
    if (passwordValue !== confirmPasswordValue) {
      return {
        passwordNotMath : true
      }
    }
    return null;
  }
  forbiddenUsername(control : AbstractControl) : any{
    const usernameValue = control.value.username;
    if (usernameValue =='codegym') {
      return{
        usernameNotMath : false
      }
    }
    return null;
  }
  onSubmitForm(){
    alert(JSON.stringify(this.profileForm.value));
  }
}
