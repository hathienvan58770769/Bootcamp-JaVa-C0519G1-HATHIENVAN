import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TimelinesComponent } from './timelines/timelines.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { DictionaryComponent } from './dictionary/dictionary.component';
import { HomeComponent } from './home/home.component';
import { LoginStep1Component } from './login-step1/login-step1.component';
import { LoginStep2Component } from './login-step2/login-step2.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { DictionaryService } from './dictionary.service';
import { BlogListComponent } from './blog/blog-list/blog-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TimelinesComponent,
    DictionaryDetailComponent,
    DictionaryPageComponent,
    DictionaryComponent,
    HomeComponent,
    LoginStep1Component,
    LoginStep2Component,
    YoutubePlayerComponent,
    YoutubePlaylistComponent,
    BlogListComponent
  ],
  imports: [BrowserModule, ReactiveFormsModule, AppRoutingModule],
  providers: [DictionaryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
