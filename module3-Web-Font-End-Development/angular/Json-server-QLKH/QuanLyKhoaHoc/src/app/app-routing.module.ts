import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { CoursesComponent } from './components/courses/courses.component';
import { CoursesListComponent } from './components/courses-list/courses-list.component';
import { CoursesEditComponent } from './components/courses-edit/courses-edit.component';
import { CoursesAddComponent } from './components/courses-add/courses-add.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'courses',
    component: CoursesComponent,
    children : [
      {
        path: '',
        component : CoursesListComponent
      },
      {
        path: ':id/edit',
        component : CoursesEditComponent
      },
      {
        path: 'add',
        component : CoursesAddComponent
      }
    ]
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
