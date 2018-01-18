package com.accolite.jdbc;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private int Salary;
	
	@OneToOne
	private Laptop laptop;
	
	@OneToMany
	private List<Expenses> exp = new ArrayList<Expenses>();
	
	
	public List<Expenses> getExpenses() {
		return exp;
	}
	public void setExpenses(List<Expenses> exp) {
		this.exp = exp;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	

}