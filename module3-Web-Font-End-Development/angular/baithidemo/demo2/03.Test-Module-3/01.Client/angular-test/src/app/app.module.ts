import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule} from '@angular/forms';
 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './components/list/list.component';
import { ListAddComponent } from './components/list-add/list-add.component';
import { ListEditComponent } from './components/list-edit/list-edit.component';
import { ListAwesomesComponent } from './components/list-awesomes/list-awesomes.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    ListAddComponent,
    ListEditComponent,
    ListAwesomesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
