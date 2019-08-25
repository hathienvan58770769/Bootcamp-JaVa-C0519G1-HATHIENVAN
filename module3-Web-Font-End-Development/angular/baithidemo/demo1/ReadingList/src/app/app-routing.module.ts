import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ListReadingComponent } from './components/list-reading/list-reading.component';
import { ListAlreadyReadingComponent } from './components/list-already-reading/list-already-reading.component';
import { BookEditComponent } from './components/book-edit/book-edit.component';
import { BookAddComponent } from './components/book-add/book-add.component';
import { ListBookComponent } from './components/list-book/list-book.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'list-book',
    component: ListBookComponent,
    children : [
      {
        path: 'list-reading',
        component : ListReadingComponent
      },
      {
        path: ':id/edit',
        component : BookEditComponent
      },
      {
        path: 'add',
        component : BookAddComponent
      },
      {
        path: 'list-already-reading',
        component: ListAlreadyReadingComponent,
      }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
