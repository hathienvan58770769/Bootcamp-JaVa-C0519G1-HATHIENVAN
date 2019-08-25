import { Component, OnInit, OnDestroy } from '@angular/core';
import { Book } from 'src/app/models/book.class';
import { Subscription } from 'rxjs';
import { BookService } from 'src/app/services/book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-reading',
  templateUrl: './list-reading.component.html',
  styleUrls: ['./list-reading.component.css']
})
export class ListReadingComponent implements OnInit, OnDestroy {
  public read : String;
  public book : Book;
  public books : Book[] =[];
  public subscription : Subscription;
  
  constructor(public bookService : BookService,
    public routerServive : Router) { }
  ngOnInit() {
    this.subscription = this.bookService.getAllBook().subscribe(data =>
      {
        this.books = data;
      });
  }
  onDeleteBook(id : number){
    this.subscription = this.bookService.deleteBook(id).subscribe((data : Book) =>
      {
        this.updateDataAfterDelete(id);
        this.routerServive.navigate(['list-book/list-reading']);
      });

  }
  updateDataAfterDelete(id : number){
    for (var i = 0; i < this.books.length; i++) {
      if(this.books[i].id == id){
        this.books.splice(i, 1);
        break;
      }
      
    }
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }



}
