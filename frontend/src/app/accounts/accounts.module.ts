import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountsRoutingModule } from './accounts-routing.module';
import { AccountsListComponent } from './accounts-list/accounts-list.component';


@NgModule({
    declarations: [
        AccountsListComponent
    ],
    exports: [
        AccountsListComponent
    ],
    imports: [
        CommonModule,
        AccountsRoutingModule
    ]
})
export class AccountsModule { }
