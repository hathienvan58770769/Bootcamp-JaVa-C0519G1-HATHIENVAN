import { Component, OnInit, OnDestroy } from '@angular/core';
import { Awesome } from 'src/app/model/awesome.class';
import { AwesomesService } from 'src/app/service/awesomes.service';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-list-awesome',
  templateUrl: './list-awesome.component.html',
  styleUrls: ['./list-awesome.component.css']
})
export class ListAwesomeComponent implements OnInit, OnDestroy {

  public awesomes: Awesome[];
  public subscription: Subscription;

  constructor(public awesomesService: AwesomesService,
    public routerService: Router
  ) { }

  ngOnInit() {
    this.subscription = this.awesomesService.getAllAwesome().subscribe(data => {
      this.awesomes = data;
    });
  }
  
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
