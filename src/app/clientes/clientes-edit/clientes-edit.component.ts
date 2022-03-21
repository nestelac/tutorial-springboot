import { Component, OnInit, Inject } from '@angular/core';

//NE{{
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ClientesService } from '../clientes.service';
import { Clientes } from '../model/Clientes';
//}}

@Component({
  selector: 'app-clientes-edit',
  templateUrl: './clientes-edit.component.html',
  styleUrls: ['./clientes-edit.component.scss']
})
export class ClientesEditComponent implements OnInit {

  //NE{{
  clientes : Clientes;

  constructor(
    public dialogRef: MatDialogRef<ClientesEditComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private clientesService: ClientesService
  ) { }

  ngOnInit(): void {
    if (this.data.clientes != null){
      this.clientes = Object.assign({}, this.data.clientes);
    }else{
      this.clientes = new Clientes();
    }
  }

  onSave(){
    this.clientesService.saveClientes(this.clientes).subscribe(result => {
      this.dialogRef.close();
    });
  }

  onClose(){
    this.dialogRef.close();
  }
  //}}
}
