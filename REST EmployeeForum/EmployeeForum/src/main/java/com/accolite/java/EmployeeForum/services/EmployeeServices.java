package com.accolite.java.EmployeeForum.services;
import java.util.*;
import com.accolite.EmployeeForum.model.*;

public class EmployeeServices {
	
	static List<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeServices() {
		Employee n = new Employee();
		n.setId(1);
		n.setName("Aditi Giri");
		
		employeeList.add(n);
	}

	//http://localhost:8080/EmployeeForum/webapi/employees
	public List<Employee> getAllEmployees(){
		return employeeList;
	}
	
	////http://localhost:8080/EmployeeForum/webapi/employees/1
	public Employee getEmployee(int id){		
		//Optional<Employee> matchingObject = employeeList.stream().filter(p->p.getId() == id).findFirst();
		for(Employee e: employeeList ) {
			if(e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	
	public String insert(Employee employee){
		int id = employee.getId();
		for(Employee e: employeeList) {
			if(e.getId() == id){
				return "Employee with the same id " + id + " already exists. Enter valid id";
			}
		}
		
		employeeList.add(employee);
		return "Employee inserted with id:" + employee.getId();	
	}


	public String update(int id, String name) {
		for(Employee e: employeeList){
			if(e.getId() == id){
				
				e.setName(name);
				return "Name has been sucessfully added";
			}
		}
		
		return "Update is unsuccessfull!!\n There is n employee with id:" + id;
	}

	public String delete(int id) {
		
		Iterator<Employee> iterator = employeeList.iterator();
		
		while(iterator.hasNext())
		{
		    Employee e = iterator.next();
		    if (e.getId() == id)
		    {
		        iterator.remove();
		        return "Employee has been deleted with id:" + id;
		    }
		}
		return "There is no employee with ID: " + id;
	}
	
	
}
