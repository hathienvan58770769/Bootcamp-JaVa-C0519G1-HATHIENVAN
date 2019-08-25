import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/models/book.class.model';
import { BooksService } from 'src/app/services/books.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-unread',
  templateUrl: './unread.component.html',
  styleUrls: ['./unread.component.css']
})
export class UnreadComponent implements OnInit {

  public books: Book[];
  public subscription :Subscription;

  constructor(public booksService: BooksService,
              public routerService : Router,
              public routerActivatedService : ActivatedRoute   
    
          ) { }

  ngOnInit() {
    this.viewListUnRead();
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
        this.routerService.navigate(['list-book/unread']);
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
    this.books[i].read = true;
    const data = {
      id : this.books[i].id,
      name : this.books[i].name,
      read: this.books[i].read,
    }
    this.subscription = this.booksService.editBook(data).subscribe(data =>{
      if (this.books[i].read == !this.books[i].read) {
        this.routerService.navigateByUrl('/list-book/read')
      }
    });
  }
}
