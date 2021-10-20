import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Transaction } from '../interfaces/transaction';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  private baseUrl: string = "http://localhost:8080/transaction/"

  constructor(private http: HttpClient) { }

  getAllTransactions(): Observable<Transaction[]>{
    return this.http.get<Transaction[]>(`${this.baseUrl}getAll`);
  }

  findByName(id: number): Observable<Transaction[]>{
    return this.http.get<Transaction[]>(`${this.baseUrl}findAllByCustomerId/`+ id)
  }
}
