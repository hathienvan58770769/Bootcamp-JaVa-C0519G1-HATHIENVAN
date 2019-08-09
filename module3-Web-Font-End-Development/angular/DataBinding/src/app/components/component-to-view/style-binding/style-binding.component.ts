import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style-binding',
  templateUrl: './style-binding.component.html',
  styleUrls: ['./style-binding.component.css']
})
export class StyleBindingComponent implements OnInit {
  public isSpecial : boolean = true;
  public isColor: string ='white';
  public isFontSize : number = 25;
  constructor() { }

  ngOnInit() {
  }

}
