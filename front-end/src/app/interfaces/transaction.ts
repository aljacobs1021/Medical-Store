import { Product } from './product'
import { Customer } from './customer'
import { Employee } from './employee'

export interface Transaction {

    transactionId: number;
    customer: Customer;
    product: Product;
    employee: Employee;
    quantity: number;
    fulfilled: boolean;
    dateCreated: Date;
    datePaid?: Date;
}
