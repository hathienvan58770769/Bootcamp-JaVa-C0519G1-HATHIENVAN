import { Component, OnInit } from '@angular/core';
import { List } from 'src/app/model/list.model';
import { Subscription } from 'rxjs';
import { ListService } from 'src/app/service/list.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-edit',
  templateUrl: './list-edit.component.html',
  styleUrls: ['./list-edit.component.css']
})
export class ListEditComponent implements OnInit {
  public list: any;
  
  public lists: List[]=[];
  public sub: Subscription
  public subParam: Subscription
  constructor(
    public listService: ListService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) { }

  ngOnInit() {
    this.list = new List();
    this.loadData();
  }

  loadData() {
    this.subParam = this.activatedRouteService.params.subscribe(data => {
      let id = data.id;
      this.sub = this.listService.getOneList(id).subscribe(data1 => {
        this.list = data1;
      })
    })
  }
  onUpdateList() {
    this.sub = this.listService.updateList(this.list).subscribe(data=>{
      this.routerService.navigate(['awesomes']);
    })
  }

  onDeleteList(id: number) {
    this.sub = this.listService.deleteList(id).subscribe((data: List) => {
      this.updateDataAfterDelete(id);
      this.routerService.navigate(['awesomes']);
    })
  }
  
  updateDataAfterDelete(idList: number) {
    for (var i = 0; i < this.lists.length; i++) {
      if (this.list[i].id == idList) {
        this.lists.splice(i,1);
        break;
      }
    }
  } 

  ngOnDestroy() {
    if (this.sub) {
      this.sub.unsubscribe();
    }
    if (this.subParam) {
      this.subParam.unsubscribe();
    }
  }
}
