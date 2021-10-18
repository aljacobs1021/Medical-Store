import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomersComponent } from './customers/customers.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EmployeesComponent } from './employees/employees.component';
import { InventoryComponent } from './inventory/inventory.component';
import { InvoiceDetailsComponent } from './invoice-details/invoice-details.component';
import { ReportsComponent } from './reports/reports.component';
import { SoldProductDetailsComponent } from './sold-product-details/sold-product-details.component';
import { SuppliersComponent } from './suppliers/suppliers.component';

const routes: Routes = [
  {path: 'dashboard', component: DashboardComponent},
  {path: 'inventory', component: InventoryComponent},
  {path: 'customers', component: CustomersComponent},
  {path: 'employees', component: EmployeesComponent},
  {path: 'invoice-details', component: InvoiceDetailsComponent},
  {path: 'sold-product-details', component: SoldProductDetailsComponent},
  {path: 'suppliers', component: SuppliersComponent},
  {path: 'reports', component: ReportsComponent},
  {path: '',   redirectTo: 'dashboard', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
