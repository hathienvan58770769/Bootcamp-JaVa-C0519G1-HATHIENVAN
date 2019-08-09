import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EventBindingComponent } from './components/view-to-component/event-binding/event-binding.component';
import { ViewToComponentToViewComponent } from './components/two-way-binding/view-to-component-to-view/view-to-component-to-view.component';
import { AttributeBindingComponent } from './components/component-to-view/attribute-binding/attribute-binding.component';
import { ClassBindingComponent } from './components/component-to-view/class-binding/class-binding.component';
import { PropertyBindingComponent } from './components/component-to-view/property-binding/property-binding.component';
import { StyleBindingComponent } from './components/component-to-view/style-binding/style-binding.component';
import { DataBindingInterpolationComponent } from './components/component-to-view/data-binding-interpolation/data-binding-interpolation.component';

@NgModule({
  declarations: [
    AppComponent,
    EventBindingComponent,
    ViewToComponentToViewComponent,
    AttributeBindingComponent,
    ClassBindingComponent,
    PropertyBindingComponent,
    StyleBindingComponent,
    DataBindingInterpolationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
