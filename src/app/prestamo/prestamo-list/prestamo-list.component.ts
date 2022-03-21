import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PageEvent } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { DialogConfirmationComponent } from 'src/app/core/dialog-confirmation/dialog-confirmation.component';
import { Pageable2 } from 'src/app/prestamo/model/page/Pageable2';
import { PrestamoService } from '../prestamo.service';
import { Prestamo } from '../model/Prestamo';

@Component({
selector: 'app-prestamo-list',
templateUrl: './prestamo-list.component.html',
styleUrls: ['./prestamo-list.component.scss']
})
export class PrestamoListComponent implements OnInit {

    pageNumber: number = 0;
    pageSize: number = 5;
    totalElements: number = 0;

    dataSource = new MatTableDataSource<Prestamo>();
    displayedColumns: string[] = ['id', 'nameGam', 'nameCli', 'fechaPres', 'fechaDev'];

    constructor(
        private prestamoService: PrestamoService,
        public dialog: MatDialog,
    ) { }

    ngOnInit(): void {
        this.loadPage();
    }

    loadPage(event?: PageEvent) {

        let pageable2 : Pageable2 =  {
            pageNumber: this.pageNumber,
            pageSize: this.pageSize,
            sort: [{
                property: 'id',
                direction: 'ASC'
            }]
        }

        if (event != null) {
            pageable2.pageSize = event.pageSize
            pageable2.pageNumber = event.pageIndex;
        }

        this.prestamoService.getPrestamo(pageable2).subscribe(data => {
            this.dataSource.data = data.content;
            this.pageNumber = data.pageable2.pageNumber;
            this.pageSize = data.pageable2.pageSize;
            this.totalElements = data.totalElements;
        });

    }  

    deletePrestamo(prestamo: Prestamo) {    
        const dialogRef = this.dialog.open(DialogConfirmationComponent, {
            data: { title: "Eliminar prestamo", description: "Atención si borra el préstamo se perderán sus datos.<br> ¿Desea eliminar el préstamo?" }
        });

        dialogRef.afterClosed().subscribe(result => {
            if (result) {
                this.prestamoService.deletePrestamo(prestamo.id).subscribe(result =>  {
                    this.ngOnInit();
                }); 
            }
        });
    }  
}
