import { Component, OnInit } from '@angular/core';
import { Transaction } from '../interfaces/transaction';
import { TransactionService } from '../services/transaction.service';
import { Customer } from '../interfaces/customer';
import { CustomerService } from '../services/customer.service';
import { jsPDF } from 'jspdf';
import html2canvas from 'html2canvas';

@Component({
  selector: 'app-invoice-details',
  templateUrl: './invoice-details.component.html',
  styleUrls: ['./invoice-details.component.css']
})
export class InvoiceDetailsComponent implements OnInit {

  

  filteredTransactions: Transaction[] = []
  total: number = 0

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
        this.findSum();
      })
  }

  download(){
    var element = document.getElementById('pdfTable')!;
    html2canvas(element).then((canvas) => {
      console.log(canvas);
      var imgData = canvas.toDataURL('image/png')
      var doc = new jsPDF();

      var imgHeight = canvas.height * 180 / canvas.width;

      doc.addImage(imgData, 0, 0, 208, imgHeight)

      doc.save("image.pdf");
    })
  }

  findSum() {
    for(let i = 0; i < this.filteredTransactions.length; i++) {
      this.total += (this.filteredTransactions[i].product.pricePerUnit * this.filteredTransactions[i].quantity);
    }
    console.log(this.total)
  }

  setZero() {
    this.total = 0;
  }


}
