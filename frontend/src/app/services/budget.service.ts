import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Budget} from "../models/budget";

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
}

@Injectable({
  providedIn: 'root'
})
export class BudgetService {
  currentAmount: number = 0;
  limitAmount: number = 0;
  name: string = '';
  periodEnd: string = '';
  periodStart: string = '';
  reccuringPeriod: string = '';
  userId: number = 1;
  categories : string[] = ['cat1','cat2'];

  constructor(private http: HttpClient) { }

  getBudget(id : number) : Observable<any>
  {
    const params = new HttpParams().set('id', id)
    return this.http.get('/api/budgets/1');
  }

  getBugets() : Observable<any> {
    return this.http.get('/api/budgets')
  }

  addBudget(currentAmount: number, limitAmount: number, name: string, periodEnd: string,
            periodStart: string, reccuringPeriod: string, userId: number, categories : string[]){
    return this.http.post('/api/budgets',{
      currentAmount,
      limitAmount,
      name,
      periodEnd,
      periodStart,
      reccuringPeriod,
      userId,
      categories
    }).subscribe();
  }

}
