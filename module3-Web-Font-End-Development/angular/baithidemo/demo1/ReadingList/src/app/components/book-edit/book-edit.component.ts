import { Component, OnInit, OnDestroy } from '@angular/core';
import { Book } from 'src/app/models/book.class';
import { Subscription } from 'rxjs';
import { BookService } from 'src/app/services/book.service';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-book-edit',
  templateUrl: './book-edit.component.html',
  styleUrls: ['./book-edit.component.css']
})
export class BookEditComponent implements OnInit ,OnDestroy{

  public book : Book;
  public read : String;
  public subscription : Subscription;
  public subscriptionParams : Subscription;

  constructor(
    public bookService : BookService,
    public routerService : Router,
    public activatedRouteService: ActivatedRoute
    ) { 

    }

  ngOnInit() {
    this.book = new Book();
    this.loadData();
  }

  ngOnDestroy(){
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }
  }

  loadData(){
    this.subscriptionParams =  this.activatedRouteService.params.subscribe((data: Params) => {
      let id = data.id;
      this.subscription = this.bookService.getBook(id).subscribe((book : Book) =>{
        this.book = book;
      });
    });
  }

  onUpdateBook(){
    if(this.read =="true") {
      this.book.read=true;
    } else{
      this.book.read=false;
    }
      this.subscription = this.bookService.updateBook(this.book).subscribe((data : Book) => {
          if (data.read == true) {
            this.routerService.navigateByUrl('list-book/list-reading');
          } else {
            this.routerService.navigateByUrl('list-book/list-already-reading');
          }
    });
  }    
}