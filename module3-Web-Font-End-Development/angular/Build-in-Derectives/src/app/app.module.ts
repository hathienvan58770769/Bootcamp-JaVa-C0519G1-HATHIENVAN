import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StructuralComponent } from './components/structural/structural.component';
import { from } from 'rxjs';
import { StructuralNgforComponent } from './components/structural-ngfor/structural-ngfor.component';
import { StructuralNgSwithcaseComponent } from './components/structural-ng-swithcase/structural-ng-swithcase.component';

@NgModule({
  declarations: [
    AppComponent,
    StructuralComponent,
    StructuralNgforComponent,
    StructuralNgSwithcaseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
