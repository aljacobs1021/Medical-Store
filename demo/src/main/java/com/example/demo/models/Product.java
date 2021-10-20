package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prod_id")
	private int productId;
	
	@Column (name="prod_name", nullable = false) 
	private String productName; // product name
	
	@Column (name="prod_description", nullable = false)
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="supplier_id", nullable = false)
	private Supplier supplier;
	
	@Column (name="price", nullable = false)
	private double pricePerUnit;
	
	@Column(name="current_stock", nullable=false)
	private int currentStock;
	
	@Column(name="min_limit", nullable=false)
	private int minLimit;
	
	@Column(name="total_sold", nullable=false)
	private double totalSold;
	
	public Product() {}
	
	public Product(int productId, String productName, String description, double pricePerUnit, int currentStock,
			int minLimit, double totalSold) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.pricePerUnit = pricePerUnit;
		this.currentStock = currentStock;
		this.minLimit = minLimit;
		this.totalSold = totalSold;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

	public double getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(double totalSold) {
		this.totalSold = totalSold;
	}
	
}
