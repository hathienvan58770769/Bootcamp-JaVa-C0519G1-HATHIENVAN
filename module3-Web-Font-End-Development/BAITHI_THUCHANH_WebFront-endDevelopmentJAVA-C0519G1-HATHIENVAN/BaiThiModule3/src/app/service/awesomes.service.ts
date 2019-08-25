import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Awesome } from '../model/awesome.class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AwesomesService {
  public API: string = 'http://localhost:3000/awesomes';
  constructor(public http: HttpClient) { }
  getAllAwesome(): Observable<Awesome[]> {
    return this.http.get<Awesome[]>(`${this.API}`);
  }
  getAwesome(id: number): Observable<Awesome> {
    return this.http.get<Awesome>(`${this.API}/${id}`);
  }
  addAwesome(awesome: Awesome): Observable<Awesome> {
    return this.http.post<Awesome>(`${this.API}`, awesome);
  }
  editAwesome(awesome: Awesome): Observable<Awesome> {
    return this.http.put<Awesome>(`${this.API}/${awesome.id}`, awesome)
  }
  deleteAwesome(id: number): Observable<Awesome> {
    return this.http.delete<Awesome>(`${this.API}/${id}`);
  }
}
