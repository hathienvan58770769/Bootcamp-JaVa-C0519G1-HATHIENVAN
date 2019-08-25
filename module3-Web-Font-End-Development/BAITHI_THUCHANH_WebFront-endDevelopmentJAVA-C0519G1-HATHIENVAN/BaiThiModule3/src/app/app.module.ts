import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeAwesomeComponent } from './components/home-awesome/home-awesome.component';
import { AddAwesomeComponent } from './components/add-awesome/add-awesome.component';
import { EditAwesomeComponent } from './components/edit-awesome/edit-awesome.component';
import { ListAwesomeComponent } from './components/list-awesome/list-awesome.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeAwesomeComponent,
    AddAwesomeComponent,
    EditAwesomeComponent,
    ListAwesomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
