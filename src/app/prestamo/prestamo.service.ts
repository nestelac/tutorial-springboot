import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Pageable2 } from '../prestamo/model/page/Pageable2';
import { Prestamo } from './model/Prestamo';
import { PrestamoPage } from './model/PrestamoPage';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class PrestamoService {

    constructor(
        private http: HttpClient
    ) { }

    getPrestamo(pageable2: Pageable2): Observable<PrestamoPage> {
        return this.http.post<PrestamoPage>('http://8080/prestamo', {pageable2:pageable2})
    }

    savePrestamo(prestamo: Prestamo): Observable<void> {
        let url = 'http://localhost:8080/prestamo';
        if (prestamo.id != null) url += '/'+prestamo.id;
        return this.http.put<void>(url, prestamo);
        }

    deletePrestamo(idPrestamo : number): Observable<void> {
        return this.http.delete<void>('http://localhost:8080/prestamo/'+idPrestamo);
    }

    getAllPrestamo(): Observable<Prestamo[]>{
        return this.http.get<Prestamo[]>('http://localhost:8080/prestamo');
    }
}
