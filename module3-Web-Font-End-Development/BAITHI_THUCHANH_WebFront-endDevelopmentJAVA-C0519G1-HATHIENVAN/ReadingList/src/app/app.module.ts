import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule} from '@angular/forms';
 import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { ListAlreadyReadingComponent } from './components/list-already-reading/list-already-reading.component';
import { ListReadingComponent } from './components/list-reading/list-reading.component';

import { BookService } from './services/book.service';
import { HomeComponent } from './components/home/home.component';
import { BookEditComponent } from './components/book-edit/book-edit.component';
import { BookAddComponent } from './components/book-add/book-add.component';
import { ListBookComponent } from './components/list-book/list-book.component';

@NgModule({
  declarations: [
    AppComponent,
    ListAlreadyReadingComponent,
    ListReadingComponent,
    HomeComponent,
    BookEditComponent,
    BookAddComponent,
    ListBookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [
    BookService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
