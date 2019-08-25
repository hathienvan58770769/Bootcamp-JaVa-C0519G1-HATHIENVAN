import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { Ng2OrderModule } from 'ng2-order-pipe';
import {NgxPaginationModule} from 'ngx-pagination';

import { AppComponent } from './app.component';
import { BooksService } from './services/books.service';
import { ReadComponent } from './components/read/read.component';
import { UnreadComponent } from './components/unread/unread.component';
import { ListBookComponent } from './components/list-book/list-book.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { HomeComponent } from './components/home/home.component';
import { EditBookComponent } from './components/edit-book/edit-book.component';




@NgModule({
  declarations: [
    AppComponent,
    ReadComponent,
    UnreadComponent,
    ListBookComponent,
    AddBookComponent,
    HomeComponent,
    EditBookComponent,

  ],
    imports: [
      BrowserModule,
      AppRoutingModule,
      FormsModule,
      HttpClientModule,
      Ng2SearchPipeModule ,
      Ng2OrderModule,
      NgxPaginationModule
  ],
  providers: [
    BooksService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
