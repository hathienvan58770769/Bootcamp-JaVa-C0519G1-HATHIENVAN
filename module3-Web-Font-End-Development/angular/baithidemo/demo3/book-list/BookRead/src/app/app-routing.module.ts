import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListBookComponent } from './components/list-book/list-book.component';
import { ReadComponent } from './components/read/read.component';
import { UnreadComponent } from './components/unread/unread.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { HomeComponent } from './components/home/home.component';
import { EditBookComponent } from './components/edit-book/edit-book.component';


const routes: Routes = [
  {
    path : '',
    component : HomeComponent,
  },
  {
    path : 'list-book',
    component : ListBookComponent,
    children : [
      {
        path : 'read',
        component : ReadComponent
      },
      {
        path :'unread',
        component : UnreadComponent
      },
      {
        path : 'add',
        component : AddBookComponent
      },
      {
        path : 'edit/:id',
        component : EditBookComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
