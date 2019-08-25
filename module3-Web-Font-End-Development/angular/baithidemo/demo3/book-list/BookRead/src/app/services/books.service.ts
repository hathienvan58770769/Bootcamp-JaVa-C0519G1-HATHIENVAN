import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from '../models/book.class.model';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  public books: Book[];
  public API : string ='http://localhost:3000/books';

  constructor(private http : HttpClient) {}
 
  getAllBook(): Observable<Book[]>{
    return this.http.get<Book[]>(`${this.API}`);
  }
  getBook(id: number) : Observable<Book>{
    return this.http.get<Book>(`${this.API}/${id}`);
  }
  addBook(book:Book): Observable<Book>{
    return this.http.post<Book>(`${this.API}`,book);
  }
  editBook(book:Book):Observable<Book>{
    return this.http.put<Book>(`${this.API}/${book.id}`,book)
  }
  deleteBook(id: number): Observable<Book>{
    return this.http.delete<Book>(`${this.API}/${id}`);
  }
}
