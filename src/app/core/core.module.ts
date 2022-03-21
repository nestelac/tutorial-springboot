import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
//NE{{
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { RouterModule } from '@angular/router';
import { DialogConfirmationComponent } from './dialog-confirmation/dialog-confirmation.component';
//}}

@NgModule({
  declarations: [
    HeaderComponent,
    DialogConfirmationComponent
  ],
  imports: [
    CommonModule,
    //NE{{
    RouterModule,
    MatIconModule,
    MatToolbarModule,
    //}}
  ],
  //NE{{
  exports:[
    HeaderComponent,
  ]
  //}}
})
export class CoreModule { }
