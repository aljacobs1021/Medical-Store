import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SoldProductDetailsComponent } from './sold-product-details.component';

describe('SoldProductDetailsComponent', () => {
  let component: SoldProductDetailsComponent;
  let fixture: ComponentFixture<SoldProductDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SoldProductDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SoldProductDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
