package com.Accolite.SoapAssignment;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface ProjectInterface {
	
	@WebMethod
	String addName(String name);
	
	@WebMethod
	String deleteName(String name);
	
	@WebMethod
	String updateName(String name1, String name2);
	
	@WebMethod
	public String retrieveName(int ind);
}
