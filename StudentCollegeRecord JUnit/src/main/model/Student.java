package model;

import java.util.Date;

public class Student 
{
	
	private String firstName;
	private String lastName;
	private int rollNo;
	private String address;
	private Date dob;
	private int contactNumber;
	private int semester;
	private String branch;

	
	public Student(int rollNo, String firstName, String lastName, String address, Date dob, int contactNumber, int semester,
			String branch) 
	{
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.semester = semester;
		this.branch = branch;
	}

	public int getRollNo() 
	{
		return rollNo;
	}


	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}


	public String getFname() 
	{
		return firstName;
	}


	public void setFname(String firstName) 
	{
		this.firstName = firstName;
	}


	public String getlastName() 
	{
		return lastName;
	}


	public void setlastName(String lastName) 
	{
		this.lastName = lastName;
	}


	public String getAddress() 
	{
		return address;
	}


	public void setAddress(String address) 
	{
		this.address = address;
	}


	public Date getDob() 
	{
		return dob;
	}


	public void setDob(Date dob) 
	{
		this.dob = dob;
	}


	public int getContactNo() 
	{
		return contactNumber;
	}


	public void setContactNo(int contactNumber) 
	{
		this.contactNumber = contactNumber;
	}


	public int getSemester() 
	{
		return semester;
	}


	public void setSemester(int semester) 
	{
		this.semester = semester;
	}


	public String getBranch() 
	{
		return branch;
	}


	public void setBranch(String branch) 
	{
		this.branch = branch;
	}

	public Student() 
	{
	}

}
