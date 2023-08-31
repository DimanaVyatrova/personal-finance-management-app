export interface Transaction {
  [key: string]: any;
  id: number;
  date: string;
  category: string | undefined;
  amount: number;
  notes: string | undefined;
  budget: string | undefined;
  goal: string | undefined;
  isRecurring: boolean;
  transactionParty: string;
}
