import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TodoComponent } from './todo/todo.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RegisterFinalComponent } from './register-final/register-final.component';
import { TemplateDrivenFormComponent } from './template-driven-form/template-driven-form.component';


@NgModule({
  declarations: [
    AppComponent,
    TodoComponent,
    LoginComponent,
    RegisterComponent,
    RegisterFinalComponent,
    TemplateDrivenFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }