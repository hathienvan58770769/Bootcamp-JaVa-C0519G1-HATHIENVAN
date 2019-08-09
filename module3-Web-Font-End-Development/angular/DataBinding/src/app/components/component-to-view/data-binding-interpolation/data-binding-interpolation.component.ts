import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding-interpolation',
  templateUrl: './data-binding-interpolation.component.html',
  styleUrls: ['./data-binding-interpolation.component.css']
})
export class DataBindingInterpolationComponent implements OnInit {
  public name:string = 'ha thien van';
  public age:number = 20;
  public isMarried : boolean = false;
  public user: object = {
    name : 'thien van',
    age : 21,
    isMarried : true
  }

  showInfo(){
    return `${this.user['name']}`;
  }

  public imageLink : string = 'http://media3.onbox.vn:8088/phimonbox/images/20180707/1527787.jpg';

  public link: string = 'https://tv.zing.vn/';
  public textLink :string ='Go to Zing TV';
  
  constructor() { }

  ngOnInit() {
  }

}
