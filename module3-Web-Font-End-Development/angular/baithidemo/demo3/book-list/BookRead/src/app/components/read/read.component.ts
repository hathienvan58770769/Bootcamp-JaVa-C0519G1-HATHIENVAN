import { Component, OnInit, OnDestroy } from '@angular/core';

import { ActivatedRoute, Router } from '@angular/router';
import { Book } from 'src/app/models/book.class.model';
import { Subscription } from 'rxjs';
import { BooksService } from 'src/app/services/books.service';

@Component({
  selector: 'app-read',
  templateUrl: './read.component.html',
  styleUrls: ['./read.component.css']
})
export class ReadComponent implements OnInit,OnDestroy {

  public books: Book[];
  public subscription :Subscription;

  constructor(public booksService: BooksService,
              public routerService : Router,
              public routerActivatedService : ActivatedRoute   
    
          ) { }

  ngOnInit() {
    this.viewListUnRead();
  }
  ngOnDestroy(){
   
      if (this.subscription) {
        this.subscription.unsubscribe();
      }

  }
  viewListUnRead(){
    this.subscription = this.booksService.getAllBook().subscribe(data =>{
      this.books = data;
    })
  }
  onDeleteBook(id : number){
    this.subscription = this.booksService.deleteBook(id).subscribe((data : Book) =>
      {
        this.updateDataAfterDelete(id);
        this.routerService.navigate(['list-book/read']);
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
  onChange(i:number){
    this.books[i].read = false;
    const data = {
      id : this.books[i].id,
      name : this.books[i].name,
      read: this.books[i].read,
    }
    this.subscription = this.booksService.editBook(data).subscribe(data =>{
      if (this.books[i].read == !this.books[i].read) {
        this.routerService.navigateByUrl('/list-book/unread');
      }
    });
  }

}
