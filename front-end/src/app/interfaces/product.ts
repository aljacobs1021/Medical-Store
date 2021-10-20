import { Supplier } from './supplier'

export interface Product {
    productId: number;
    productName: string;
    description: string;
    supplier: Supplier;
    pricePerUnit: number;
    // might have to fix minLimit -> minimumLimit
    currentStock: number;
    minLimit: number;
    totalSold: number;
}