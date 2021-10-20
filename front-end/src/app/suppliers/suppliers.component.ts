import { Component, OnInit } from '@angular/core';

import { Supplier } from '../interfaces/supplier';
import { SupplierService } from '../services/supplier.service';

@Component({
  selector: 'app-suppliers',
  templateUrl: './suppliers.component.html',
  styleUrls: ['./suppliers.component.css']
})
export class SuppliersComponent implements OnInit {

  suppliers: Supplier[] = [];

  constructor(private supplierService: SupplierService) { }

  ngOnInit(): void {
    this.getSuppliers();
  }

  getSuppliers() {
    this.supplierService.getAllSuppliers() 
      .subscribe(suppliers => {
        this.suppliers = suppliers;
      })
  }
}
