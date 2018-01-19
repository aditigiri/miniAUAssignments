package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import model.Student;

public class StudentDAO {

	private  Map<Integer,Student> studentList;
	static 
	{
	}
	
	@SuppressWarnings("deprecation")
	public StudentDAO() 
	{
		studentList=new HashMap<Integer,Student>();
		studentList.put(1,new Student(1, "Aditi", "Giri", "Gangtok", new Date(1996, 03, 04), 23453, 3, "IT"));
		studentList.put(2,new Student(2, "Sita", "Sharma", "Bangalore", new Date(1993, 05, 23), 34565, 4, "CSE"));
		studentList.put(3,new Student(3, "Preeti", "Das", "Bhopal", new Date(1992,04,12), 56764, 5, "ME"));
		studentList.put(4,new Student(4, "Bhim", "Bose", "Delhi", new Date(1994, 02, 21), 23454, 7, "CV"));
		studentList.put(5,new Student(5, "Raju", "Pallab", "Raipur", new Date(1994,01,22), 56786, 8, "EEE"));
	}

	public Student addStudent(Student student) 
	{
		if(studentList.get(student.getRollNo())!=null)
			return null;
		studentList.put(student.getRollNo(), student);
			return studentList.get(student.getRollNo());
	}

	public Student updateStudent(Student student) 
	{
		if(studentList.get(student.getRollNo())==null)
			return null;
		studentList.put(student.getRollNo(), student);	
		
		return studentList.get(student.getRollNo());

	}

	public Student getStudent(int rollNo) 
	{
		if(studentList.get(rollNo)==null)
			return null;
		return studentList.get(rollNo);
	}

	

	public Student deleteStudent(int rollNo) 
	{
		if(studentList.get(rollNo)==null)
			return null;
		Student stud=studentList.remove(rollNo);
			return stud;
	}

}
