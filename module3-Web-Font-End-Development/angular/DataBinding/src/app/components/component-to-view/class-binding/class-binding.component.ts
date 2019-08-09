import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  templateUrl: './class-binding.component.html',
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {
  public isBorder: boolean = true;
  public isChecked: number = 0;// 1 : add class , 0 : remove class
  constructor() { }

  ngOnInit() {
  }

}
