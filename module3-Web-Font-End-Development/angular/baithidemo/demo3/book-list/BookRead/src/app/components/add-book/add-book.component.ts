import { Component, OnInit, OnDestroy } from '@angular/core';
import { Book } from 'src/app/models/book.class.model';
import { Subscription } from 'rxjs';
import { BooksService } from 'src/app/services/books.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit ,OnDestroy{

  public book : Book;
  public subscription : Subscription;
  public read:String='true';
  constructor(
    public bookService : BooksService,
    public routerService : Router
    ) { }

  ngOnInit() {
    this.book = new Book();
  }
  ngOnDestroy(){
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  onAddBook(){
    if(this.read=="true") {
      this.book.read=true;
    } else{
      this.book.read=false;
    }
    this.subscription = this.bookService.addBook(this.book).subscribe(data => {
      if(data.id && data){
      if(data.read==true){
          this.routerService.navigate(['list-book/read']);
      }else{
      this.routerService.navigate(['list-book/unread']);
      }
    }
    });

  }

}
