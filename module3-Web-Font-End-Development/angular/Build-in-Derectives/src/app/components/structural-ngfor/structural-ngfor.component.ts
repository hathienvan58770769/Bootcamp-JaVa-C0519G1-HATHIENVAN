import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-ngfor',
  templateUrl: './structural-ngfor.component.html',
  styleUrls: ['./structural-ngfor.component.css']
})
export class StructuralNgforComponent implements OnInit {
  cityList : Array<string> = ['TP.HCM', 'Ha Noi', 'Da Nang'];

  dataFormsServers : Array<string> = ['TP.HCM', 'Ha Noi', 'Da Nang', 'vung Tau', 'Da Lat'];

  onLoadDataCity(){
    this.cityList = this.dataFormsServers;
  }
  //
  //
  customers : Array<any> = [
    //{ id : '001', name : 'Sam', age : 28, 
    //img : 'https://hinhanhdephd.com/wp-content/uploads/2015/12/bo-hinh-anh-hot-girl-sam-dep-quyen-ru-41.jpg'},
  ];
  dataFormsCustumersServers : Array<any> = [
    { id : '001', name : 'Sam', age : 28, 
    img : 'https://hinhanhdephd.com/wp-content/uploads/2015/12/bo-hinh-anh-hot-girl-sam-dep-quyen-ru-41.jpg'},
    { id : '002', name : 'Nancy', age : 20, 
    img : 'https://img2.thuthuatphanmem.vn/uploads/2019/01/04/hinh-anh-hot-girl-dep_025104603.jpg'},
    { id : '003', name : 'Huong', age : 23, 
    img : 'https://i.pinimg.com/736x/8a/79/07/8a7907a468e4adf8c7797c3869a5a518.jpg'},
    { id : '004', name : 'Nana', age : 30, 
    img : 'https://img2.thuthuatphanmem.vn/uploads/2019/01/04/hinh-anh-hot-girl-dep_025104603.jpg'},
    { id : '005', name : 'Nancy', age : 20, 
    img : 'https://img2.thuthuatphanmem.vn/uploads/2019/01/04/hinh-anh-hot-girl-dep_025104603.jpg'},
    { id : '006', name : 'Nancy', age : 20, 
    img : 'https://img2.thuthuatphanmem.vn/uploads/2019/01/04/hinh-anh-hot-girl-dep_025104603.jpg'}
  ];
  
  onLoadDataCustomers(){
    this.customers = this.dataFormsCustumersServers;
    
  }
  //
  //
  trackByFunction(index, item){
      return item.id;
  }
  constructor() { }

  ngOnInit() {
  }

}
