import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  isShow : boolean = true;
  username : string = 'Ha Thien Van';
  isCheck : boolean = false;
  age : number;

  onToggle(){
    this.isShow = !this.isShow;
  }
  onChange(value){
    this.isCheck = value;
  }
  constructor() { }

  ngOnInit() {
  }

}
