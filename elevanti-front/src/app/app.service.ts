import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})

export class AppService {
    constructor(private http: HttpClient) { }

    getOrders(): Observable<any> {
        return this.http.get('http://localhost:8080/api/orders');
    }
}