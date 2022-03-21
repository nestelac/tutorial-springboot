import { Inject } from '@angular/core';
import { Component, OnInit } from '@angular/core';
//NE{{
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
//}}

@Component({
  selector: 'app-dialog-confirmation',
  templateUrl: './dialog-confirmation.component.html',
  styleUrls: ['./dialog-confirmation.component.scss']
})
export class DialogConfirmationComponent implements OnInit {

  //NE{{
  title: string;
  description: string;
  
  constructor(
    public dialogRef: MatDialogRef<DialogConfirmationComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any
  ) { }

  ngOnInit(): void {
    this.title = this.data.title;
    this.description = this.data.description;
  }

  onYes(){
    this.dialogRef.close(false);
  }

  onNo(){
    this.dialogRef.close(false);
  }
  //}}
}
