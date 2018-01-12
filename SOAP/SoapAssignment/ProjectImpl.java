package com.Accolite.SoapAssignment;

import java.util.*;

import javax.jws.WebService;

@WebService(endpointInterface = "com.Accolite.SoapAssignment.ProjectInterface")
public class ProjectImpl implements ProjectInterface{
	
	
	ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Aditi Giri", "Sita Sharma", "Gita Paul", "Ram Das"));
	
	@Override
	public String addName(String name) {
		
		nameList.add(name);
		
		return name + " added succesfully";
	}
	
	@Override
	public String deleteName(String name) {
		int ind = nameList.indexOf(name);
		nameList.remove(ind);
		return name +" deleted succesfully";
	}
	
	@Override
	public String updateName(String name1, String name2) {
		int ind = nameList.indexOf(name1);
		nameList.set(ind, name2);
		
		
		return name1 + " updated to " + name2;
	}
	
	@Override
	public String retrieveName(int ind) {
		return nameList.get(ind);
		
	}
	
}
