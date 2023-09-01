export interface Budget  {
  currentAmount : number;
  limitAmount : number;
  name : string;
  periodStart : string;
  periodEnd : string;
  reccuringPeriod : string;
  userId : number;
  categories : string[];
}
