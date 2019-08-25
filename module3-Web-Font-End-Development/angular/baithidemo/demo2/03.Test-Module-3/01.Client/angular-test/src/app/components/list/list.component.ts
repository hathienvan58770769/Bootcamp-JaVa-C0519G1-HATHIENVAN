import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { ListService } from 'src/app/service/list.service';
import { List } from 'src/app/model/list.model';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  public lists: List[]=[];
  public sub: Subscription;
  public subParam: Subscription;

  constructor(public listService: ListService) { }

  ngOnInit() {
    this.viewList();
  }

  viewList(){
    this.sub = this.listService.getAllLists().subscribe((data: List[])=>{
      return this.lists = data;
    })
  }

  ngOnDestroy(){
    if (this.sub) {
      return this.sub.unsubscribe();
    }
    if (this.subParam) {
      return this.subParam.unsubscribe();
    }
  
  }
}
