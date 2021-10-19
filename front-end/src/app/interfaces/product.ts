import { Supplier } from './supplier'

export interface Product {
    productId: number;
    productName: string;
    description: string;
    supplier: Supplier;
    pricePerUnit: number;
    currentStock: number;
    minimumLimit: number;
    totalSold: number;
}