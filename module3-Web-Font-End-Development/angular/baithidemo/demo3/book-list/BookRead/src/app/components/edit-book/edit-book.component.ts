import { Component, OnInit, OnDestroy } from '@angular/core';
import { Book } from 'src/app/models/book.class.model';
import { Subscription } from 'rxjs';
import { BooksService } from 'src/app/services/books.service';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit , OnDestroy{

  public book : Book;
  public read : String = 'true';
  public subscription : Subscription;
  public subscriptionParams : Subscription;

  constructor(
    public bookService : BooksService,
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
      this.subscription = this.bookService.editBook(this.book).subscribe((data : Book) => {
          if (data.read == true) {
            this.routerService.navigateByUrl('list-book/read');
          } else {
            this.routerService.navigateByUrl('list-book/unread');
          }
    });
  }    

}
