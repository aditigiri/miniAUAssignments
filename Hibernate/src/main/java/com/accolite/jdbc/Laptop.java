package com.accolite.jdbc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id 
	private int LaptopId;
	private String Brand;
	private String Price;
	
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		LaptopId = laptopId;
	}	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}

}