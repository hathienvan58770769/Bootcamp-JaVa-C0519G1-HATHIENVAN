import { Component, OnInit, Input, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit , OnDestroy{


  @Input()
  seconds = 15;

  private intervalId = 0;
  message ='';
  remainingTimer:number ;
  
  clearTimer(){
    clearInterval(this.intervalId);
  };

  private countDown(){
    this.clearTimer();
    this.intervalId = window.setInterval(() => 
    {
      this.remainingTimer -= 1;
      if (this.remainingTimer ===0 ) {
        this.message ='Blast off .';
        this.clearTimer();
      }else{
      this.message = `Time -${this.remainingTimer} seconds and counting `;

    }
  },1000);
  }

  start(){
    this.countDown();
    if (this.remainingTimer <= 0) {
      this.remainingTimer = this.seconds;
    } 
  }

  stop(){
    this.clearTimer();
    this.message = `Holding at Time -${this.remainingTimer} seconds`
  }

  reset(){
    this.clearTimer();
    this.remainingTimer = this.seconds;
    this.message = `Click start button to start the Countdown`;
  }

  constructor() { }

  ngOnDestroy(){
      this.clearTimer();
  }
  ngOnInit() {
    this.start();
    this.reset();
    
  }

}
