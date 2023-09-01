import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";

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

  getBudget(id : number) : Observable<any> {
    const params = new HttpParams().set('id', id)
    return this.http.get('/api/budgets/1');
  }

  getBudgetByName(name : string) : Observable<any> {
    console.log('request name ' + name);
    return this.http.get('/api/budgets/name/' + name);
  }

  getBugets() : Observable<any> {
    return this.http.get('/api/budgets')
  }

  getBudgetCategories(name : string) : Observable<any>{
    return this.http.get('/api/budgets/categories/' + name);
  }

  getBudgetExpenses(name : string) : Observable<any> {
    return this.http.get('/api/budgets/expenses/' + name);
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

  deleteBudgetByName(name : string) {
    return this.http.delete('/api/budgets/name/' + name);
  }

}
