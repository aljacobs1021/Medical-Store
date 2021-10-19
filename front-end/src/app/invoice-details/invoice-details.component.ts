import { Component, OnInit } from '@angular/core';
import { Transaction } from '../interfaces/transaction';
import { TransactionService } from '../services/transaction.service';
import { Customer } from '../interfaces/customer';
import { CustomerService } from '../services/customer.service';


@Component({
  selector: 'app-invoice-details',
  templateUrl: './invoice-details.component.html',
  styleUrls: ['./invoice-details.component.css']
})
export class InvoiceDetailsComponent implements OnInit {

  

  filteredTransactions: Transaction[] = []

  constructor(private transactionService: TransactionService, 
              private customerService: CustomerService) {

   }

  ngOnInit(): void {
    this.getAllTransaction();

  }

  // onSelect(){

  //     this.filteredTransactions = this.filteredTransactions.filter(
  //       x => (x.customer.last == this.selected.last && x.customer.first == this.selected.first)
  //       )   

  // }

  getAllTransaction() {
    this.transactionService.getAllTransactions()
      .subscribe(transactions => {
        this.filteredTransactions = transactions;
      })
  }

  findByName(id: number) {
    this.transactionService.findByName(id)
      .subscribe(transactions => {
        this.filteredTransactions = transactions
      })
  }

}
