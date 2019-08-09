import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-binding',
  templateUrl: './attribute-binding.component.html',
  styleUrls: ['./attribute-binding.component.css']
})
export class AttributeBindingComponent implements OnInit {
  public tableWidth:number = 500;
  public tableBorder:number = 1;// 0 or 1
  constructor() { }

  ngOnInit() {
  }

}
