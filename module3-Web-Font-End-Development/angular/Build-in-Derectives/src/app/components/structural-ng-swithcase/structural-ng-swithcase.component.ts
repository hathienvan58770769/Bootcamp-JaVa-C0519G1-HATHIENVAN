import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-ng-swithcase',
  templateUrl: './structural-ng-swithcase.component.html',
  styleUrls: ['./structural-ng-swithcase.component.css']
})
export class StructuralNgSwithcaseComponent implements OnInit {

  users : Array<any> = [
    {
      name : 'join',
      country : 'USA'
    },
    {
      name : 'joinson',
      country : 'USA'
    },
    {
      name : 'Sam',
      country : 'VietNam'
    },
    {
      name : 'Nira',
      country : 'China'
    },

  ];

  constructor() { }

  ngOnInit() {
  }

}
