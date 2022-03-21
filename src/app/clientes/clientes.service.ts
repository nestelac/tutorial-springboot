import { Injectable } from '@angular/core';

//NE{{
import { Observable, of } from 'rxjs';
import { Clientes } from './model/Clientes';
import { HttpClient } from '@angular/common/http';
//}}

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  //NE{{
  constructor(
    private http: HttpClient
  ) { }

  getClientes(): Observable<Clientes[]>{
    return this.http.get<Clientes[]>('http://localhost:8080/category');
  }

  saveClientes(clientes: Clientes): Observable<Clientes>{
    let url = 'http://localhost:8080/category';
    if (clientes.id != null) url += '/'+clientes.id;
    return this.http.put<Clientes>(url, clientes);
  }

  deleteClientes(idClientes : number): Observable<any>{
    return this.http.delete('http://localhost:8080/clientes/'+idClientes);
  }
  //}}
}
