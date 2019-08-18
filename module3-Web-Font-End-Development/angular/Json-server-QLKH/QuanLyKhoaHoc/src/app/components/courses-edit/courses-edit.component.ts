import { Component, OnInit, OnDestroy } from '@angular/core';
import { CoursesService } from 'src/app/services/courses.service';
import { Subscription } from 'rxjs';
import { Course } from 'src/app/models/courses.class';
import { Router , ActivatedRoute, Params} from '@angular/router';
@Component({
  selector: 'app-courses-edit',
  templateUrl: './courses-edit.component.html',
  styleUrls: ['./courses-edit.component.css']
})
export class CoursesEditComponent implements OnInit ,OnDestroy{

  public course : Course;
  public subscription : Subscription;
  public subscriptionParams : Subscription;
  constructor(
    public coursesService : CoursesService,
    public routerService : Router,
    public activatedRouteService: ActivatedRoute
    ) { }
  ngOnInit() {
    this.course = new Course();
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
    let id = data['id'];
    this.subscription = this.coursesService.getCourse(id).subscribe((course : Course) =>{
      this.course = course;

    });
    })
  }
  onUpdateCourse(){
    this.subscription = this.coursesService.updateCourse(this.course).subscribe((data : Course) => {
      this.routerService.navigateByUrl('courses');
      });

  }
}


