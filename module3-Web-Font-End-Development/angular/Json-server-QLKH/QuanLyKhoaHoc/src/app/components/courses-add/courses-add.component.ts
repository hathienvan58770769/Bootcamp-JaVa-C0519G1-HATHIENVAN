import { Component, OnInit, OnDestroy } from '@angular/core';
import { CoursesService } from 'src/app/services/courses.service';
import { Subscription } from 'rxjs';
import { Course } from 'src/app/models/courses.class';
import { Router } from '@angular/router';
@Component({
  selector: 'app-courses-add',
  templateUrl: './courses-add.component.html',
  styleUrls: ['./courses-add.component.css']
})
export class CoursesAddComponent implements OnInit ,OnDestroy{

  public course : Course;
  public subscription : Subscription;
  constructor(
    public coursesService : CoursesService,
    public routerService : Router
    ) { }

  ngOnInit() {
    this.course = new Course();
  }
  ngOnDestroy(){
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  onAddCourse(){
    this.subscription = this.coursesService.addCourse(this.course).subscribe(data => {
      if (data.id && data) {
        this.routerService.navigate(['courses']);
      }
    });

  }
}
