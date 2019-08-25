import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeAwesomeComponent } from './components/home-awesome/home-awesome.component';
import { AddAwesomeComponent } from './components/add-awesome/add-awesome.component';
import { EditAwesomeComponent } from './components/edit-awesome/edit-awesome.component';
import { AppComponent } from './app.component';
import { ListAwesomeComponent } from './components/list-awesome/list-awesome.component';


const routes: Routes = [
  {
    path : '',
    redirectTo: 'awesomes',
    pathMatch: 'full'
  },
  {
    path : 'awesomes',
    component : HomeAwesomeComponent,
    children : [
      {
        path : '',
        component : ListAwesomeComponent,
      },
      {
        path : 'create',
        component : AddAwesomeComponent,
      },
      {
        path : ':id',
        component : EditAwesomeComponent,
      },


    ],
    
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
