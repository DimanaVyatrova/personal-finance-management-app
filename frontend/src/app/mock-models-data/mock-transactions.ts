import { Transaction } from '../models/transaction';

// export const TRANSACTIONS: ({ date: string; amount: number; goal: string; isRecurring: boolean; id: number } | { date: string; amount: number; goal: string; isRecurring: boolean; id: number } | { date: string; amount: number; goal: string; isRecurring: boolean; id: number })[] = [
//   { id: 12, date: '11.01.2001', amount: 15.57, goal: 'Dr. Nice', isRecurring: false },
//   { id: 13, date: '11.01.2001', amount: 15.57, goal: 'Dr. Nice', isRecurring: false },
//   { id: 14, date: '11.01.2001', amount: 15.57, goal: 'Dr. Nice', isRecurring: false }
// ];

export const TRANSACTIONS: Transaction[] = [
  {id: 1, date: '2023-07-21', category: 'Hydrogen', amount: 15, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
  {id: 1, date: '2021-07-21', category: 'Bydrogen', amount: 2.0079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: false, transactionParty: "kaufland"},
  {id: 1, date: '2022-07-21', category: 'Mydrogen', amount: 1.5079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
  {id: 1, date: '2023-06-21', category: 'Mydrogen', amount: 1.5079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
  {id: 1, date: '2023-07-25', category: 'Mydrogen', amount: 1.5079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
  {id: 1, date: '2023-07-21', category: 'Mydrogen', amount: 1.5079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
  {id: 1, date: '2023-07-21', category: 'Mydrogen', amount: 1.5079, notes: 'H', budget: 'Food', goal: 'none', isRecurring: true, transactionParty: "kaufland"},
];
