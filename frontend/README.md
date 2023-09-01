# Personal Finance Management App :money_with_wings: :moneybag:

## Functionality Overview

 The purpose of this app is to help users organize and track their finances.
 <li>Users can create 
 checking accounts which can have subaccounts for savings and investments (savings account and investment accounts).</li>
 <br>
  <li>Users can create budgets. Budgets help users with tracking their expenses. Each budget is connected to one or more
 categories. Transactions which are assigned one of these categories count for that budget.
<br><br>
<i>For example: We can have a budget 'Food' of 500 which has two categories assigned to it - 'eating out' and 'grocery'. Now, if a transaction
is made with one of the categories, it will count as an expense for that budget.</i>
<br> <br>
 Once a user exceeds the limit of the budget (for example spends more than 500 on food), a
warning message will appear.
<br><br>
 Each budget has a period for which it is valid. The different types of periods are
`ANNUALY` ,`WEEKLY`, `MONTHLY` and `QUARTERLY`.<br><br>
</li>
<li>Users can create financial goals. There are two types of goals - PAY goals and SAVE goals.
Pay goals are goals which are related to expenses. Save goals are goals related to saving money.
SAVE Goals are connected to a savings account. Pay Goals have a <i>Payee</i> which is the <i>Transaction party</i>
 to which money need to be payed.
<br> <br>
<i>Example Save Goals: Save fo Vacation, Save for a Car<br>
Example Pay Goals: Pay Off Mortgage, Pay Off Student Debt</i>
<br>
</li>

### Process :art:
We started the development process by clarifying requirements and
agreeing on what exactly we would like to do. For this reason we created a
 Figma prototype which can be accessed here: https://www.figma.com/file/eUwnlHScmyWDTzZVTKYfbJ/finance-management?type=design&node-id=0-1&mode=design&t=O4J1brXscoVgtDa4-0
<br>
We went through many iterations until the requirements were clarified. The prototype 
illustrates only the **functionalities** (UX design) of the app not its ** visual design** (UI design).

## Implementation :factory:
 The project is divided in two folders - frontend and backend.
The backend is implemented using Java and Spring Boot. For the frontend we have used Angular.

### Backend
The backend is organized using layered architecture. 
<li>Presentation Layer - REST Controllers for handling HTTP requests</li>
<li>Service Layer - Contains the business logic</li>
<li>Persistence Layer - Communication with the database using JPA Repository
interfaces</li>
<br>
The backend consists of the following packages:
<li>controller - contains REST controllers implementing CRUD operations
based on GET, POST, PUT and DELETE HTTP methods.</li>
<li>dto - defines object to which JSON strings will be matched </li>
<li>mapper - convert DTOs to Entity and the other may around</li>
<li>model - contains entities, implements database model</li>
<li>repository - JPA Repository interfaces for communicating with the database</li>
<li>service</li>

### FrontEnd
 The interface of the application is organized in the following way.
There are three tabs - *Accounts*, *Budgets* and *Goals*. Each tab acts as a page which
presents the UI relating to accounts, budgets and goals.

#### Accounts Page

#### Budgets Page

#### Goals Page

## Database
