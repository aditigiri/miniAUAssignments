package com.accolite.jdbc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expenses {
	
	@Id
	private int ExId;
	private int amount;
	
	
	public int getExId() {
		return ExId;
	}
	public void setExId(int exId) {
		ExId = exId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
