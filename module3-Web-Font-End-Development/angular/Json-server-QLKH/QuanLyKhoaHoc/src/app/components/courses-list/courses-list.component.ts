import { Component, OnInit, OnDestroy } from '@angular/core';
import { CoursesService } from 'src/app/services/courses.service';
import { Subscription } from 'rxjs';
import { Course } from 'src/app/models/courses.class';

@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit, OnDestroy{
  
  public courses : Course[]=[];
  public subscription : Subscription;
  constructor(public coursesService : CoursesService) { }

  ngOnInit() {
    this.subscription = this.coursesService.getAllCourses().subscribe(data =>
      {
        this.courses = data;
      });
  }
  onDeleteCourse(id : number){
    this.subscription = this.coursesService.deleteCourse(id).subscribe((data : Course) =>
      {
        this.updateDataAfterDelete(id);
      });

  }
  updateDataAfterDelete(id : number){
    for (var i = 0; i < this.courses.length; i++) {
      if(this.courses[i].id == id){
        this.courses.splice(i, 1);
        break;
      }
      
    }
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
