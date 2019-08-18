import { Injectable } from '@angular/core';
import { Movie } from '../models/movie.class';
@Injectable({
  providedIn: 'root'
})
export class MovieService {
  movies : Movie[]=[
    new Movie(1,'Conan','https://www.youtube.com/watch?v=_nt71MoDKH0','Aoyama Gōshō'),
    new Movie(2,'Conan','https://www.youtube.com/watch?v=_nt71MoDKH0','Aoyama Gōshō'),
    new Movie(3,'Conan','https://www.youtube.com/watch?v=_nt71MoDKH0','Aoyama Gōshō'),
  ];

  getAllMovie(){
    return this.movies;
  }
  addMovie(movie : Movie){
    movie.id = this.getLastId(this.movies);
    this.movies.push(movie);
  }
  getLastId(movies){
    let lastId =movies.length>0 ? movies.sort((a,b) => {
      if (a.id > b.id) {
        return -1;
      }else if(a.id < b.id){
        return 1;
      }else{
        return 0;
      }
    })[0].id + 1 : 1;
    return lastId;

  }
  constructor() { }
}
