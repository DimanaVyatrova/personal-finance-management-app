# Personal Finance Management App :money_with_wings: :moneybag:
 Project for the Web Development with Java course @FMI. Made by Raya Simeonova and
Dimana Vyatrova.

## Starting the App :arrow_forward:
  The application uses a proxy for cross-origin communication between the frontend and the backend.
The proxy is configured in the <code>frontend/proxy.conf.json</code> file. In order to run the app you can either use the command 
<code>ng serve --proxy-config proxy.conf.json</code> or use the start button in your IDE.

## Functionality Overview :gear:

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
<code>ANNUALY</code> ,<code>WEEKLY</code>, <code>MONTHLY</code> and <code>QUARTERLY</code>.<br><br>
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
illustrates only the **functionalities** (UX design) of the app not its **visual design** (UI design).

## Implementation :factory:
 The project is divided into two folders - frontend and backend.
The backend is implemented using Java and Spring Boot. For the frontend we have used Angular.

### Backend :abacus:
The backend is organized using layered architecture. 
<li>Presentation Layer - REST Controllers for handling HTTP requests</li>
<li>Service Layer - Contains the business logic</li>
<li>Persistence Layer - Communication with the database using JPA Repository
interfaces</li>
<br>
The backend consists of the following packages:
<li><code>controller</code> - contains REST controllers implementing CRUD operations
based on GET, POST, PUT and DELETE HTTP methods.</li>
<li><code>dto</code> - defines object to which JSON strings will be matched </li>
<li><code>mapper</code> - convert DTOs to Entity and the other may around</li>
<li><code>model</code> - contains entities, implements database model</li>
<li><code>repository</code> - JPA Repository interfaces for communicating with the database</li>
<li><code>service</code> - contains the business logic of the application</li>

### FrontEnd :blossom:
 The interface of the application is organized in the following way.
There are three tabs - *Accounts*, *Budgets* and *Goals*. Each tab acts as a page which
presents the UI relating to accounts, budgets and goals.

#### Accounts Page
 In the accounts page users can  view their different checking accounts, 
 the transactions in each account, their savings account and investment accounts. They can also add new checking, 
savings and investment accounts as well as new transactions.

#### Budgets Page
 In the budgets page users can view their different budgets by using the sidebar menu. They can also add a new budget and delete an already existing one.

#### Goals Page
 The goals page has a very similar functionality to the budgets page. Users can
 view, add and delete their goals.

## Database


## Dependencies

### Frontend
<pre>
    "@angular/animations": "^16.2.0",
    "@angular/cdk": "^16.2.1",
    "@angular/common": "^16.2.0",
    "@angular/compiler": "^16.2.0",
    "@angular/core": "^16.2.0",
    "@angular/forms": "^16.2.0",
    "@angular/material": "^16.2.1",
    "@angular/platform-browser": "^16.2.0",
    "@angular/platform-browser-dynamic": "^16.2.0",
    "@angular/router": "^16.2.0",
    "rxjs": "~7.8.0",
    "tslib": "^2.3.0",
    "zone.js": "~0.13.0"</pre>

#### Angular dev dependencies
 <pre>
    "@angular-devkit/build-angular": "^16.2.0",
    "@angular/cli": "~16.2.0",
    "@angular/compiler-cli": "^16.2.0",
    "@types/jasmine": "~4.3.0",
    "jasmine-core": "~4.6.0",
    "karma": "~6.4.0",
    "karma-chrome-launcher": "~3.2.0",
    "karma-coverage": "~2.2.0",
    "karma-jasmine": "~5.1.0",
    "karma-jasmine-html-reporter": "~2.1.0",
    "typescript": "~5.1.3"</pre>   
