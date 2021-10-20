import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../interfaces/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  private baseUrl: string = "http://localhost:8080/product"

  constructor(private http: HttpClient) { }

  getAllSuppliers(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.baseUrl}getAll`);
  }
}
