import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListComponent } from './components/list/list.component';
import { ListAddComponent } from './components/list-add/list-add.component';
import { ListEditComponent } from './components/list-edit/list-edit.component';
import { ListAwesomesComponent } from './components/list-awesomes/list-awesomes.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: 'awesomes',
    pathMatch: 'full',
  },
  {
    path: 'awesomes',
    component: ListAwesomesComponent,
    children: [
      {
        path: 'create',
        component: ListAddComponent,
      },
      {
        path: ':id',
        component: ListEditComponent,
      },
      {
        path: '',
        component: ListComponent,
      },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
