import { Component, OnInit, OnDestroy } from '@angular/core';
import { Book } from 'src/app/models/book.class.model';
import { Subscription } from 'rxjs';
import { BooksService } from 'src/app/services/books.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit , OnDestroy{
  public name : string;
  public books: Book[];
  public subscription :Subscription;

  constructor(public booksService: BooksService,
              public routerService : Router,
              public routerActivatedService : ActivatedRoute   
    
          ) { }

  ngOnInit() {
    this.subscription = this.booksService.getAllBook().subscribe(data =>{
      this.books = data;
    });
  }
  ngOnDestroy(){
   
      if (this.subscription) {
        this.subscription.unsubscribe();
      }

  }
 
  onDeleteBook(id : number){
    this.subscription = this.booksService.deleteBook(id).subscribe((data : Book) =>
      {
        this.updateDataAfterDelete(id);
        this.routerService.navigate(['list-book']);
      });

  }
  key: string[] = ['name' , 'read' , 'id']; //set default
  reverse: boolean = false;
  sort(key){
    this.key = key;
    this.reverse = !this.reverse;
  }
  
  
  //initializing p to one
  p: number = 1;
  //
  updateDataAfterDelete(id : number){
    for (var i = 0; i < this.books.length; i++) {
      if(this.books[i].id == id){
        this.books.splice(i, 1);
        break;
      }
      
    }
  }
  onChangeRead(i:number){
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
  onChangeUnRead(i:number){
    this.books[i].read = true;
    const data = {
      id : this.books[i].id,
      name : this.books[i].name,
      read: this.books[i].read,
    }
    this.subscription = this.booksService.editBook(data).subscribe(data =>{
      if (this.books[i].read == !this.books[i].read) {
        this.routerService.navigateByUrl('/list-book/read');
      }
    });
  }


}
