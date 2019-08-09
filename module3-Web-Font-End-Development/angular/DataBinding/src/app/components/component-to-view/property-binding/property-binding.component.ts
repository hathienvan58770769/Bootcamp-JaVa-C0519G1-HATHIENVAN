import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  public imageLink : string = 'http://media3.onbox.vn:8088/phimonbox/images/20180707/1527787.jpg';
  public imageWidth:number = 500;

  public name : string = 'HA THIEN VAN';

  public isValid : boolean = true;
  constructor() { }

  ngOnInit() {
  }

}
