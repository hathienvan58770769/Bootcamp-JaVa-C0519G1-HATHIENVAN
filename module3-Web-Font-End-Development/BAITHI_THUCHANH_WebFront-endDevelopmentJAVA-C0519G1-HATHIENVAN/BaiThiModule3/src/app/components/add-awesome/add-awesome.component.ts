import { Component, OnInit, OnDestroy } from '@angular/core';
import { Awesome } from 'src/app/model/awesome.class';
import { Subscription } from 'rxjs';
import { AwesomesService } from 'src/app/service/awesomes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-awesome',
  templateUrl: './add-awesome.component.html',
  styleUrls: ['./add-awesome.component.css']
})
export class AddAwesomeComponent implements OnInit, OnDestroy {
  public awesome: Awesome;
  public subscription: Subscription;

  constructor(public awesomeService: AwesomesService,
               public routerService: Router
               ) { }

  ngOnInit() {
    this.awesome = new Awesome();
  }

  onCreateAwesome() {
    this.subscription = this.awesomeService.addAwesome(this.awesome).subscribe((data: Awesome) => {
      if (data && data.id) {
        this.routerService.navigate(['awesomes']);
      }
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  
}
