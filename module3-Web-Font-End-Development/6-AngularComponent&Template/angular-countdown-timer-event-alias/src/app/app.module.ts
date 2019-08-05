import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountdownTimerEventAliasComponent } from './countdown-timer-event-alias/countdown-timer-event-alias.component';

@NgModule({
  declarations: [
    AppComponent,
    CountdownTimerEventAliasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
