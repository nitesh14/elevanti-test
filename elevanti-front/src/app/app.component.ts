import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {AppService} from './app.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Elevanti Order Dashboard';

  orders:Observable<any[]>;

  constructor(private apiService: AppService) {

  }

  ngOnInit() {
   this.orders = this.apiService.getOrders();
  }
}
