import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  name:string = "";
  nameList:Array<string> = [];
  add(value:string){
   this.nameList.push(value);
  }
  constructor() { }

  ngOnInit() {
  }
}
