import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from '../models/courses.class';

@Injectable()
export class CoursesService {

  public API : string = 'http://localhost:3000/courses';
  constructor(public http : HttpClient) { }
  getAllCourses(): Observable<Course[]>{
    return this.http.get<Course[]>(this.API);
  }
  getCourse(id : number ):Observable<Course>{
    return this.http.get<Course>(`${this.API}/${id}`);
  }
  addCourse(course : Course):Observable<Course>{
    return this.http.post<Course>(this.API, course);
  }
  deleteCourse(id: number):Observable<Course>{
    return this.http.delete<Course>(`${this.API}/${id}`);
  }
  updateCourse(course : Course):Observable<Course>{
    return this.http.put<Course>(`${this.API}/${course.id}`, course);
  }

}
