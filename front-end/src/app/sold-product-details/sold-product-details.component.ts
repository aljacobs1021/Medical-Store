import { Component, OnInit } from '@angular/core';
import { Product } from '../interfaces/product';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-sold-product-details',
  templateUrl: './sold-product-details.component.html',
  styleUrls: ['./sold-product-details.component.css']
})
export class SoldProductDetailsComponent implements OnInit {

  products: Product[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts() {
    this.productService.getAllSuppliers()
      .subscribe(products => {
        this.products = products;
      })
  }
}
