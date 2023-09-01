import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class GoalService {

  constructor(private http: HttpClient) { }

  getGoal(id : number) : Observable<any>
  {
    const params = new HttpParams().set('id', id)
    return this.http.get('/api/goals/1');
  }

  getGoalByName(name : string) : Observable<any>
  {
    console.log('request name ' + name);
    return this.http.get('/api/goals/name/' + name);
  }

  getGoals() : Observable<any> {
    return this.http.get('/api/goals')
  }

  addGoal(goalType: string | null, currentAmount: number, goalAmount: number, name: string,
          payee: string, userId: number, savingAccountName: string){
    return this.http.post('/api/goals',{
      goalType,
      currentAmount,
      goalAmount,
      name,
      payee,
      userId,
      savingAccountName
    }).subscribe();
  }

  deleteGoalByName(name: string) {
    return this.http.delete('/api/goals/name/' + name);
  }
}
