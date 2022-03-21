import { Component, OnInit } from '@angular/core';

//NE{{
import { MatTableDataSource } from '@angular/material/table';
import { Clientes } from '../model/Clientes';
import { ClientesService } from '../clientes.service';
import { MatDialog } from '@angular/material/dialog';
import { ClientesEditComponent } from '../clientes-edit/clientes-edit.component';
//}}

@Component({
  selector: 'app-clientes-list',
  templateUrl: './clientes-list.component.html',
  styleUrls: ['./clientes-list.component.scss']
})
export class ClientesListComponent implements OnInit {

  //NE{{
  dataSource = new MatTableDataSource<Clientes>();
  displayedColumns: string[] = ['id', 'name'];

  constructor(
    private clientesService: ClientesService,
    public dialog: MatDialog,
  ) { }

  ngOnInit(): void {
    this.clientesService.getClientes().subscribe(
      clientes => this.dataSource.data = clientes
    );
  }

  createClientes(){
    const dialogRef = this.dialog.open(ClientesEditComponent, {
      data: {}
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }

  editClientes(clientes: Clientes){
    const dialogRef = this.dialog.open(ClientesEditComponent, {
      data: { clientes: clientes }
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }

  deleteClientes(clientes: Clientes) {    
    const dialogRef = this.dialog.open(ClientesEditComponent, {
      data: { clientes: clientes }
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  } 
  //}}
}
