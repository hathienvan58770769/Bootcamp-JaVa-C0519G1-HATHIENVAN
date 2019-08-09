import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-view-to-component-to-view',
  templateUrl: './view-to-component-to-view.component.html',
  styleUrls: ['./view-to-component-to-view.component.css']
})
export class ViewToComponentToViewComponent implements OnInit {

  public title : string = "Two Way Binding";
  public name : string ='';
  public gender : number = 0;//0 : Female , 1: Male
  constructor() { }

  ngOnInit() {
  }

}
