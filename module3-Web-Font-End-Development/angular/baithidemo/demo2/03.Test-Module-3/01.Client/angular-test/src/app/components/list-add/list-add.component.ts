import { Component, OnInit } from '@angular/core';
import { List } from 'src/app/model/list.model';
import { Subscription } from 'rxjs';
import { ListService } from 'src/app/service/list.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-add',
  templateUrl: './list-add.component.html',
  styleUrls: ['./list-add.component.css']
})
export class ListAddComponent implements OnInit {
  public oneList: List;
  public sub: Subscription
  constructor(
    public listService: ListService,
    public routerService: Router) { }

  ngOnInit() {
    this.oneList = new List();
  }

  onCreateList() {
    
    this.sub = this.listService.createList(this.oneList).subscribe((data:List) => {
      if (data && data.id){
        this.routerService.navigate(['awesomes']);
      }
    })
  }

  ngOnDestroy(){
    if(this.sub){
      this.sub.unsubscribe();
    }
  }

}
