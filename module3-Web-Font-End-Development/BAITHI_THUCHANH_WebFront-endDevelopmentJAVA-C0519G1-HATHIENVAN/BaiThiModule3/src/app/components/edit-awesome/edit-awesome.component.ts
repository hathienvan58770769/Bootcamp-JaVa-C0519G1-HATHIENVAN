import { Component, OnInit, OnDestroy } from '@angular/core';
import { Awesome } from 'src/app/model/awesome.class';
import { Subscription } from 'rxjs';
import { AwesomesService } from 'src/app/service/awesomes.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-awesome',
  templateUrl: './edit-awesome.component.html',
  styleUrls: ['./edit-awesome.component.css']
})
export class EditAwesomeComponent implements OnInit, OnDestroy {
  public awesome: Awesome;
  public awesomes: Awesome[] = [];
  public subscription: Subscription;
  public subscriptionParam: Subscription

  constructor(public awesomesService: AwesomesService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
    ) { }

  ngOnInit() {
    this.awesome = new Awesome();
    this.loadData();
  }

  loadData() {
    this.subscriptionParam = this.activatedRouteService.params.subscribe(data => {
      let id = data.id;
      this.subscription = this.awesomesService.getAwesome(id).subscribe(datas => {
        this.awesome = datas;
      });
    });
  }

  onUpdateAwesome() {
    this.subscription = this.awesomesService.editAwesome(this.awesome).subscribe(data => {
      this.routerService.navigate(['awesomes']);
    });
  }

  onDeleteAwesome(id: number) {
    this.subscription = this.awesomesService.deleteAwesome(id).subscribe((data: Awesome) => {
      this.updateDataAfterDelete(id);
      this.routerService.navigate(['awesomes']);
    });
  }

  updateDataAfterDelete(id: number) {
    for (var i = 0; i < this.awesomes.length; i++) {
      if (this.awesomes[i].id == id) {
        this.awesomes.splice(i, 1);
        break;
      }
    }
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParam) {
      this.subscriptionParam.unsubscribe();
    }
  }

}
