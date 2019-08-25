import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { List } from '../model/list.model';

@Injectable({
  providedIn: 'root'
})
export class ListService {

  public API: string = "http://localhost:3000/awesomes";
  constructor(public http:  HttpClient) { }

  getAllLists(){
    return this.http.get(this.API);
  }

  getOneList(id: number) {
    return this.http.get(`${this.API}/${id}`)
  } 

  createList(list: List){
    return this.http.post(this.API, list);
  }

  updateList(list: List) {
    return this.http.put(`${this.API}/${list.id}`, list)
  }

  deleteList(id: number) {
    return this.http.delete(`${this.API}/${id}`)
  }
  
}
