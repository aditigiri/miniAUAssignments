package com.accolite.java.EmployeeForum.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.accolite.EmployeeForum.model.*;
import com.accolite.java.EmployeeForum.services.*;

@Path("employees")
public class EmployeeController {
		
	static EmployeeServices serviceObject = new EmployeeServices();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployeeDetails(){
		
		return serviceObject.getAllEmployees();
		
	}

	//http://localhost:8080/EmployeeForum/webapi/employees/1
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int id){
		
		return serviceObject.getEmployee(id);
		
	}
	
	
	@POST
	@Path("addEmployee")
	@Consumes({"application/xml", "application/json"})
	public String insertEmployee(Employee employee) {		
		System.out.println("inserting a new employee");
		
		return serviceObject.insert(employee);
	}
	
	@POST
	@Path("updateEmployee/{param1}/{param2}")
	@Consumes({"application/xml", "application/json"})
	public String updateEmployee(@PathParam("param1") int id,@PathParam("param2") String name){
		return serviceObject.update(id, name);
	}
	
	
	
	@POST
	@Path("deleteEmployee/{empId}")
	public String deleteEmployee(@PathParam("empId") int id){		
		return serviceObject.delete(id);
	}		

			
}
