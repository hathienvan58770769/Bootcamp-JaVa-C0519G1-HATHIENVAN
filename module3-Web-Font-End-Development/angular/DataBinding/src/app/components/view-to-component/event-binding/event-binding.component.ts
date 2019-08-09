import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  public title : string = 'Event binding';
  public count : number = 0;
  public username : string = "";
  public name : string = "";
  
  onClick(event){
      alert(event.target.innerText);
  }
  onBDClick(event){
    alert(event.target.innerText);
  }
  onInc(){
    this.count++;
  }
  onKeyUp(event){
    this.username = event.target.value;
  }
  onKeyUpEnter(event){
    this.name = event.target.value;
  }
  constructor() { }

  ngOnInit() {
  }

}
