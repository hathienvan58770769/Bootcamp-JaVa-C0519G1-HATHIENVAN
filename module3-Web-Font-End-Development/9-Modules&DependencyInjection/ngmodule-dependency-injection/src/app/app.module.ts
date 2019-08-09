import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ImageGalleryModule } from './image-gallery/image-gallery.module';
import { GalleryConfig } from './image-gallery/token';
import { ImgSliderComponent } from './img-slider/img-slider.component';
import { ImgSlideComponent } from './img-slider/img-slide/img-slide.component';
import { ContentProjectionComponent } from './content-projection/content-projection.component';
import { ContentChildComponent } from './content-child/content-child.component';

@NgModule({
  declarations: [
      AppComponent,
      ImgSliderComponent,
      ImgSlideComponent,
      ContentProjectionComponent,
      ContentChildComponent
  ],
  imports: [
      BrowserModule,
      ImageGalleryModule,
  ],
  providers: [
      {provide: GalleryConfig, useValue: 2}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }