import { Component, OnInit } from '@angular/core';

import { Customer } from '../interfaces/customer';
import { CustomerService } from '../services/customer.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customers: Customer[] = [];

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.getCustomers();
  }

  getCustomers() {
    this.customerService.getAllCustomers()
      .subscribe(customers => {
        this.customers = customers;
      })
  }



}
