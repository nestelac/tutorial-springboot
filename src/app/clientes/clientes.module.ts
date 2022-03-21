import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientesListComponent } from './clientes-list/clientes-list.component';
import { ClientesEditComponent } from './clientes-edit/clientes-edit.component';

//NE{{
import { MatTableModule } from '@angular/material/table';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';

import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
//}}

@NgModule({
  declarations: [
    ClientesListComponent,
    ClientesEditComponent
  ],
  imports: [
    CommonModule,
  //NE{{
    MatTableModule,
    MatIconModule,
    MatButtonModule,
    MatDialogModule,
    
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers:[
    {
      provide: MAT_DIALOG_DATA,
      useValue: {},
    },
  ]
  //}}

})
export class ClientesModule { }
